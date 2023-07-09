package step3;

import java.util.Scanner;

/*
 * 백준 25304 영수증
 * 
 * 첫 줄 : 영수증 적힌 총 금액 x
 * 둘째 줄 : 영수증에 적힌 구매한 물건의 종류 수 n
 * 
 * 출력
 * - 구매한 물건 가격 개수로 계산
 * -> 총금액이 영수증과 일치하면 Yes, 아니면 No
 * 
 * 1<=x<=1,000,000,000
 * 1<=n<=100
 * 1<=a<=1,000,000
 * 1<=b<10
 */

public class Main04 {

	public static void main(String[] args) {
		
		// 총 금액 x | 종류 n | 가격 a | 개수 b
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i =0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a*b;
		}
		
		if(x == sum)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
