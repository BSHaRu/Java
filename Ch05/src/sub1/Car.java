package sub1;

//Car class ����
public class Car {
	
	// �ʵ�(�Ӽ�)
	String name;
	String color;
	int speed;
	
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
}
