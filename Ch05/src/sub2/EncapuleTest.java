package sub2;

/*
 * ��¥ : 2023. 06.19
 * ���� : Java ĸ��ȭ �ǽ�
 * 
 * ĸ��ȭ(��������,Encapsulation)
 * - ĸ��ȭ�� ��ü�� �Ӽ��� �ܺο� �������� ���ϰ� ��ü�� �ʵ�(�Ӽ�)�� �����ϴ� Ư��
 * - Ŭ������ �ʵ�(�Ӽ�)�� �ݵ�� private ������ ���� ĸ��ȭ
 * - private �Ӽ��� �ʱ�ȭ�� ���� ������(Constructor) ����
 * - ���е� ������ ������ ����� ���ؼ� Getter, Setter ����
 */

public class EncapuleTest {

	public static void main(String[] args) {
		
		// Car ��ü ���� �ʱ�ȭ
		Car sonata = new Car("�ҳ�Ÿ", "���", 10);
		sonata.setName("�׷���");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("�ƹݶ�", "������", 10);
		avante.setColor("����");
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		// Account ��ü ���� �ʱ�ȭ
		Account kb = new Account("��������", "111-111-111", "�̱���", 1000);
		kb.deposit(40000);
		kb.withdraw(25000);
		kb.show();
		
	}
}
