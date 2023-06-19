package sub1;

/*
 * ��¥ : 2023.06.19
 * ���� : Java Class �ǽ�
 * 
 * Ŭ������ ��ü
 * - Ŭ������ ��ü�� �����ϴ� ����ü�̰�, �Ӽ�(�ʵ�, �������)�� ���(��� �޼���)���� ����
 * - ��ü�� Ŭ������ ���� �ν��Ͻ�(Instance), new �����ڷ� ����
 * 
 */

public class ClassTest {

	public static void main(String[] args) {
		
		// ��ü(Object) ����
		Car sonata = new Car();
		
		// ��ü �ʱ�ȭ
		sonata.name = "�ҳ�Ÿ";
		sonata.color = "���";
		sonata.speed = 0;
		
		// ��ü Ȱ��
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// ��ü ����, ����, �ʱ�ȭ
		Car avante; 		// ����
		avante = new Car();	// ����
		avante.name = "�ƹݶ�";
		avante.color = "������";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account ��ü ����
		Account kb = new Account();
		kb.bank = "��������";
		kb.name = "�豹��";
		kb.id = "123-456-789";
		kb.balance = 1000;
		
		kb.deposit(500);
		kb.withdraw(700);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "�츮����";
		wr.name = "����";
		wr.id = "1993-0516";
		wr.balance = 1000000;
		
		wr.deposit(3000000);
		wr.withdraw(200000);
		wr.show();
	}

}
