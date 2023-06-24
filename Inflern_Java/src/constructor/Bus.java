package constructor;

public class Bus extends Car{
	// 부모 클래스에 기본생성자없이 매개변수를 넣어주면
	// 자식 클래스는 super()를 통해서 해당 매개변수값을 넣어 줘야됨
	public Bus() {
		// 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입
//		super("name : Bus"); // 생략 해도 알아서 생성되서 출력됨 
		System.out.println("Bus() 기본 생성자 호출");
	}
	
}
