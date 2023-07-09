package step2;

import java.util.Scanner;

/*
 * 백준 2480 주사위 세계
 * 
 * 1~6의 눈을 가진 주사위 3번 던짐
 *  1. 같은 눈이 3개 나오면 10,000원 + (같은눈 * 1,000원)
 *  2. 같은 눈이 2개만 나오면 1,000원 + (같은눈 * 100원)
 *  3. 모두 다른 눈이 나오는 경우 그 중 가장 큰 눈 * 100원
 *  
 *  3개 주사위의 나온 눈이 주어질 때 상금 계산 프로그램 작성
 *  
 *  입력 3 3 6	| 2 2 2	| 6 2 5
 *  출력 1300	| 12000 | 600
 */

public class Main07 {

	public static void xyz(int x, int y, int z) {
		if (x == y)
			System.out.println(10000 + (x * 1000));
		else if(x == z)
			System.out.println(1000 + (x * 100));
		else
			System.out.println(1000 + (y * 100));
	}

	public static void abc(int a, int b, int c) {
		if (a != b && a != c && b != c) {
			if (a > b && a > c)
				System.out.println(a * 100);
			else if (b > a && b > c)
				System.out.println(b * 100);
			else
				System.out.println(c * 100);
		}
	}

	public static void main(String[] args) {

		// random으로 받으면 안되고, 입력해서 받아야된다고함
//		List<Integer> list = new ArrayList<>();
//		for(int i=0; i<3; i++) {
//			list.add((int)(Math.random()*6)+1);
//		}
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		System.out.printf("%s %s %s ", a,b,c);

		if (a == b)
			xyz(b, c ,a);
		else if (a == c)
			xyz(a, b, c);
		else if (b == c)
			xyz(a, c, b);
		else
			abc(a, b, c);

		sc.close();

	} // main end
}
