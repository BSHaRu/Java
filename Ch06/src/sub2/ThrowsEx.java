package sub2;

import java.util.Scanner;

/*
 * ��¥ : 2023.06.26
 * ���� : Java Throws �ǽ�
 */

public class ThrowsEx {
	
	public static void main(String[] args) {
		try {
			myMethod1(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	}
	
	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
	}
	
	public static void myMethod2(int n1) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n2 = sc.nextInt();
		
		int result = n1 / n2;
		
		System.out.println("result : " + result);
		sc.close();
	}
	
}
