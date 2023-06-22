package sub8;

/*
 * ��¥ : 2023.06.22
 * ���� : Java �߻�Ŭ���� �ǽ�
 * 
 * �߻�Ŭ����(Abstract Class)
 * 	- �Ϲ� Ŭ������ �����ϱ� ���� �⺻ Ʋ�� �����ϴ� Ŭ����
 * 	- �߻� Ŭ������ ��� �޾� �ڽ� Ŭ�������� �̿ϼ� �޼���(�߻�޼���)��
 * 		�������̵��ؼ� �ϼ� -> ������ Ȱ��
 * 	- �߻� Ŭ������ �ϳ� �̻��� �߻� �޼��带 ������ �־�� ��
 * 		-> �Ϲ� �޼��尡 �־ �� 
 */

public class AbstractTest {
	
	public static void main(String[] args) {
		
		// �߻� Ŭ���� ��ü ���� ����
//		Car car = new Car();
		
		Car sonata = new Sedan("�ҳ�Ÿ", "���", 0, 2000);
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		System.out.println("-------------------------");
		
		Car bongo = new Truck("����", "����", 0, 0);
		bongo.speedUp(80);
		bongo.speedDown(60);
		bongo.show();
		
		
		
	}
}
