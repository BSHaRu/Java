package test_01_Java_MSA;

import java.util.Scanner;

/*
 *       *
 *      **
 *     ***
 *  이런식으로 우측 정렬 상태로 별찍기
 *  (첫 번째 줄 부터 * 나와야됨)
 */

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력값 >");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			// 공백 찍기
			for(int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			
			// * 찍기
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
