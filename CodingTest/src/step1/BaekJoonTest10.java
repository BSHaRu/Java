package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 세 자리 수 * 세 자리 수
 * 			4 7 2		(1)
 * 		  * 3 8 5		(2)
 * ----------------
 * 		  2 3 6 0 		(3)
 * 		3 7 7 6			(4)
 * 	  1 4 1 6			(5)
 * ----------------
 * 	  1 8 1 7 2 0		(6)
 * 
 * Q. (1), (2)는 세 자리 자연수 들어갈 때
 * (3), (4), (5), (6)에 들어가는 값을 구하는 프로그램 작성
 */

public class BaekJoonTest10 {

	public static void main(String[] args) {
		BufferedReader br 
			= new BufferedReader(
				new InputStreamReader(System.in));
		// 값을 문자로 받아서 (2)경우 index로 접근해서
		// 하나씩 꺼낸 다음 *100, *10 하는 형식으로 찾을거임
		
		int a = 0;
		int b = 0; 
		
		try {
			String str1 = br.readLine();
			String str2 = br.readLine();
			a = Integer.parseInt(str1);
			
			// ASCII 코드값에서 - '0'을 해줘야 
			// int로 변환할 때 해당 값이 제대로 나옴
			int result1 = str2.charAt(0) - '0';
			int result2 = str2.charAt(1) - '0';
			int result3 = str2.charAt(2) - '0';
			b = (result1 * 100) + (result2 * 10) + result3;
//			System.out.println("re 1 : " + result1);
//			System.out.println("re 2 : " + result2);
//			System.out.println("re 3 : " + result3);
//			System.out.println("b : " + b);
			
			// (3)
			System.out.println(a * result3);
			
			// (4)
			System.out.println(a * result2);
			
			// (5)
			System.out.println(a * result1);
			
			// (6)
			System.out.println(a * b);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	} // main end

}
