package sub1;

/**
 * 날짜 : 2022.06.12
 * 내용 : Ch02.Java 변수와 연산자 실습 
 *
 * 변수(variable)
 * 	- 데이터 처리를 위한 데이터 그릇
 *  - 변수는 메모리 공간이며 각 데이터 종류에 따라 크기가 다름
 *  
 * 상수(Constant)
 *  - 최초 저장된 데이터로 고정되는 변수
 *  - 대문자로 표기 
 */

public class VariableTest {

	public static void main(String[] args) {
		// 변수
		int a = 3;
		int b = 7;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = 5;
		
		System.out.println("a : " + a);
		
		String name = "홍길동";
		System.out.println(name + "님 ㅎㅇ");
		
		// 상수
		final int NUM = 5;
		
		// NUM = 7; 상수는 값이 고정되서 변경할 수 없다.
		System.out.println("NUM : " + NUM);
		
	}

}
