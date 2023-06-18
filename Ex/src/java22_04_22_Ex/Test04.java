package java22_04_22_Ex;

import java.util.Scanner;

// 직각 삼각형 찍기 
/*
 * 1. 내가 푼거에서 ArrayIndexOutOfBounds게 안터지게 하려고 한다면?
 * 2. 2,4번의 정확한 의미를 알아낼것
 * 3. 기근쌤 코드 확실히 이해하고 넘어갈것.
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력하세요 > ");
		
		int a = sc.nextInt();
		int b = a+1;
		
		int arr[][] = new int[a][b];

		for(a=0; a <= arr.length; a++) {
			for(b=0; b <= arr.length; b++) {
//				System.out.println("a : " + a);
				System.out.print(b + " "); // 이제 출력 값은 잘 나오는데 arr[a][b] 실행하면 ArrayIndexOutOfBounds터짐
//				System.out.println();
//				System.out.println("배열 : " +arr[a][b]);
//				System.out.println("-----------------------------");
			}
			System.out.println(); 
			System.out.println("----------------------");
		}

		/* 이렇게 하면 오류 없는듯?
		int num = sc.nextInt();
		
		// 1. 이거 왜 이렇게 초기화를 하는건지 진짜 모르겠음
		-> int[i][j]가 있다고 치면, i는 2차원배열 외부, j는 i내부에 있는 1차원 배열을 의미
		=> new int[num+1][]을하게 되면 2차원 배열만 초기화 하고, 안에 있는 1차원 배열의 크기는 아직 미정이라는 의미.
		int[] array[] = new int[num + 1][]; 
		
		for (int i = 0; i < array.length; i++) {
			// 2. array는 2차원배열인데 이렇게 의미도 제대로 모르겠음
			-> array배열 자체는 2차원 배열이지만, array[i]는 1차원 배열
			=> array[i][j] 에서 i값을 i + 1로 초기화 하는거???
			array[i] = new int[i + 1];		
			
			// 3. 여기서 왜 array[i]의 길이만큼 잡는지도 모르겠음
			-> array.length는 행의 개수, array[i].length는 열의 개수
			for (int j = 0; j < array[i].length; j++) {
			// 4. 이렇게 했을 때 array[i][j]의 배열이 값이 지금 어떻게 변하는지(구조) 알고싶음
			 -> ???????????????????????????????????????????????
				array[i][j] = j;			
			}
		}
		// 5. int i : array랑 int[] i : array랑 차이
		 -> int i : array 1차원 배열을 도는거 , int[] i : array는 2차원 배열의 행을 도는거.
		 => i가 밖에 2차원 배열 돌아주고, j는 i내부의 1차열 배열들 돌아주는거임
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		 */
	}
}
