package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2023.06.29
 * 내용 : Java 버퍼 입출력 스트림 실습
 * 
 * 보조 스트림(버퍼)
 * 	- 기본 입출력 스트림 Buffer를 장착해서 빠른 입출력을 지원하는 보조스트림
 * 
 */
public class BufferIOTest {

	public static void main(String[] args) {
		String path = "C:\\Users\\Java\\Desktop\\workspace.zip";
		String target = "C:\\Users\\Java\\Desktop\\workspace2.zip"; 
	
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int data = bis.read();
				
				if(data == -1) {
					break;
				}
				
				bos.write(data);
			}
			
			bis.close();
			// flush : 버퍼 비우기
			// -> os만 있다네
			bos.flush();
			bos.close();
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 생성 실패 : " + e.getMessage());
		}
		
		System.out.println("프로그램 종료...");
		
	}

}
