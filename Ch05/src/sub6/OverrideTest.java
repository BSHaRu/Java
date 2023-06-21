package sub6;

/*
 * ��¥ : 2023.06.21.
 * ���� : Java Override �ǽ�
 * 
 * Override(������)
 * 	- �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �������ϴ� ����
 * 	- �������̵� ����� ���ؼ� ��ü���� ���α׷����� ���⼺�� ����
 * 
 * Overload : ������ �޼��带 �Ű������� ����ؼ� �پ��� ���� ����
 * Override : �θ�Ŭ������ �ִ� �޼��带 �ڽ� Ŭ�������� ������ �޼�����¿��� ������
 */

class AAA{
	public void method1() {
		System.out.println("AAA�� method1�Դϴ�." );
	}
	public void method2() {
		System.out.println("AAA�� method2�Դϴ�." );
	}
	public void method3() {
		System.out.println("AAA�� method3�Դϴ�." );
	}
}

class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB�� method2�Դϴ�." );
	}
	
	// Overload
	public void method3(int a) {
		System.out.println("BBB�� method3�Դϴ�." );
	}
}

class CCC extends BBB{
	
	@Override // Override ǥ�ô� �����൵ ������ ������ ������ ���ִ°���
	// -> AAA�� method1()�� CCC���� �������ؼ� ����ϰ� �ִ°��� 
	public void method1() {
		System.out.println("CCC�� method1�Դϴ�." );
	}
	
	@Override
	public void method2() {
		System.out.println("CCC�� method2�Դϴ�." );
	}
	
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC�� method3�Դϴ�." );
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		
		// �������̵� �޼��� ȣ��
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();	// AAA method3 ��µ�
		c.method3(1);	// BBB method3 ��µ�
		c.method3(1, 2);
		
		System.out.println("-------------------------");
		
		// Car ��Ӱ�ü ����
		Sedan sonata = new Sedan("�ҳ�Ÿ", "���", 0, 2000);
		Truck bongo = new Truck("����", "����", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		System.out.println("-------------------------");
		
		bongo.speedUp(80);
		bongo.show();
		
	}
}














