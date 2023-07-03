package step1;

import java.util.Scanner;

/*
 * 불기 연도를 서기 연도로 바꿔주는 프로그램 작성
 * - 서기 연도를 알아보고 싶은 불기 연도 y (1000 <= y <= 3000)
 * - 불기 연도 2541 -> 서기 1998 
 */

public class BaekJoonTest08 {

	public static void main(String[] args) {
	
		int y = 2541 - 1998;
//		System.out.println("서기와 불기 차이 : " + y);
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt(); // 불기값 받기
		System.out.println(year - y); // 서기 계산
		
		sc.close();
	}

}
