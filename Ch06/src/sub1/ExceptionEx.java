package sub1;

/*
 * 날짜 : 2023.06.26
 * 내용 : Java Exception 실습
 * 
 * 예외처리(Exception)
 * 	- 예외는 프로그램 실행 중에 발생하는 모든 에러
 * 	- 실행 중(Runtime) 발생하는 예외와 
 * 		일반 예외(컴파일 전)에 발생하는 예외 처리
 *  - 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 *  - 사용자가 생성한 예외를 throw
 */

public class ExceptionEx {

	public static void main(String[] args) {

		// 실행 예외 - 런타임 도중 에러
		
		// 예외상황 1 : 어떤 수를 0으로 나눌 때 발생
		int num1 = 1;
		int num2 = 0;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num1 * num2;
		int rs4 = 0;
		
		try {
			// 예외가 발생할 가능성이 있는 코드 작성
			rs4 = num1 / num2;
		} catch (ArithmeticException e) {
			// 예외가 발생했을 때 처리할 코드 작성
			e.printStackTrace();
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		System.out.println("---------------------");
		
		// 예외상황 2 : 배열의 인덱스 범위를 벗어났을 때
		int arr[] = {1,2,3,4,5};
		
		try {
			for (int i=0; i<6; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		
		// 예외상황 3 : 객체 생성 없이 참조(NullPointerException)
		Animal ani = null;
		
		try {
			ani.move();
			ani.hunt();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		
		// 예외상황 4 : 잘못된 캐스팅
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle(); // 업캐스팅
		Animal a3 = new Shark(); // 업캐스팅
		
		try {
			Eagle eagle = (Eagle) a1; // 다운캐스팅 - 에러
			Shark shark = (Shark) a2; // 다운캐스팅 - 에러
			Tiger tiger = (Tiger) a3; // 다운캐스팅 - 에러
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------");
		
		System.out.println("런타임 에러 종료");
		
		
		// 일반 예외 - 컴파일 전에 에러 -> 사전에 빨간줄로 표시됨
		System.out.println("일반 예외 시작");
		
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			// 예외가 있던 없던 반드시 실행되는 코드
			System.out.println("배고프다 빨리 점심먹고 싶다..");
			// 메모리 정리 (gc 강제로 호출해서 정리하는거임)
			System.gc();
			System.out.println("finally 실행");
		}
		
		System.out.println("----------------------");
		
		System.out.println("일반 예외 종료");
	}

}
