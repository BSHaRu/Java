package java22_04_22_Ex;

import java.util.Scanner;

// 입력받은 값이 몇 번째 인덱스인가?
public class Test02 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열 초기화 선언
		// 초기화를 해줘야 나중에 유지 보수가 쉬워짐
		// 초기화를 안하고 반복문 작업을 하게되면 
		// 나중에 추가작업이 더 생길 수 있음
		// -> 향상된 for문을 사용하면 printf 구문이 실행이 안되는데
		// 이건 아마 향상된 for문이 인덱스로 접근을 못해서 printf에서 안나오는걸로 추정
		numbers = new int[10];
		for(int n=0; n<numbers.length; n++) {
			numbers[n] = n+1;
		}
				
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호를 입력하세요 > ");
		
		int num = sc.nextInt();
		
		for(int a=0; a<numbers.length; a++) {
			if(numbers[a] == num) {
				System.out.printf("%d는 [%d] index에 있습니다.", 
						num, a);
				break;
			}
		}
		sc.close();
	}

}
