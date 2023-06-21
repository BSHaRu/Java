package sub5;

public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}

	public void speedTurbo() {
		// 부모 class에서 필드값이 private로 잡혀있으면 자식이 못씀
		// -> private를 protected로 변경해야 사용 가능
		this.speed += 20;
	}
	
	public void show() {
		// super를 사용함으로써 부모에 있는 show의 기능을 그대로 사용할 수 있음
		super.show();
		System.out.println("배기량 : " +this.cc);
	}
	
}
