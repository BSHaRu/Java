package ex.extend.p334;

class Test07{
	public String nation;

	public Test07() {
		this("대한민국");
		System.out.println("Test07() call");
	}
	
	public Test07(String nation) {
		this.nation = nation;
		System.out.println("Test07(String nation) call");
	}
}

class Test07_Child extends Test07{
	public String name;
	
	public Test07_Child() {
		this("홍길동");
		System.out.println("Test07_Child() call");
	}

	public Test07_Child(String name) {
		this.name = name;
		System.out.println("Test07_Child(String name) call");
	}
}

public class Test07_ChiledEx{
	public static void main(String[] args) {
		Test07_Child child = new Test07_Child();
		
		// 상속 관계에서는 자식 클래스를 호출 할 경우 
		// 부모 클래스의 기본 생성자를 먼저 호출 하게 된다. 
	}
}