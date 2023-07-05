package step2;

import java.util.Scanner;

/*
 * 시험점수를 입력받아 90~100점은 A
 * 80~89점은 B
 * 70~79점은 C
 * 60~69점은 D
 * 나머지는 F
 *
 * 점수는 0<=x<=100 정수값
 *
 */

public class Main02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char c;
		
		if(n >= 90) {
			c = 'A';
		}else if (90 > n && n >= 80) {
			c = 'B';
		}else if (80 > n && n >= 70) {
			c = 'C';
		}else if (70 > n && n >= 60) {
			c = 'D';
		}else {
			c = 'F';
		}
		System.out.println(c);
		sc.close();
	}
}
