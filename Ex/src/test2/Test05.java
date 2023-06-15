package test2;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.15
 * 내용 : 자바 배열 이진탐색 연습문제 
 * 
 * 이진탐색
 * - 전체 원소가 정렬된 상태에서 중앙값을 기준으로 절반은 버리고
 * 	나머지 절반을 대상으로 검색하는 알고리즘
 * 
 * 검색단계
 * 	1단계 : 배열의 중앙값 찾기
 * 	2단계 : 검색하고자 하는 값보다 중앙값이 크면 중앙값의 오른쪽 버림
 * 	3단계 : 다시 왼쪽 절반에 대해서 중앙값을 찾음
 * 	4단계 : 위와 같이 반복 수행을 통해 검색값을 찾음
 * 
 * 정리 한번 더 해야됨(이해 하고 넘어가기)
 */

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : ");
		int value = sc.nextInt();
		
		int start = 0;
		// 배열은 index로 찾고, index는 0부터 시작하기때문에 -1을 해주는거임
		int end = arr.length -1; 
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) {
				// 입력값이 중앙값 보다 작으면
				end = mid - 1;
			}else if(arr[mid] < value) {
				// 입력값이 중앙값 보다 크면
				start = mid + 1;
			} else {
				loc = mid;
				state = true;
				break;
			}
		} // while end
		
		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc+1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		
		sc.close();
	}

}
