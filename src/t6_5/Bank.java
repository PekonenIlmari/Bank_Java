package t6_5;

import java.util.ArrayList;

public class Bank {
	public Bank () {
	}
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addRegAccount(String a, int b) {
		accounts.add(new RegAcc(a, b));
	}
	
	public void addCreAccount(String a, int b, int c) {
		accounts.add(new CreAcc(a, b, c));
	}
	
	public void getAccountInfo(String a) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccNum().matches(a) == true) {
				accounts.get(i).getAccountInfo(a);
				break;
			} else {
				System.out.println("ERROR There is no such bank account.");
			}	
		}
	}
	
	public void withdrawMoney(String a, int b) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccNum().matches(a) == true) {
				accounts.get(i).withdrawMoney(b);
				break;
			} else {
				continue;
			}	
		}
	}
	
	public void depositMoney(String a, int b) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccNum().matches(a) == true) {
				accounts.get(i).depositMoney(b);
				break;
			} else {
				continue;
			}	
		}
	}
	
	public void removeAccount(String a) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccNum().matches(a) == true) {
				accounts.remove(i);
				System.out.println("Account removed.");
				break;
			} else {
				System.out.println("ERROR There is no such bank account.");
			}	
		}
	}

	public void printAllAccounts() {
		String tempAcc;
		System.out.println("All accounts:");
		for (int i = 0; i < accounts.size(); i++) {
			tempAcc = accounts.get(i).getAccNum();
			accounts.get(i).getAccountInfo(tempAcc);
		}
	}
}
