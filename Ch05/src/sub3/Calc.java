package sub3;

public class Calc {
	//�̱��� ��ü : Ŭ���� ������ �����θ� ��ü�� ����
	private static Calc instance = new Calc();	
	
	//�ܺ� ������ ���� getter����
	public static Calc getInstance() {
		return instance;
	}
	// new ���ϰ� �ϱ� ���� private ������ �����.
	private Calc() {

	}
	// �̱��� ��ü ������ ���� ������ ���� �Ѽ�Ʈ��
	// -> 1. private static ���� ������ ����
	// 	2. public static���� getter ����
	//	3. new ���ϰ� �ϱ� ���� private ������ ����

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
