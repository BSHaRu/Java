package sub3;

/*
 * 날짜 : 2023/06/20
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 */

class Adder {
	//여기 new Adder()의 경우 instance가 뜰때 같이뜬다.
	private static Adder instance = new Adder();   
	
	public static Adder getInstance() {
		return instance;
	}
	
	private Adder() { }
	
	private Adder(int value) {
		y += value;
	}

	private int x;
	private int y;

	public void add(int x, int y) {
		this.x += x;
		y++;
	}

	// 매개변수가 arr이니 this를 통해 굳이 멤버변수를 가리키 필요가 없다.
	public void add(int[] arr) {  
		x += arr[0];
		y += arr[1];

	}

	public static void add(Adder a2) {
		a2.x += 10;
	}

	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}

	public void show() {
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
	}
}

public class AdderTest {

	public static void main(String[] args) {

		Adder a1 = Adder.getInstance();

		a1.add(1, 2);
		System.out.println("a1.add(x,y)값 ");
		a1.show();
		System.out.println("-------------------------");

		int[] arr = {10, 20};
		a1.add(arr);
		System.out.println("a1.add(arr[])값 ");
		a1.show();
		System.out.println("-------------------------");

		Adder.add(a1);
		System.out.println("a1.add(Adder a)값 ");
		a1.show();
		System.out.println("-------------------------");

		a1 = Adder.add(a1, 3);
		System.out.println("a1.add(Adder a, value)값 ");
		a1.show();

	}
}
