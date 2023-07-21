package test7;

class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void VehicleTeak(Vehicle vehicle) {
		vehicle.Teak(name);
	}
}

class Vehicle {
	protected String name;
	protected int fee;
	
	public Vehicle(String name, int fee) {
		this.name = name;
		this.fee = fee;
	}
	
	public void Teak(String userName) {
		System.out.printf("%s은(는) %s을(를) 탑니다. \n", userName, name);
		System.out.printf("%s 요금은 %,d입니다. \n", name, fee);
	}
}

class Bus extends Vehicle{

	public Bus(String name, int fee) {
		super(name, fee);
	}
}

class Subway extends Vehicle{

	public Subway(String name, int fee) {
		super(name, fee);
	}
}


public class Test03 {

	public static void main(String[] args) {
		User kim = new User("김유신", 24);
		User lee = new User("이순신", 34);
		
		Bus bus = new Bus("버스", 1500);
		Subway subway = new Subway("지하철", 1600);
		
		kim.VehicleTeak(bus);;
		lee.VehicleTeak(subway);;
		
	}
}
