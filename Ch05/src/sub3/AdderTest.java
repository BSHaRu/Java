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
	// 위의 3개 구문으로 Adder 싱글톤 완성
	// 싱글톤을 다양하게 만드는 법 + 장단점
	// -> https://twinparadox.tistory.com/616
	
	private Adder(int value) {
		y += value;
	}

	private int x;
	private int y;

	// this.x는 private의 x를 가르키지만
	// y++의 y는 매개변수 y를 가르킴
	// 즉, x값은 private x값에 저장되지만, 
	// y는 들어오고 add method가 종료 후 사라짐 
	public void add(int x, int y) {
		this.x += x;
		y++;
	}

	// 매개변수가 arr[]이니 여기서는 this를 꼭 안써줘도 됨
	public void add(int[] arr) {  
		x += arr[0];
		y += arr[1];

	}

	// 매개변수로 Adder을 받아오는데, Adder은 싱글톤으로 구성됨
	// 
	public static void add(Adder a2) {
		a2.x += 10;
	}

	public static Adder add(Adder a3, int value) {
		// 여기서 new로 받아서 새로 초기화를 하는거임
		// 즉, heap에 새로운 new Adder()가 빈껍떼기로 추가 생성
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
