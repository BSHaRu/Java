package sub3;

/*
 * 날짜 : 2023.06.13
 * 내용 : Java 반복문 for 실습
 */
public class ForTest {

	public static void main(String[] args) {
		// for
		for(int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
		}
		
		System.out.println("-----------------------------");
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k = 1; k <= 10; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum);
		System.out.println("-----------------------------");
		// 1부터 10까지 짝수 합
		
		int total = 0;
		
		for(int k = 1; k <= 10; k++) {
			if(k % 2 == 0) {
				total += k;
			}
		}
		
		System.out.println("1부터 10까지의 짝수 합은 " + total);
		System.out.println("-----------------------------");
		
		
		// for 중첩
		for(int a=1; a<=3; a++) {
			System.out.println("a : " + a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b : " + b);
				
				for(int c=1; c<=7; c++) {
					System.out.println("c : " +c);
				} // c for문 종료
			} // b for문 종료
		} // a for문 종료
		
		// 구구단
		for(int x=2; x<=9; x++) {
			System.out.println(x+"단");
			
			for(int y=1; y<=9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
		}
		System.out.println("---------------------------------");
		
		// 별 삼각형
		for(int start=1; start <=5; start++) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("★");
			}
			
			System.out.print("\n"); // 줄바꿈
		}
		System.out.println("---------------------------------");
	
		for(int start=5; start >=1; start--) {
			
			for(int end=1; end <= start; end++) {
				System.out.print("☆");
			}
			
			System.out.print("\n");
		}
		System.out.println("---------------------------------");

		
		// 이등변 삼각형 출력
		int high = 5; // 삼각형 높이
		
//		for(int i = 1; i <= high; i++) {		// 일반 이등변 삼각형			
		for(int i = high; i >= 1; i--) {		// 역 이등변 삼각형
			for(int space = 1; space <= high-i; space++) {	
				System.out.print(" ");
			} // 이등변 삼각형을 만들기 위한 공백
			
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("◇");
			}
			
			System.out.print("\n");
		}
		System.out.println("---------------------------------");
		
		for(int i = 0; i < high; i++ ) {
			for(int j = 0; j < 2*high - 1; j++) {
				if(j >= high-1-i && j <= high-1+i) {
					System.out.print("◆");
				}else {
					System.out.print(" ");
				} // if end
				
			} // j for end
			System.out.print("\n");
		} // i for end
		
	} // main end

}
