package sub5;

/*
 * ��¥ : 2023.06.21
 * ���� : Java Ŭ���� ��� �ǽ�
 * 
 * ���(Inheritance)
 * 	- �θ� Ŭ������ �Ӽ��� ����� �״�� �ڽ� Ŭ�������� Ȯ���Ű�� ���α׷��� ����
 * 	- �������� ���� ������ �θ�Ŭ������ �ΰ�, 
 * 		�ڽ�Ŭ�������� ��ӹ޾� �ϰ��� ���α׷��� ����
 * 	- �θ� Ŭ������ �Ӽ� ���ٱ����� protected�� �����ϰ�, 
 * 		�ڽ�Ŭ���������� �θ� �Ӽ� �ʱ�ȭ(super)
 */

class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent{
	
	private int num3;
	private int num4;
	
	// �ڽ��� �θ��� Ŭ������ ��ӹ޾Ƽ� �ʱ�ȭ ���� �ǹ��� ����
	public Child(int num1, int num2, int num3, int num4) {
		// super() : �� �θ� Ŭ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ �����ִ� ģ��
		super(num1, num2);
		
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {

	public static void main(String[] args) {
		
		// ��Ӱ�ü ����
		Child c1 = new Child(1, 2, 3, 4);
		// plus�� �θ� ��������� ��ӹ޾Ƽ� �ڽ��� ��밡��
		int rs1 = c1.plus(); 
		int rs2 = c1.minus();
		
		System.out.println("re1 : " +rs1);
		System.out.println("re2 : " +rs2);
		
		System.out.println("------------------------");
		
		// Car ��Ӱ�ü ����
		Sedan sonata = new Sedan("�ҳ�Ÿ", "���", 0, 2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		System.out.println("------------------------");
		
		Truck bongo = new Truck("����", "����", 0, 0); 
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		System.out.println("------------------------");

		// Account ��� ��ü ����
		
		StockAccount kb 
			= new StockAccount("KB����", "1-1-1", "�豹��", 10000, "����", 10, 60000);
		kb.deposit(10000000);
		kb.buy(5, 58000);
		kb.sell(5, 62000); // ���� 1���� + �̵� 2���� = 3����
		kb.show();
		
	} // main end
}
