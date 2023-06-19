package sub1;

/*
 * 날짜 : 2023.06.19
 * 내용 : Java Class 실습
 * 
 * 클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고, 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 * - 객체는 클래스의 실제 인스턴스(Instance), new 연산자로 생성
 * 
 */

public class ClassTest {

	public static void main(String[] args) {
		
		// 객체(Object) 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 선언, 생성, 초기화
		Car avante; 		// 선언
		avante = new Car();	// 생성
		avante.name = "아반떼";
		avante.color = "검정색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.name = "김국민";
		kb.id = "123-456-789";
		kb.balance = 1000;
		
		kb.deposit(500);
		kb.withdraw(700);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.name = "지은";
		wr.id = "1993-0516";
		wr.balance = 1000000;
		
		wr.deposit(3000000);
		wr.withdraw(200000);
		wr.show();
	}

}
