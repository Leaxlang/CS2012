package _08_03Bank;

public class SavingsAccount extends Account{
	private double bal; 
	private int accnum;
	private double interest;
	
	public SavingsAccount(int a) {
		super(0);
		bal=0.0;
		accnum=a;
	}
	
	public void addInterestPerYEAR() {
		bal+=bal*interest;
	}
	public void setInterestVariable(double interest) {
		this.interest = interest;
	}
	public void deposit(double sum)
	{
		if (sum>0)
			bal+=sum;    
		else
			System.err.println("Account.deposit(...): "
					+"cannot deposit negative amount.");    
	}

	public void withdraw(double sum)
	{
		if (sum>0)
			bal-=sum; 
		else
			System.err.println("Account.withdraw(...): "
					+"cannot withdraw negative amount.");    
	}

	public double getBalance()
	{
		return bal;
	}

	public double getAccountNumber()
	{
		return accnum;
	}
	public String toString()
	{
		return "SavingAcc " + accnum + ": " + "balance = " + bal + "; interest rate = " + interest;    
	}
}