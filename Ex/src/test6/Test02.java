package test6;

import java.util.Scanner;

/*
 * 날짜 : 2023.07.18
 * 내용 : 자바 총정리 연습문제
 * 
 * 
 * Q.파이 값을 구해라
 * 	원주율 공식
 *  - 파이 = 4 * (1/1 - 1/3 + 1/5 - 1/7 ...)
 *  - 항 수가 늘어날 수록 정확도가 높아진다.
 */

public class Test02 {

	public static void main(String[] args) {
				
		// 1. x/y, 반복
		// 2. x = 1 고정값; y = x + 2으로 변동;
		// 3. 짝수번째 y는 -, 홀수번째 y는 +
		// 4. 몇 번 반복 할 것인가는 사용자 입력값 받음
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 0.0;
		System.out.print("몇 번 반복하겠습니까?");
		int count = sc.nextInt();
		
		for(int a = 0; a < count; a++) {
			pi += (a % 2 == 0 ? 1 : -1) * 4.0 / (2 * a + 1);
			System.out.printf("%,8d회의 pi값 : %10f \n", a+1, pi );
		}
		sc.close();
	} // main end
}
