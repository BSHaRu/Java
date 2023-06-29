package javaio.is;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		InputStream in = null;
		
		try {
			int data = in.read();
		} catch (IOException e) {
			System.out.println("io 오류 : " + e);
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("io 오류2 : " + e);
			}
		}
	}

}
