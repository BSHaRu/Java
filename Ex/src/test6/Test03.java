package test6;

/*
 * 날짜 : 2023.07.18
 * 내용 : 자바 총정리 연습문제
 * 
 * 1. 하루에 원금 + 1천원씩 저금 하기로 함
 * 2. 첫 날에는 1천원 저금함
 * ex) 	1일차 : 1천원 	 	| 총액 : 1,000원
 * 		2일차 : 1천원 + 1천원	| 총액 : 3,000원 
 * 		3일차 : 3천원 + 1천원 	| 총액 : 7,000원
 * 		4일차 : 7천원 + 1천원 	| 총액 : 15,000원
 * ....
 * 
 * Q. 10일차까지 모두 출력 하고, 총액이 얼만지 구하시오.
 * 
 */

public class Test03 {

	public static void main(String[] args) {
		int sum = 0;
		int days = 1;
		int money = 1000;
		
		for(int i = 0; i < 10; i++) {
			sum += money;
			System.out.printf("%2d일차 : %,8d sum = %,9d\n",
					days, money, sum);
			days++;
			money = sum + 1000;
		}
		System.out.printf("%d일차에 %,d원이 됩니다.", days, sum);
	} // main end
}
