package step3;

import java.util.Scanner;

/*
 * 백준 2739 구구단
 * 
 * N 입력 받고 구구단 N단을 출력하는 프로그램 작성
 * 
 * 1<=N <=9
 * 
 */

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.printf("%s * %s = %s\n", n, i, n*i);
		}
		
		sc.close();
	}

}
