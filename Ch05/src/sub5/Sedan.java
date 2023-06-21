package sub5;

public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}

	public void speedTurbo() {
		// �θ� class���� �ʵ尪�� private�� ���������� �ڽ��� ����
		// -> private�� protected�� �����ؾ� ��� ����
		this.speed += 20;
	}
	
	public void show() {
		// super�� ��������ν� �θ� �ִ� show�� ����� �״�� ����� �� ����
		super.show();
		System.out.println("��ⷮ : " +this.cc);
	}
	
}
