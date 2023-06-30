package java22_05_06;

import java.util.Arrays;

/*
 * int 형 배열 array1 초기값 {10,20,30,40,50} 선언과 동시에 초기화
 * 배열 array1의 값을 array2에 Arrays를 이용해서 복사하고
 * 결과값은 [20, 30]만 나오게 출력
 */

public class Test02 {
	public static void main(String[] args) {
		
		int array1[] = {10, 20, 30, 40, 50};
		// Arrays.copyOfRange(배열, a, b)
		// -> index a번째부터 b까진데 b의 index는 미포함
		int array2[] = Arrays.copyOfRange(array1, 1, 3);
		
		System.out.println(Arrays.toString(array2));
		
	}
	
}
