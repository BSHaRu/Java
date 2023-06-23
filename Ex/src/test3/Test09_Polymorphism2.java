package test3;

/*
 * 날짜 : 2023.06.23
 * 내용 : 추상 클래스, 다형성 연습문제
 */

abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test09_Polymorphism2 {

	public static void main(String[] args) {
		Test09_Polymorphism2 here = new Test09_Polymorphism2();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}
}
