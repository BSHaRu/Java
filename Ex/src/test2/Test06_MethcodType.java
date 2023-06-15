package test2;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.15
 * 내용 : 자바 메서드 연습문제 
 */

public class Test06_MethcodType {

	public static void intro() {
		System.out.println("******** Start ********");
		System.out.println("두개의 정수 입력");
	}
	
	public static int input(Scanner sc, String name) {
		System.out.print("변수 " + name + " 값을 입력 : " );
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈 결과 : " + val);
		System.out.println("******** End ********");
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a = input(sc, "a");
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
		
	}

}
