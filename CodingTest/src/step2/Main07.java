package step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<3; i++) {
			list.add((int)(Math.random()*6)+1);
		}
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		// 주사위값은 넣었어
		// 이걸 오름차순으로 꺼내
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(a == b) {
			if (b == c) System.out.println(10000+(c*1000));
			else System.out.println(1000+(b*100));
		} else if(a == c) {
			
		}
	}

}
