package test6;

/*
 * 날짜 : 2023.07.18
 * 내용 : 자바 총정리 연습문제
 * 
 * Q. 2부터 100 사이 소수를 모두 출력하고
 * 총 개수를 구해라
 *  -> 25개
 */

public class Test01 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 2; i <= 100; i++) {
			boolean isChecked = true;
			// 제곱근(square root)을 통해서 나누어 지는 수를 구함
			// -> i의 제곱근까지만 반복을 함
			// => 나누어 떨어지는 수가 있으면 i는 소수가 아님
			for(int j = 2; j * j <= i; j++) {
				// 즉, 소수가 아니면 false
				if(i % j == 0) {
					isChecked = false;
					break;
				}
			}
			// 소수일 경우 해당구문 실행
			if(isChecked) {
				count++;
				// count가 10개가 될 때 마다 개행처리 해줌
				System.out.printf("%2d %s", i, 
						count % 10 == 0 ? "\n" : "");
			}
		}
		System.out.println();
		System.out.printf("2~100의 소수의 총 개수는 : %d",count);
	}

}
