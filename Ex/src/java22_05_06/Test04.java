package java22_05_06;

/*
 * String class method 활용해서 출력
 * 
 * 결과값
 *	System.out.println("입력받은 문자 : "); // 입력값 출력
 *	System.out.println("영어문자 : "); // ture & false
 *	System.out.println("숫자 : "); // ture & false
 */

public class Test04 {
	public static void main(String[] args) {
		
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String num = "123456789";
		
		System.out.print("문자나 숫자를 입력하세요 : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String str = sc.next();
		System.out.println("입력받은 문자 : " + str); // 입력값 출력
		str = str.toLowerCase();
		
		//코드 작성
		/*
		if(chars.indexOf(str) != -1 || num.indexOf(str) != -1 ) {
			System.out.println("영어문자 : " + chars.contains(str)); 
			System.out.println("숫자 : " + num.contains(str)); 
		} else if(chars.indexOf(str) != -1) {
			System.out.println("영어문자 : " + chars.contains(str)); 
			System.out.println("숫자 : " + num.contains(str)); 
		} else if (num.indexOf(str) != -1) {
			System.out.println("영어문자 : " + chars.contains(str)); 
			System.out.println("숫자 : " + num.contains(str)); 
		} else {
			System.out.println("영어문자 : " + chars.contains(str)); 
			System.out.println("숫자 : " + num.contains(str)); 
		}
		*/
		
		boolean isChecked = (chars.indexOf(str) != -1) ? true : false;
		System.out.println("영어문자 : " + isChecked);
		
		isChecked = num.contains(str);
		System.out.println("숫자 : " + isChecked);
		
		sc.close();
	} // main end
	
}
