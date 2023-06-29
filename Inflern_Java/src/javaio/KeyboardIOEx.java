package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOEx {
	// test라서 그냥 jvm에게 ex 던짐
	public static void main(String[] args) throws Exception {
		/*
		// 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력
		// 키보드 : System.in (InputStream 주인공)
		// 화면에 출력 : System.out (PrintStream 주인공)
		// 키보드로 입력 받는다 -> 문자를 입력 -> char단위 입출력
		// 	=> Reader, Writer를 써야됨
		// 한줄 읽기 : BufferedReader라는 클래스에 
		//		readLine이라는 메서드가 있음
		// 	-> 더이상 읽을것이 없으면(EOF) null 반환
		// 	-> 장식 => 주인공이 없으면 사용 불가능
		// 한줄 쓰기 : PrintStream, PrintWriter
		*/
		
		// BufferedReader -> 자기 자기기때문에 탈락
		// CharReader 	-> 한줄씩 입력 받기로 했는데 이친구는 문자열로 받아서 탈락
		// FilterReader -> 장식, Reader를 넣어줘야 탈락
		// InputStreamReader(InputStream in) -> 장식 
		BufferedReader br 
			= new BufferedReader(
				new InputStreamReader(System.in));
		
		String line = null;
		// 한줄씩 읽음
		while((line = br.readLine() ) != null) {
			System.out.println("읽어들인 값 : " + line);
		} 
		
	} // main end
}
