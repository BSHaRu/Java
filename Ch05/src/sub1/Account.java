package sub1;

public class Account {

	// �Ӽ�
	String bank;
	String id;
	String name;
	int balance;
	
	// ���
	// �Ա�
	public void deposit(int money) {
		this.balance += money;
	}
	//���
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("����� : " + this.bank);
		System.out.println("���¹�ȣ : " + this.id);
		System.out.println("�ӱ��� : " + this.name);
		System.out.println("���� �ܾ� : " + this.balance);
		System.out.println("-------------------------");
	}
	
}
