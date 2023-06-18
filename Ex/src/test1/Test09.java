package test1;

/*
 * 날짜 : 2023.06.13
 * 내용 : 자바 반복문 연습문제 (마름모 그리기)
 */

public class Test09 {

	public static void main(String[] args) {

		int count = 0; // *의 개수를 의미

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				count++; // 이등변 삼각형
			} else {
				count--; // 역 이등변 삼각형
			}
			
			// 공백 개수 정하기
			// j <= 5 - count : 공백 개수 제한
			for (int j = 1; j <= 5 - count; j++) {
				System.out.print(" ");
			}
			
			// count는 각 줄에 와야하는 *의 개수임!!
			// count 1 -> 2 * count - 1 = 1
			// count 2 -> 2 * count - 1 = 3 ...
			for (int k = 1; k <= 2 * count - 1; k++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

	}

}
