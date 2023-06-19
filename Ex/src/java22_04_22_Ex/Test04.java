package java22_04_22_Ex;

import java.util.Scanner;

// 직각 삼각형 찍기 
/*
 * 1. 내가 푼거에서 ArrayIndexOutOfBounds게 안터지게 하려고 한다면?
 * 	-> 내가 했을 땐 a for문의 범위를 a <= arr.length;로 잡았는데
 * 	이러면 a가 3일때 arr.lenght는 index[3]을 가지게 되기때문에 ArrayIndexOutOfBounds가 나올 수 밖에 없다
 * 	=> index는 0부터 시작하니깐 범위를 동일하게 주면 안되고 -1만큼 줘야함
 * 	※ a <= arr.length가 아니라 a < arr.lenght가 되는거임 
 *  
 * 2. 2,4번의 정확한 의미를 알아낼것 
 * 	=> 디버그를 찍어서 배열이 어떻게 추가되는지 확인하기 바람.
 * 
 * 3. 기근쌤 코드 확실히 이해하고 넘어갈것.
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력하세요 > ");
		
//		int a = sc.nextInt()+1;
//		int b = a;
//		
//		int arr[][] = new int[a][b];
//
//		for(a=0; a < arr.length; a++) {
//			for(b=0; b <= a; b++) {
////				System.out.println("arr : " +arr.length);
//				System.out.println("a : " + a);
//				System.out.print(b + " "); // 이제 출력 값은 잘 나오는데 arr[a][b] 실행하면 ArrayIndexOutOfBounds터짐
//				System.out.println();		// -> a for문의 범위 때문에 그런거였음.
//				System.out.println("배열 : " +arr[a][b]);
//				System.out.println("-----------------------------");
//			}
////			System.out.println(); 
////			System.out.println("----------------------");
//		}

		// 이렇게 하면 오류 없는듯?
		int num = sc.nextInt();
		
		// 1. 이거 왜 이렇게 초기화를 하는건지 진짜 모르겠음
//		-> int[i][j]가 있다고 치면, i는 2차원배열 외부, j는 i내부에 있는 1차원 배열을 의미
//		=> new int[num+1][]을하게 되면 2차원 배열만 num+1로 초기화 하고, 안에 있는 1차원 배열의 크기는 아직 미정이라는 의미.
		int[] array[] = new int[num + 1][]; 
		
		for (int i = 0; i < array.length; i++) {
			// 2. array는 2차원배열인데 왜 1차원 배열 마냥 array[i]값만 초기화하냐?
//			-> array배열 자체는 2차원 배열이지만, array[i]는 1차원 배열
//			=> array[i]에 2차원 배열 크기를 지정(값을 넣어주는게 아님)
//			※ i가 1일때 int[][] array = new int[1][2];이렇게 되는거다.
			array[i] = new int[i + 1];	
//			System.out.println("array[i] : " + array[i]);
//			System.out.println("----------");
			// 3. 여기서 왜 array[i]의 길이만큼 잡는지도 모르겠음
//			-> array.length는 행의 개수, array[i].length는 열의 개수
			for (int j = 0; j < array[i].length; j++) {
			// 4. 이렇게 했을 때 array[i][j]의 배열이 값이 지금 어떻게 변하는지(구조) 알고싶음
//			 -> 2차원 배열의 값을 넣어줌 (여기서 값을 넣어주는거임!!)
				array[i][j] = j;		
//				System.out.println("array[i][j] : " + array[i][j]);
//				System.out.println("----------");
			}
		}
		// 5. int i : array랑 int[] i : array랑 차이
//		 -> int i : array 1차원 배열을 도는거 , int[] i : array는 2차원 배열의 행을 도는거.
//		 => i가 밖에 2차원 배열 돌아주고, j는 i내부의 1차열 배열들 돌아주는거임
//		일단 디버그를 찍어서 확인해보자(2번, 4번, 5번)
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		 
	}
}
