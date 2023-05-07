package _08_03Bank;

import java.util.ArrayList;

public class Bank {
	static ArrayList<Account> accounts = new ArrayList<Account>();
	public static void main(String[] args) {
		openSavings(1234);
		openCurrent(9876);
		iterateAccs();
	}
	public static void openSavings(int acc) {
		accounts.add(new SavingsAccount(acc));
	}
	public static void openCurrent(int acc) {
		accounts.add(new CurrentAccount(acc));
	}
	public static void closeAcc(int acc) {
		accounts.remove(acc);
	}
	public static void iterateAccs() {
		for(Account acc:accounts) {
			acc.deposit(400);
			System.out.println(acc.getBalance());
			if(acc instanceof CurrentAccount) {
				if(((CurrentAccount)acc).inOverdraft());
					sendLetter(acc);
			}else if(acc instanceof SavingsAccount){
				((SavingsAccount)acc).addInterestPerYEAR();
			}
			System.out.println(acc.toString());
		}
	}
	private static void sendLetter(Account acc) {
		System.out.println("Sending a letter to customer with acc number due to overdraft.");
	}
}
