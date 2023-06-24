package inheritance.override;

/*
 *  상속을 받고, 오버라이딩을 하였어도 
 *  부모타입으로 선언했으면
 *  필드값은 부모 클래스가 선언한 필드 값으로
 *  오버라이딩 된 메서드는 자식 클래스가 정의한 메서드가 호출됨  
 */

public class Override {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		// Parent의 필드값 i값을 가져옴
		System.out.println(p1.i);
		// Parent의 printI() 메서드를 호출함
		p1.printI();
		
		System.out.println("---------------");
		
		Child c1 = new Child();
		System.out.println(c1.i);
		c1.printI();
		
		System.out.println("---------------");
		
		Parent p2 = new Child();
		// Parent 타입의 필드값 i를 가져옴
		// -> Child가 Parent를 상속받고 있지만,
		// 부모 타입으로 받았기 때문에 필드값 또한 부모의 필드값을 가져옴
		System.out.println(p2.i);
		
		// printI()는 오버라이딩 되고 있기때문에
		// 타입을 부모로 받았다고 해도 자식이 들고있는 메서드를 호출함
		p2.printI();
		
		// 자식도 필드 i값을 가지고 있지만,
		// printI2()는 부모만 정의한 메서드기 때문에
		// 부모 클래스에서 이미 정의한 필드값을 가진 메서드로 호출되는거임
		p2.printI2();
		
		// c1은 Child 타입이긴 하지만 상속을 받았기 때문에
		// 부모의 메서드인 printI2()를 호출 할 수 있는 것이다.
		c1.printI2();
		
	}

}
