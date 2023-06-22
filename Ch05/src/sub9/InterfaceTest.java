package sub9;

/*
 * ��¥ : 2023.06.22.
 * ���� : Java �������̽� �ǽ�
 * 
 * �������̽�(Interface)
 * 	- Ŭ�������� ����� ǥ�� �԰��� ���� ���� ����
 * 	- �������̽��� Ȱ���ؼ� ��ü�� ���յ��� ��ȭ�ϴ� ȿ��(������)
 * 	- �μ������� ���߻�� ȿ��
 */

class Tv extends Computer implements Internet{

	@Override
	public void access() {
		surf();
	}
	
	public void powerOn() {
		booting();
	}
	
}

class Computer{
	public void booting() {
		System.out.println("�ý��� ����..");
	};
	
	public void surf() {
		System.out.println("���ͳ� ����...");
	}
}

interface Internet{
	
	public void access();
	
}


public class InterfaceTest {

	public static void main(String[] args) {
		
		// �������̽� Ȱ�� 1 - ǥ��ȭ�� Ŭ���� ����� ������ Ȱ��
		Car sonata = new Sedan("�ҳ�Ÿ", "���", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car bongo = new Truck("����", "����", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();
		
		// �������̽� Ȱ�� 2 - ������(���յ� ��ȭ)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		System.out.println("---------------");
		
		// �������̽� Ȱ�� 3 - ���� ��� ȿ��
		// -> ��ĳ������ ����
		// Computer�� ������ Internet�� Ȱ���� �ȵǰ�, �׹ݴ뵵 �ȵ�
		Tv smartTv = new Tv();
		smartTv.powerOn();
		smartTv.surf();
		
		
		
	}
}
