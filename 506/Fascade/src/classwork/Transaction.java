package classwork;

public class Transaction {
	
	private int balance;
	
	public Transaction() {
		this.balance = 100000;
	}
	
	public void deposit(int amount) {
		if(amount > 0)
			balance += amount;
		System.out.println("Now your balance is " + balance);
	}
	
	public void withdwrpw(int amount) {
		if(amount < 0 && balance + amount > 0)
			balance += amount;
		
		System.out.println("Now your balance is " + balance);
	}
	
}
