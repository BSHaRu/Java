package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.26
 * 내용 : Java Throws 실습
 */

public class ThrowsEx {
	
	public static void main(String[] args) {
		try {
			myMethod1(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	
	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n2 = sc.nextInt();
		
		int result = n1 / n2;
		
		System.out.println("result : " + result);
		sc.close();
	}
	
}
