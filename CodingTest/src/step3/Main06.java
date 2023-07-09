package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 백준 15552 빠른 A+B
 * 
 * BufferedReader와 BufferedWriter 사용
 * -> BufferedWriter.flush는 맨 마지막 한번만 사용
 * 
 * 첫 줄 : T번 반복 (0 < T <=1,000,000)
 * 다음 줄 : 정수 A,B ( 1 <= A,B <= 1,000)
 * 
 *  A + B 출력
 * 
 * 시간제한 1.5s
 */
public class Main06 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br 
			= new BufferedReader(
				new InputStreamReader(System.in));
		
		BufferedWriter bw 
			= new BufferedWriter(
					new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			// split보다는 StringTokenizer가 속도면에서 더빠르다.
			// split은 정규식으로 조건들을 검사를 다 하지만,
			// StringTokenizer는 조건 없이 순수 공백을 제거함
			// +@ 생각보다 StringBulider로 출력해도 속도가 빠르다.
			// but bw가 입출력 최적화되어 있어서 bw가 더 빠름 
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			bw.write(a+b+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
