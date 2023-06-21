package sub5;

/*
 * 날짜 : 2023.06.21
 * 내용 : Java 클래스 상속 실습
 * 
 * 상속(Inheritance)
 * 	- 부모 클래스의 속성과 기능을 그대로 자식 클래스에게 확장시키는 프로그래밍 문법
 * 	- 공통적인 로직 내용을 부모클래스에 두고, 
 * 		자식클래스에게 상속받아 일관된 프로그래밍 수행
 * 	- 부모 클래스의 속성 접근권한을 protected로 변경하고, 
 * 		자식클래스에서는 부모 속성 초기화(super)
 */

class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent{
	
	private int num3;
	private int num4;
	
	// 자식은 부모의 클래스를 상속받아서 초기화 해줄 의무가 있음
	public Child(int num1, int num2, int num3, int num4) {
		// super() : 내 부모 클래스의 생성자를 호출해서 초기화 시켜주는 친구
		super(num1, num2);
		
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {

	public static void main(String[] args) {
		
		// 상속객체 생성
		Child c1 = new Child(1, 2, 3, 4);
		// plus는 부모 기능이지만 상속받아서 자식이 사용가능
		int rs1 = c1.plus(); 
		int rs2 = c1.minus();
		
		System.out.println("re1 : " +rs1);
		System.out.println("re2 : " +rs2);
		
		System.out.println("------------------------");
		
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		System.out.println("------------------------");
		
		Truck bongo = new Truck("봉고", "남색", 0, 0); 
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		System.out.println("------------------------");

		// Account 상속 객체 생성
		
		StockAccount kb 
			= new StockAccount("KB증권", "1-1-1", "김국민", 10000, "삼전", 10, 60000);
		kb.deposit(10000000);
		kb.buy(5, 58000);
		kb.sell(5, 62000); // 기존 1만원 + 이득 2만원 = 3만원
		kb.show();
		
	} // main end
}
