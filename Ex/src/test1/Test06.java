package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.13
 * 내용 : 자바 삼항연산자 연습문제 
 */

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		// 대입 연산자는 변수가 있어야 되고, 변수는 혼자 못쓰니 타입을 정해준다
		// -> 타입은 조건 결과값에 따름
		// 타입  변수  대입  조건      true           false
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
	}

}
