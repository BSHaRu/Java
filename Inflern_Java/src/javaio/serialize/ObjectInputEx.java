package javaio.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputEx {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\Java\\Desktop\\user.txt";
		
		ObjectInputStream ois 
			= new ObjectInputStream(
					new FileInputStream(path));
		
		User user = (User) ois.readObject();
		ois.close();
		System.out.println(user);
	}
	

}
