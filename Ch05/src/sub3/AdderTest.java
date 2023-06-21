package sub3;

/*
 * ��¥ : 2023/06/20
 * ���� : �̱��� ��ü�� �ν��Ͻ� ��ü �ǽ�
 */

class Adder {
	//���� new Adder()�� ��� instance�� �㶧 ���̶��.
	private static Adder instance = new Adder();   
	
	public static Adder getInstance() {
		return instance;
	}
	
	private Adder() { }
	// ���� 3�� �������� Adder �̱��� �ϼ�
	// �̱����� �پ��ϰ� ����� �� + �����
	// -> https://twinparadox.tistory.com/616
	
	private Adder(int value) {
		y += value;
	}

	private int x;
	private int y;

	// this.x�� private�� x�� ����Ű����
	// y++�� y�� �Ű����� y�� ����Ŵ
	// ��, x���� private x���� ���������, 
	// y�� ������ add method�� ���� �� ����� 
	public void add(int x, int y) {
		this.x += x;
		y++;
	}

	// �Ű������� arr[]�̴� ���⼭�� this�� �� �Ƚ��൵ ��
	public void add(int[] arr) {  
		x += arr[0];
		y += arr[1];

	}

	// �Ű������� Adder�� �޾ƿ��µ�, Adder�� �̱������� ������
	// 
	public static void add(Adder a2) {
		a2.x += 10;
	}

	public static Adder add(Adder a3, int value) {
		// ���⼭ new�� �޾Ƽ� ���� �ʱ�ȭ�� �ϴ°���
		// ��, heap�� ���ο� new Adder()�� �󲮶���� �߰� ����
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
		System.out.println("a1.add(x,y)�� ");
		a1.show();
		System.out.println("-------------------------");

		int[] arr = {10, 20};
		a1.add(arr);
		System.out.println("a1.add(arr[])�� ");
		a1.show();
		System.out.println("-------------------------");

		Adder.add(a1);
		System.out.println("a1.add(Adder a)�� ");
		a1.show();
		System.out.println("-------------------------");

		a1 = Adder.add(a1, 3);
		System.out.println("a1.add(Adder a, value)�� ");
		a1.show();

	}
}
