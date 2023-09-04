package Class0807;

public class Bank {

	String name;
	private int number;
	private int money;
	
	Bank() {
		name = "예금주";
	}
	
	Bank(String name, int number) {
		this.name = name;
		this.number = number;
		money = 0;
	}

	Bank(String name, int number, int money) {
		this.name = name;
		this.number = number;
		this.money = money;
	}
	
	int getMoney() {
		return money;
	}
	
	void bankNumber() {
		System.out.println(name + "님의 계좌번호: " + number);
	}
	
	void bankMoney() {
		System.out.println(name + "님의 계좌번호: " + number + ", 잔액: " + money);
	}
	
	void deposit(int amount) {		
		if(amount<0) {
			System.err.println("잘못입력했숑");
			return;
		}
		this.money += amount;
	}
	
	
	void withdraw(int amount) {		
		if(amount<0 || amount>money) {
			System.err.println("잔액부족");
			return;
		}
		this.money -= amount;
	}
	
} //클래스끝
