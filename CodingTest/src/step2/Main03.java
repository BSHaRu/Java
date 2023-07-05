package step2;

import java.util.Scanner;

/*
 * 연도가 주어졌을 때 윤년이면 1, 아니면 0 출력
 * 
 * 윤년은 연도가 4의 배수 && (!100의 배수 || 400의 배수)
 *  ex) 2012년 -> 4의 배수 && !100의 배수 
 *  1900년 -> 100의 배수 && !400의 배수
 *  
 *  연도는 1 <= year <= 4000 자연수
 */

public class Main03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}
