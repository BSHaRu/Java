package minipj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 파일에서 List<User>정보를 저장하거나 읽어오는 기능
 */

public class UserDAO {
	private String filename;

	public UserDAO(String filename) {
		this.filename = filename;
	}
	
	public void saveUser(Iterator<User> iter) {
		List<User> users = new ArrayList<>();
		while(iter.hasNext()) {
			User user = iter.next();
			users.add(user);
		}
		try(ObjectOutputStream oos =
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(filename)))){
			oos.writeObject(users);
		}catch(Exception e) {
			System.out.println("saveUser() : " + e.getMessage());
		}
	}
	
	public List<User> getUser(){
		File file = new File(filename);
		if(!file.exists()) {
			return new ArrayList<>();
		}
		
		List<User> list = null;
		try(ObjectInputStream ois =
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(filename)))){
			
			list = (List<User>) ois.readObject();
		}catch(Exception e) {
			System.out.println("getUser() : " + e.getMessage());
		}
		
		return list;
	}
}
