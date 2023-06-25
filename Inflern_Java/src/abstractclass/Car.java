package abstractclass;

public abstract class Car {

	public Car(String name) {
		System.out.printf("이 차는 %s입니다. \n", name);
	}
	
	// Car를 만든 사람은 run()이라는 메서드가 필요하다고 생각함
	// 근데 run()는 다르게 구현 할 생각이임
	public abstract void run();
}
