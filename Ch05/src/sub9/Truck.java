package sub9;

public class Truck implements Car {

	private String name;
	private String color;
	private int speed;
	
	public Truck(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("������ : " + this.name);
		System.out.println("������ : " + this.color);
		System.out.println("����ӵ� : " + this.speed);
		System.out.println("---------------------");
	}
}
