package test2;

/*
 * 날짜 : 2023.06.15
 * 내용 : 자바 배열 역순으로 정렬 연습문제 
 * 
 * 정리 한번 더 해야됨(이해 하고 넘어가기)
 */

public class Test03_ArrayTemp1 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for (int i = 0; i <10; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.println();
		
		// 배열의 원소를 역순으로 정렬
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9-j] = temp;
		}
		
		// 역순으로 정렬된 배열 출력
		for (int n : arr) {
			System.out.print(n+", ");
		}
		
		/* 이렇게 해도 됨
		 * // 현재 배열 출력
		for(int array : arr) {
			System.out.print(array + ", ");
		}
		System.out.println();
		
		// 역순으로 출력
		for(int i=0; i<arr.length; i++) {
			int temp = i;
			
			if(temp < 5) {
				arr[i] = arr[9-i]; 
				
				arr[9-i] = temp;
			}
			
			System.out.print(arr[i] + ", ");
		}
		 * 
		 */
		
	}// main

}
