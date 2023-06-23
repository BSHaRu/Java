package java22_04_29.Ex01;

public class BusDriver extends Driver{
	String bus = "버스";
	
	@Override
	public void drive() {
		System.out.printf("%s님이 %s를 운전합니다. \n", name, bus);
	}
	
	
}
