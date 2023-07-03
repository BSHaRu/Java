package step1;

import java.util.Scanner;

/*
 * (A+B) % C == ((A%C) + (B%C))%C가 true?
 * (A*B) % C == ((A%C) * (B%C))%C가 true?
 *  순서는 A, B ,C
 *  (2<= A,B,C <= 10000)
 *  
 *  ex)5 , 8 , 4일 때
 *  출력 값 : 1 1 0 0
 */

public class BaekJoonTest09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((A+B) % C == ((A%C) + (B%C))%C) {
			int a = (A*B) % C;
			int b = ((A%C) * (B%C))%C;
			a = b;
		}
		
		// 첫째 줄 (A+B)%C
		System.out.println((A+B)%C);
		
		// 둘째 줄 ((A%C) + (B%C))% C
		System.out.println(((A%C) + (B%C))% C);
		
		// 셋째 줄 (A*B) % C
		System.out.println((A*B) % C);
		
		// 넷째 줄 ((A%C) * (B%C)) % C
		System.out.println(((A%C) * (B%C)) % C);
		sc.close();
	}

}
