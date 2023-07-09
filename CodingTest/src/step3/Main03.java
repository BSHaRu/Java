package step3;

import java.util.Scanner;

/*
 * 백준 8393 합
 * 
 * 1<=n<=10,000 
 * 1~ n까지 합을 구해라
 */

public class Main03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
