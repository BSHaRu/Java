package sub8;

public class Truck extends Car {

	private int capacitcy;

	public Truck(String name, String color, int speed, int capacitcy) {
		super(name, color, speed);
		this.capacitcy = capacitcy;
	}
	
	public void load(int capacity) {
		this.capacitcy += capacity;
	}
	
	public void show() {
		super.show();
		System.out.println("ÀûÀç·® : " + this.capacitcy);
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
}
