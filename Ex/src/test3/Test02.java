package test3;

/*
 * 날짜 : 2023.06.23
 * 내용 : 클래스 생성자 연습문제
 */

class King{
	private String name;
	private int year;

	public King(int year) {
		// 여기서 this("정조")의 this는 뭘 가르키는 거임?
		/*-> 근본 
		 * 1. java에서 생성자는 같은 클래스 내의 다른 생성자를 호출 할 수 있다.
		 * 	-> 이때 this()를 씀
		 * 	=> 현재 클래스의 다른 생성자를 호출 하는 역할
		 * 2. java에서 this는 현재 인스턴스(객체)를 가르킴
		 * 	
		 * => this는 King 객체를 가르키고 있고,
		 *  King은 King(String name) 생성자 찾아서 호출. 
		 * ∴ this("정조");는 this()를 사용해서 
		 * 	King(String name)을 호출 하고 있는거임
		 */
		this("정조");
		this.year = year;
	}
	
	public King(String name) {
		this.name = name;
	}
	
	public King(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}
}

public class Test02 {

	public static void main(String[] args) {
		King k1 = new King("태조", 1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}
}
