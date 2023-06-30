package javaio.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputEx {
	public static void main(String[] args) throws Exception{
		User user = new User("a@a.aa", "hong", 1754);
		
		String path = "C:\\Users\\Java\\Desktop\\user.txt";
		
		ObjectOutputStream out
			= new ObjectOutputStream(
					new FileOutputStream(path));
		
		out.writeObject(user);
		out.close();
	}
}
