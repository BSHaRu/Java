package java22_04_29.Ex01;

public class DirverEx {
	
	public static void drive(Driver driver) {
		driver.drive();
	}
	
	public static void main(String[] args) {
		Driver busDriver = new BusDriver();
		busDriver.name = "김유신";
		drive(busDriver);
		
		Driver texiDriver = new TexiDriver();
		texiDriver.name = "심현석";
		drive(texiDriver);
		
	}

}
