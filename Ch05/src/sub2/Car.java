package sub2;

public class Car {

	// �ʵ�(�Ӽ�)
	private String name;
	private String color;
	private int speed;
	
	// ������ : class�� �Ȱ��� �̸��� ���� Method
	// -> ĸ��ȭ�� �Ӽ��� �ʱ�ȭ�ϱ� ���� Method
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	// �޼���(���)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("������ : " + this.name);
		System.out.println("������ : " + this.color);
		System.out.println("����ӵ� : " + this.speed);
	}

	// Getter, Setter - �ʿ信 ���� ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
