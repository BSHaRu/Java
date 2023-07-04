package sub1;

/*
 * 날짜 : 2023.07.04
 * 내용 : 람다식 (함수형 프로그래밍) 실습
 * 
 * 람다식(Lambda)
 * 	- 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 * 	- 함수형 프로그래밍의 함수는 람다식으로 표현
 * 	- 함수형 프로그래밍을 지원하는 구문
 * 	- 인터페이스 타입으로 @FunctionalInterface 선언해서 람다식 정의
 */

interface A{
	public void method();
}

class B implements A{
	@Override
	public void method() {
		System.out.println("method 실행");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {
		
		// 객체 지향 방식
		A a1 = new B();
		a1.method();
		
		// 익명 클래스 : 인터페이스를 바로 객체로 생성
		// -> A는 인터페이스 이름이지, 클래스 명이 아님
		// => 이벤트 처리 방식 할 때 많이 씀
		A a2 = new A() {
			@Override
			public void method() {
				System.out.println("method 실행ver2");
			}
		}; // A end
		a2.method();
		
		// 람다식 (함수형 프로그래밍 방식)
		A a3 = () -> {
			System.out.println("method 실행ver3");
		};
		a3.method();
		
	} // main end

}
