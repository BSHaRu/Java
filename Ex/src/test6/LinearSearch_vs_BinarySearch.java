package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/*
 * 날짜 : 2023.07.18
 * 내용 : 자바 총정리 연습문제
 * 
 * 선형 탐색과 이진 탐색의 차이 비교
 * 
 */

public class LinearSearch_vs_BinarySearch {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		Random rm = new Random();
		int[] values = new int[30];
		
		for(int i=0; i < values.length; i++) {
			values[i] = rm.nextInt(1000);
		}
		printArray("정렬 전", values);
		Arrays.sort(values);
		printArray("정렬 후", values);
		
		System.out.print("=> 검색할 숫자 입력 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int findNum = Integer.parseInt(st.nextToken());
		int count = 0;
//		System.out.println(findNum);
		
		// 선형 탐색(Linear search) 
		// -> 오름차순 or 내림차순으로 해당 값을 찾는거임
		for(int i = 0; i <= values.length; i++) {
			count++;
			if(findNum == values[i]) {
				System.out.printf("values[%d] = %d\n", i, findNum);
				System.out.printf("선형탐색 비교 횟수 : %d\n", count);
				break;
			}
		}
		System.out.println("================================");
		// 이진 탐색(Binary Search) 
		// -> 절반씩 짤라서 찾는거임
		count = 0;
		int low = 0;
		// length는 index 길이라서 -1를 해줘야됨
		int high = values.length - 1;
		
		while(low <= high) {
			count++;
			int mid = (low + high) / 2; 
			if(findNum == values[mid]) {
				System.out.printf("values[%d] = %d\n", mid, findNum);
				System.out.printf("이진 탐색 비교 횟수 : %d\n", count);
				break;
			}else if(findNum > values[mid]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		br.close();
	}

	private static void printArray(String txt, int[] array) {
		System.out.println(txt);
		// 향상된 for문을 사용하면 ArrayIndexOutOfBound가 발생
		// -> 향상된 for문은 index를 접근 하는게 아니기 때문
		// ex) array[] = {10, 11};
		// 향상된 for문은 array[10], array[11]이렇게 값을 가져옴
		// 근데 우리가 필요한건 value값이 아니라 array의 index값임
		// 그렇기 때문에 Exception이 발생
//		for(int i : array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%s", array[i], 
					(i%10 == 9) ? "\n" : "");
		}
	}

}
