package sub3;

public class Car {
	// heap�� ����
	private String name;
	private String color;
	private int speed;

	// Ŭ���� ����(==���� ���� == instance method )
	// 1. �ν��ͽ��� ������ �ƴ� Ŭ������ ���� ���� �ϱ⿡ 
	// 		static���� public���� ���δ�. 
	// 2. class area�� ���� �ȴ�.
	public static int count; 

	public Car(String name, String color, int speed) {

		this.name = name;
		this.color = color;
		this.speed = speed;

		// this.count++�� �����ϳ� ������ ���� this���� 
		// static�̶� ���� �����Ǿ� ������ �����ϴ� ����� ������ ����
		// �ν��Ͻ��� Car���� ������ count�� ����
		count++; 
	}

	// Ŭ���� �޼���(= ���� �޼���)
	public static int getCount() { 

		// static ������ ������ static�� ���� ����
		// ���� return�� name�̶�� �޸𸮿� static�� �����ߴµ� 
		// �� �� name�� �޸𸮿� �������� �ʱ� ������ ���� ����� �� ����.
		// �̰� ��ǿ��� ���� ���� - ��ü ���� ���� - Method���� �����ص� 
		return count;
	}

	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {
		System.out.println("������: " + this.name);
		System.out.println("������: " + this.color);
		System.out.println("�ӵ�  : " + this.speed);
	}
}
