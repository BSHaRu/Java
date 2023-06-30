package java22_05_06;

/*
 * String class method 활용해서 출력
 */

public class Test04 {
	public static void main(String[] args) {
		
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "123456789";
		
		System.out.print("문자나 숫자를 입력하세요 : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String str = sc.next();
		//코드 작성
		
		
		// 결과값
		System.out.println("입력받은 문자 : "); // 입력값 출력
		System.out.println("영어문자 : "); // ture & false
		System.out.println("숫자 : "); // ture & false
		sc.close();
	}
	
}
