package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2023.07.06
 * 내용 : HTTP 통신 실습
 */

public class HttpTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
			
			br = new BufferedReader(
					new InputStreamReader(url.openStream()));
			// 현재 폴더(현재 패키지)에 파일 생성
			fos = new FileOutputStream("./Result.txt");
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				
				// 여기서 우리가 만든 파일에 html 태그가 써지는거임
				fos.write(line.getBytes());
			}
			br.close();
			fos.close();
		} catch (MalformedURLException e) {
			System.out.println("URL :" +e.getMessage());
		} catch (IOException e) {
			System.out.println("url.openStream : " + e.getMessage());
		}

		System.err.println("프로그램 종료");
	}

}
