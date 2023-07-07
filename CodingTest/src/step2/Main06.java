package step2;

import java.util.Scanner;

/*
 * 백준 2525번 오븐시계
 * 
 * 첫째 줄에는 현재 시각
 * 현재 시각 -> 시 : (0<=H<=23), 분(0<=m<=59)정수
 * 두 번째 줄에는 요리하는데 필요한 시간 (0<=x<=1000)분 단위
 * 
 * 출력
 * 첫째 줄 종료되는 시각의 시와 분을 공백을 사이에 두고 출력
 *  - 시, 분은 정수
 *  - 디지털 시계는 23시 59분에서 1분지나면 0시 0분
 *  
 *  Ex)
 *  입력 14 30	|	17 40	|	23	48
 *  x :	20		|	80		|	25
 *  출력 14 50	|	19  0	|	 0	13
 */

public class Main06 {

	public static void main(String[] args) {
		
		// 1. H : 시 | m : 분 | x : 걸리는 시간
		// 2. (m + x) > 60 -> H += (x / 60); , m = x - ((x / 60)*60);
		// 3. m == 60 -> H+1, m=0;
		// 4. H == 24 -> H = 0;

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		
		if(m >= 0) {
			m = m+x;
			if(m >= 60) {
				H += (m / 60);
				m = m - ((m / 60)) * 60;
				if(m == 60)	m = 0;
				if(H >= 24) H -= 24;
				System.out.printf("%s %s", H, m);
			} else {
				if(H >= 24) H -= 24;
				System.out.printf("%s %s", H, m);
			}
		} // m > 0 end
		sc.close();
	}
}
