package java22_05_06;

import java.util.Scanner;

/*
 * 사용자에게 문자열을 입력받고 
 * "java"라는 문자열이 입력받은 문자열에 존재할 때
 * 프로그램 종료
 * "java"라는 문자열이 존재 하지 않을 때는
 * 다시 문자열을 입력받아 확인 할 수 있도록 코드 작성 * 
 */

public class Test03 {
	public static void main(String[] args) {
		
		String java = "java";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해 주세요>>");
			String str = sc.next();
			
			if(str.equals(java)) {
				System.out.println("> java가 존재합니다.");
				System.err.println("> 시스템을 종료합니다.");
				break;
			}else {
				System.out.println("> java가 존재 하지 않습니다.");
				continue;
			} // if end
		}// while end
		sc.close();
	} // main end
	
}
