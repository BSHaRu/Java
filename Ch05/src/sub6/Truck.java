package sub6;

public class Truck extends Car {

	private int capacitcy;

	public Truck(String name, String color, int speed, int capacitcy) {
		super(name, color, speed);
		this.capacitcy = capacitcy;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed - 20;
	}
	
	public void load(int capacity) {
		this.capacitcy += capacity;
	}
	
	public void show() {
		super.show();
		System.out.println("ÀûÀç·® : " + this.capacitcy);
	}
}
