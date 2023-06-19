package sub1;

public class Account {

	// 속성
	String bank;
	String id;
	String name;
	int balance;
	
	// 기능
	// 입금
	public void deposit(int money) {
		this.balance += money;
	}
	//출금
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("임금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balance);
		System.out.println("-------------------------");
	}
	
}
