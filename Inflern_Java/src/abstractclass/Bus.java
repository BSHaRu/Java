package abstractclass;

public class Bus extends Car {

	public Bus() {
		super("Bus");
		System.out.println("Bus 기본생성자");
	}

	// 부모가 가지고 있는 추상메서드를 자식에게 반드시 구현
	@Override
	public void run() {
		System.out.println("후련구동으로 달림");
	}

}
