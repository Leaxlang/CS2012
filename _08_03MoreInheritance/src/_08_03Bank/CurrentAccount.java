package _08_03Bank;

public class CurrentAccount extends Account{
	private double bal; 
	private int accnum;
	private int overdraftLimit;

	public CurrentAccount(int a) {
		super(0);
		bal=0.0;
		accnum=a;
		overdraftLimit=0;
	}
	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public boolean inOverdraft() {
		if(bal<(0-overdraftLimit))
			return true;
		else
			return false;
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
		if(bal<sum)
			System.err.println("Account.withdraw(...): "
					+"cannot withdraw more due to overdraft limit.");
		else if (sum>0)
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
		return "CurrentAcc " + accnum + ": " + "balance = " + bal + "; overdraft limit = " + overdraftLimit;    
	}
}