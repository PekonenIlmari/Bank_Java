package t6_5;

public abstract class Account {
	protected String accNum;
	protected int balance;
	
	public Account(String accNum, int balance) {
		this.accNum = accNum;
		this.balance = balance;
		System.out.println("Account created.");
	}
	
	public String getAccNum() {
		return accNum;
	}
	
	public void getAccountInfo(String accNum) {
		System.out.println("Account number: " + accNum + " Amount of money: " + balance);
	}
	
	public void withdrawMoney(int b) {
		if (balance-b > 0) {
			balance -= b;
		} else {
			System.out.println("You don't have enough money.");
		}
	}
	
	public void depositMoney(int b) {
		balance += b;
	}
}

class RegAcc extends Account {
	
	public RegAcc(String accNum, int balance) {
		super(accNum, balance);
	}
	
}

class CreAcc extends Account {
	protected int creditLimit;
	public CreAcc(String accNum, int balance, int creditLimit) {
		super(accNum, balance);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void getAccountInfo(String accNum) {
		System.out.println("Account number: " + accNum + " Amount of money: " + balance +
		" Credit limit: " + creditLimit);
	}
	
	@Override
	public void withdrawMoney(int b) {
		if (balance-b > -creditLimit) {
			balance -= b;
		} else {
			System.out.println("You have reached your credit limit.");
		}
	}
}

