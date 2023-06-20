package sub3;

public class Calc {
	//싱글톤 객체 : 클래스 내에서 스스로를 객체로 생성
	private static Calc instance = new Calc();	
	
	//외부 접근을 위해 getter생성
	public static Calc getInstance() {
		return instance;
	}
	// new 못하게 하기 위해 private 생성자 만든다.
	private Calc() {

	}
	// 싱글톤 객체 생성시 위의 라인이 전부 한세트임
	// -> 1. private static 으로 생성자 생성
	// 	2. public static으로 getter 생성
	//	3. new 못하게 하기 위해 private 생성자 만듬

	public int plus(int x, int y) {
		return x+y;
	}

	public int minus(int x, int y) {
		return x-y;
	}

	public int multi(int x, int y) {
		return x*y;
	}

	public int div(int x, int y) {
		return x/y;
	}
}
