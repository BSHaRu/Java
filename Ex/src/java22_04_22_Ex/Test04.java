package java22_04_22_Ex;

import java.util.Scanner;

// 직각 삼각형 찍기 
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력하세요 > ");
		
		int a = sc.nextInt();
		int b = a+1;
		
		int arr[][] = new int[a][b];
		
		for(a=0; a <= arr.length; a++) {
			for(b=a+1; b <= arr.length; b++) {
				System.out.print(a); // 역방향으로 나오긴하는데 이거 어케 바꿔줘야함?
			}
			System.out.println(); 
		}
	}
}
