package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 백준 11022 A+B -8
 * 
 * 두 정수 a + b를 입력 받고 출력
 * 
 * 첫 줄 : 테스트 개수 T
 * 한 줄씩 이루어져 있고, 0<a,b<10으로 계산
 * 
 * "Case #x: A + B = C" 형식으로 출력한다. 
 * x는 테스트 케이스 번호이고 1부터 시작
 */

public class Main08 {

	public static void main(String[] args) throws Exception {
		BufferedReader br 
			=new BufferedReader(
					new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i <=t; i++) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.printf("Case #%s: %s + %s = %s\n",i,a,b,a+b);
		}
		br.close();
	}
}
