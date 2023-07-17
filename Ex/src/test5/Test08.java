package test5;

/*
 * 날짜 : 2023.07.17
 * 내용 : 자바 총정리 연습문제
 */

public class Test08 {

	public static void main(String[] args) {
		
		for(int y = 1; y <= 9; y++) {
			for(int x = 2; x <= 9; x++) {
				// %숫자d를 주면 해당 숫자만큼 우측 정렬로 출력
				System.out.printf("%d x %d = %2d \t", x, y, x*y);
			}
			System.out.println();
		}
		
		
	}
}
