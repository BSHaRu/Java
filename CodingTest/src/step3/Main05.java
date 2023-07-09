package step3;

import java.util.Scanner;

/*
 *  백준 25314 코딩은 체육과목
 *  
 *  int 앞에 long이 붙을 때 마다 4byte씩 저장공간 늘어남
 *  ex)
 *  long long int = 8byte
 *  long long long int = 12byte ...
 *  
 *  정수 N을 입력 받아서 해당 출력 하기
 *  4<= N <= 1000, N은 4의 배수
 *  
 *  입력 : 4			|	20
 *  출력 : long int	| long long long long long int
 */

public class Main05 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n/4; i++) {
			if(n % 4 == 0 && n <= 1000) {
				sb.append("long ");
			}
		}
		System.out.println(sb+"int");
		sc.close();
	}
}
