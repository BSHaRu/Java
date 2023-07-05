package step2;

import java.util.Scanner;

/*
 * 두 정수 A와 B를 비교하는 프로그램 작성
 */
public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("a값 > ");
		int a = sc.nextInt();
//		System.out.print("b값 > ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if (a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		sc.close();
	}
}
