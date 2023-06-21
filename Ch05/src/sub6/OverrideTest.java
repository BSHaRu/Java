package sub6;

/*
 * 날짜 : 2023.06.21.
 * 내용 : Java Override 실습
 * 
 * Override(재정의)
 * 	- 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 * 	- 오버라이드 기능을 통해서 객체지향 프로그래밍의 다향성을 구현
 * 
 * Overload : 동일한 메서드를 매개변수로 구분
 * Override : 부모클래스에 있는 메서드를 자식 클래스에서 동일한 메서드상태에서 재정의
 */

class AAA{
	public void method1() {
		System.out.println("AAA의 method1입니다." );
	}
	public void method2() {
		System.out.println("AAA의 method2입니다." );
	}
	public void method3() {
		System.out.println("AAA의 method3입니다." );
	}
}

class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB의 method2입니다." );
	}
	
	// Overload
	public void method3(int a) {
		System.out.println("BBB의 method3입니다." );
	}
}

class CCC extends BBB{
	
	@Override // Override 표시는 안해줘도 되지만 가독성 떄문에 해주는거임
	// -> AAA의 method1()을 CCC에서 재정의해서 사용하고 있는거임 
	public void method1() {
		System.out.println("CCC의 method1입니다." );
	}
	
	@Override
	public void method2() {
		System.out.println("CCC의 method2입니다." );
	}
	
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC의 method3입니다." );
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		
		// 오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();	// AAA method3 출력됨
		c.method3(1);	// BBB method3 출력됨
		c.method3(1, 2);
		
		System.out.println("-------------------------");
		
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		System.out.println("-------------------------");
		
		bongo.speedUp(80);
		bongo.show();
		
	}
}














