package java22_05_06;

import java.util.Arrays;
import java.util.Random;

/*
 * 1~100까지 난수 발생해 int형 배열에 10개 담기
 * 그냥 출력 + 오름차순 정렬 2개 보여주기
 */

public class Test01 {

	public static void main(String[] args) {

		int[] arry = new int[10];
		
		Random ran = new Random();
		
		System.out.print("최초의 리스트 :");
		for(int i = 0; i<arry.length; i++) {
			arry[i] = ran.nextInt(100)+1;;
			System.out.print(" " + arry[i]);
		}
		System.out.println();
		
		Arrays.sort(arry);
		
		System.out.print("정렬된 리스트 :");
		for(int array : arry) {
			System.out.print(" " + array);
		}
	}

}
