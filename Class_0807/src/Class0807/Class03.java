package Class0807;
// 은행계좌 클래스, 계좌번호-> 고정/ 잔액-> 변동가능
public class Class03 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Bank bankNum = new Bank("쪼랭", 123456);
		Bank bankMoney = new Bank("쪼랭", 123456, 100000000);
		
		System.out.println("잔액: " + bankMoney.getMoney());
		
		bankMoney.deposit(1000000);
		bankMoney.deposit(-1000000);
		
		bankMoney.withdraw(1000000);
		bankMoney.withdraw(9999990);
		
		System.out.println("잔액: " + bankMoney.getMoney());
		
	}
	
}
