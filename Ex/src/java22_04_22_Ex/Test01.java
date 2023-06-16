package java22_04_22_Ex;

import java.util.Scanner;

// 평균 구하기
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int sum = 0;
		int average = 0;
		
		for(a = 1; a <6; a++) {
			System.out.print("성적을 입력하시오 : ");
			sum += sc.nextInt(); 
		}
		average = sum / 5; 
		System.out.printf("평균 성적은 %d입니다.", average);
	}

}
