package abstractclass;

public class CarEx {

	public static void main(String[] args) {
		// 추상 클래스는 인스턴스가 될 수 없다.
//		Car c1 = new Car("sonata");
		
		Bus b1 = new Bus();
		b1.run();
		
		SportsCar sc1 = new SportsCar("포르쉐 911");
		sc1.run();
		
		System.out.println("-----------------------");
		
		Car c2 = new Bus();
		c2.run();
		
		System.out.println("-----------------------");
		
		// Car를 2개 참조 할 수 있는 배열을 선언
		Car[] arr = new Car[2];
		arr[0] = new Bus();
		arr[1] = new SportsCar("포르쉐 911");
		for(Car c3 : arr) {
			c3.run();
		}
		
	}

}
