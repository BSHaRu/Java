package step1;

import java.util.Scanner;

public class BaekJoonTest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b; 
		int rest = a % b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rest);
		
		sc.close();
	}

}
