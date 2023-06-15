package sub2;

/*
 * 날짜 : 2023.06.15
 * 내용 : Java 메서드 실습
 * 
 * 메서드(Method)
 * - 자주 사용하는 코드 로직을 모듈화한 구조체
 * - 메서드에서 선언한 변수는 지역변수이고, 해당 메서드가 종료되면 메모리에서 소멸
 */

public class Method {
	
	// 전역 변수 : 객체가 해제 될 때 해제
	int num = 1;
	
	// main Method : 프로그램 진입점
	public static void main(String[] args) {
		
		// 메서드 호출
		int y1 = f(1);
		System.out.println("y1 : " + y1);
		
		int y2 = f(2);
		System.out.println("y2 : " + y2);
		
		int y3 = f(3);
		System.out.println("y3 : " + y3);
		
		System.out.println("--------------------------");
		
		// 메서드 지역변수와 stack
		int t1 = sum(1, 10);
		System.out.println("t1 : " + t1);
		
		int t2 = sum(1, 100);
		System.out.println("t2 : " + t2);
		
	} // main end
	
	// f 메서드 정의
	public static int f(int x) {
		
		int y = 2 * x + 3;
		
		return y;
	}
	
	// sum 메서드 정의
	public static int sum(int start, int end) {
		
		// 지역 변수 : 메서드가 종료되면 stack에서 사라지는 변수
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		return total;
	}

}
