package step2;

import java.util.Scanner;

/*
 * 사분면에 속하는지 알아내는 문제
 * x,y가 모두 양수면 1사분면
 * -x, y면 2사분면
 * -x, -y면 3사분면
 * x, -y면 4사분면 
 * 
 * 첫 줄에 정수 x,
 * 둘째줄에 정수 y
 * x,y는 0이 아님
 * 
 * 출력
 * -> 해당 x,y값에 맞는 사분면 번호를 출력(1,2,3,4)
 */

public class Main04 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if ( x < 0 && y > 0) {
			System.out.println(2);
		} else if ( x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		sc.close();
	}
}
