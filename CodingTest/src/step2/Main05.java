package step2;

import java.util.Scanner;

/*
 * 45분 일찍 일어나기
 * 
 * 첫째 줄에 정수 H와 M
 * (0<=H<=23, 0<=M<=59)
 * 상근이가 설정한 알람 시간 H시 M분
 * 
 * 0:0(자정), 23:59(다음날 자정 1분전)
 * 불필요한 0은 사용 하지 않음
 * 
 * 입력 10 10 	|	 0 30 	|	23 40	
 * 출력 	9 25	|	23 45	|	22 55
 * 
 */

public class Main05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();

		if(M >= 45) {
			if(H == 24) H = 0;
			System.out.printf("%s %s", H, M-45);
		}else if(M < 45 ) {
			if(H == 0) H = 24;
			System.out.printf("%s %s", H-1, M+15);
		}
		
		sc.close();
	}
}
