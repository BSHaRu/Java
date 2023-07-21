package test7;

interface Car{
	
	public void run();
	
	public void fly();
}

class FlyingCar implements Car{

	@Override
	public void run() {
		System.out.println("Car run!");
	}

	@Override
	public void fly() {
		System.out.println("Car fly!");
	}
}

public class Test08 {

	public static void main(String[] args) {
		Car car = new FlyingCar();
		car.run();
		car.fly();
	}
}
