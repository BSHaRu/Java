package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 백준 11021 A+B -7
 * 
 * 두 정수 a+b입력받고 출력
 * 
 * 첫 줄 : 테스트 개수 T
 * 한 줄씩 이루어져 있고, 0<a,b<10으로 계산
 * 
 * 출력 : 케이스마다 "Case #x: "를 출력하고 A+B를 출력
 * 테스트 케이스는 1번부터 시작
 * 
 */

public class Main07 {

	public static void main(String[] args) throws Exception {

		BufferedReader br
			= new BufferedReader(
					new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =1; i <=t; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.printf("Case #%s: %s\n",i,a+b);
		}
		br.close();
	}
}
