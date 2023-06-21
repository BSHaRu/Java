package sub5;

public class Account {

	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	public Account(String bank, String id, String name, int balance) {
		super();
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("--------------------------");
		System.out.println("����� : " + this.bank);
		System.out.println("���¹�ȣ : " + this.id);
		System.out.println("������ : " + this.name);
		System.out.println("���� �ܾ� : " + this.balance);
		System.out.println("--------------------------");
	}
	
	
}
