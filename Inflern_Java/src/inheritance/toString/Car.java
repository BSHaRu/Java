package inheritance.toString;

public class Car {

	public void run() {
		System.out.println("달린다.");
	}

	@Override
	public String toString() {
		return "자동차";
	}
	
}
