package step3;

import java.util.Scanner;

/*
 * 백준 10950 A+B -3
 * 
 * 정수 A와 B를 입력 받고, A+B 출력
 * 
 * 첫 줄에 테스트 케이스의 개수 T 
 * -> T를 입력 받으면 T번의 A + B를 해라
 * 
 * 0 < A, B < 10
 */

public class Main02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i =1; i<=T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("%s\n", a+b);
		}
		sc.close();
	}
}
