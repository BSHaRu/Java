package javaio.file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Workspace";
		
		File file = new File(path);
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		}else {
			System.out.println(file.getName());
		}// if end
		
	} // main end

}
