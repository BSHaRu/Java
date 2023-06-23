package test3;

/*
 * 날짜 : 2023.06.23
 * 내용 : 싱글톤 객체 연습문제
 */

class Vehicle{
	private String name;
	private int price;
	
	
	public Vehicle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("==========");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("==========");
	}
}

// 싱글톤 객체
class CarFactory{
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}
	
}

public class Test05_Singleton {

	public static void main(String[] args) {
		// 싱글톤 객체라서 new 생성자 안됨
		// -> getter를 호출해야됨
		CarFactory factory = CarFactory.getInstance();
		
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
