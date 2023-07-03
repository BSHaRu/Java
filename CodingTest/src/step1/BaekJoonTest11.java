package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A + B + C
 * 77 + 77 + 7777
 * 첫 번 째 줄에 A, B, C(1<= A, B, C <= 10^12)이 
 * 공백을 사이에 두고 주어진다.
 */

public class BaekJoonTest11 {

	public static void main(String[] args) {
		
		try(BufferedReader br 
				= new BufferedReader(
						new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			long A = Long.parseLong(str[0]);
			long B = Long.parseLong(str[1]);
			long C = Long.parseLong(str[2]);
			
//			System.out.println("0 : " + A);
//			System.out.println("0 : " + B);
//			System.out.println("0 : " + C);
			
			System.out.print(A+B+C);
		} catch (IOException e) {
			e.getMessage();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
		
	} // main end

}
