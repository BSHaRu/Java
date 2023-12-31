package javaio.file;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용법 : java FileInfo 파일이름");
			// return이랑 비슷 
			// -> exit는 어디에 있던 해당 프로그램 종료
			System.exit(0); 
		}
		
		File f = new File(args[0]);
		if(f.exists()) {
			//파일이 존재 할 경우
			System.out.println("length : " + f.length());
			System.out.println("canRead : " + f.canRead());
			System.out.println("canWrite : " + f.canWrite());
			System.out.println("getAbsolutePath : " + f.getAbsolutePath());
			
			try {
				System.out.println("getCanonicalPath : " +f.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			};
			System.out.println("getName : " + f.getName());
			System.out.println("getParent : " + f.getParent());
			System.out.println("getPath : " + f.getPath());
			
		} else{
			System.out.println("파일이 존재하지 않습니다.");
		} // if end
		
	} // main end

}
