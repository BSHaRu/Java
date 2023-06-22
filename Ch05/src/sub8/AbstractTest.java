package sub8;

/*
 * 날짜 : 2023.06.22
 * 내용 : Java 추상클래스 실습
 * 
 * 추상클래스(Abstract Class)
 * 	- 일반 클래스를 정의하기 위한 기본 틀을 제공하는 클래스
 * 	- 추상 클래스를 상속 받아 자식 클래스에서 미완성 메서드(추상메서드)를
 * 		오버라이드해서 완성 -> 다형성 활용
 * 	- 추상 클래스는 하나 이상의 추상 메서드를 가지고 있어야 됨
 * 		-> 일반 메서드가 있어도 됨 
 */

public class AbstractTest {
	
	public static void main(String[] args) {
		
		// 추상 클래스 객체 생성 못함
//		Car car = new Car();
		
		Car sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		System.out.println("-------------------------");
		
		Car bongo = new Truck("봉고", "남색", 0, 0);
		bongo.speedUp(80);
		bongo.speedDown(60);
		bongo.show();
		
		
		
	}
}
