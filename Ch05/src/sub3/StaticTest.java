package sub3;

/*
 * 날짜 : 2023/06/20
 * 내용 : 자바 클래스 메서드, 클래스 변수 실습
 * 
 * 클래스 변수, 클래스 메서드(정적 변수, 정적 메서드)
 * 	- static을 선언한 변수, 메서드로 Method Area에 생성.
 * 	- 별도의 객체생성(new)을 하지 않고 클래스 타입으로 참조한다.
 *  - 객체(인스턴스)들 간의 공유 목적으로 클래스 변수, 클래스 메서드 사용한다.
 * 
 * 싱글톤 객체(singleton)
 *  - static을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상에 존재 한다.
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대한다.
 *  	-> 단 한번만 new로 인스턴스 생성한 후 계속 쓸 수 있음
 *  - 전역변수로 선언해서 다른 클래스에서 사용되기 쉬움
 *  
 */
public class StaticTest {

	public static void main(String[] args) {

		// Car 실습
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그랜저", "남색", 30);

		// show()는 instance method, 
		// instance method는 반드시 인스턴스를 통해서 호출 해야 한다. 
		// Car.show()는 불가능 -> show()가 class method면 저렇게 호출가능
		sonata.show();
		System.out.println();
		avante.show();
		System.out.println();
		grande.show();
		System.out.println();

		// 클래스 변수 참조
		System.out.println("전체 차량수: " + Car.count); 
		System.out.println();
		// 클래스 메서드 호출
		System.out.println("현재 차량수: " + Car.getCount()); 
		System.out.println();

		// 싱글톤 객체 실습
		// Calc c1 = new Calc(); 
		// The constructor Calc() is not visible 에러 싱글톤으로 막음
		// private로 캡슐화 되있으니 당연히 Calc()메서드 호출이 불가하다.

		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();

		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

	}
}
