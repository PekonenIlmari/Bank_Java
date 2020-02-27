package t6_5;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner s = new Scanner(System.in);
		String accNum = "";
		int amount;
		int creditLimit;
		
		while (true) {
			System.out.println("\n*** BANK SYSTEM ***\n1) Add a regular account\n" + 
			"2) Add a credit account\n3) Deposit money\n4) Withdraw money\n" + 
			"5) Remove an account\n6) Print account information\n7) Print all accounts\n" +
			"0) Quit");
			System.out.print("Your choice: ");
			int choice = s.nextInt();
			s.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Give an account number: ");
				accNum = s.nextLine();
				System.out.print("Amount of money to deposit: ");
				amount = s.nextInt();
				bank.addRegAccount(accNum, amount);
				break;
			case 2:
				System.out.print("Give an account number: ");
				accNum = s.nextLine();
				System.out.print("Amount of money to deposit: ");
				amount = s.nextInt();
				System.out.print("Give a credit limit: ");
				creditLimit = s.nextInt();
				bank.addCreAccount(accNum, amount, creditLimit);
				break;
			case 3:
				System.out.print("Give an account number: ");
				accNum = s.nextLine();
				System.out.print("Amount of money to deposit: ");
				amount = s.nextInt();
				bank.depositMoney(accNum, amount);
				break;
			case 4:
				System.out.print("Give an account number: ");
				accNum = s.nextLine();
				System.out.print("Amount of money to withdraw: ");
				amount = s.nextInt();
				bank.withdrawMoney(accNum, amount);
				break;
			case 5:
				System.out.print("Give the account number of the account to delete: ");
				accNum = s.nextLine();
				bank.removeAccount(accNum);
				break;
			case 6:
				System.out.print("Give the account number of the account to print information from: ");
				accNum = s.nextLine();
				bank.getAccountInfo(accNum);
				break;
			case 7:
				bank.printAllAccounts();
				break;
			case 0:
				s.close();
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
