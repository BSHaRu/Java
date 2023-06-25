package abstractclass;

public class SportsCar extends Car{

	// 부모가 기본 생성자가 없기 때문에 반드시 super()를 호출해줘야함
	public SportsCar(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("사륜구동으로 달림");
	}

}
