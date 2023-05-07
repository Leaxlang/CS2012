package _09Interfaces;

public class Money implements Calculable<Money>, Comparable<Money>{
	private int dollars;
	private int cents;
	private boolean positive;
	
	public Money(int dollars, int cents, boolean positive) {
		this.dollars = dollars;
		this.cents = cents;
		this.positive = positive;
	}

	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getCents() {
		return cents;
	}

	public void setCents(int cents) {
		this.cents = cents;
	}
	
	public boolean isPositive() {
		return positive;
	}

	public void setPositive(boolean positive) {
		this.positive = positive;
	}

	@Override
	public Money add(Money o) {
		int dollarAmount = this.dollars + o.dollars;
		int centAmount = this.cents + o.cents;
		boolean positiveTest;
		while(centAmount > 99) {
			centAmount -= 100;
			dollarAmount++;	
		}
		while(centAmount < -99) {
			centAmount += 100;
			dollarAmount--;	
		}
		if(dollarAmount > 0) {
			positiveTest = true;
		}else {
			positiveTest = false;
		}
		return new Money(dollarAmount, centAmount, positiveTest);
	}

	@Override
	public Money subtract(Money o) {
		double thisDollars = Double.valueOf(this.dollars);
		double oDollars = Double.valueOf(o.dollars);
		double thisCents = Double.valueOf(this.cents) /100;
		double oCents = Double.valueOf(o.cents)/100;
		
		double thisVal = thisDollars + thisCents;
		double oVal = oDollars + oCents;
		
		double newVal = thisVal - oVal; 
		int resultDollar = (int) newVal;
		double tempCents = (newVal - resultDollar) * 100;
		int resultCents = (int)tempCents;
		
		boolean positiveTest;
		if(newVal > 0) {
			positiveTest = true;
		}else {
			positiveTest = false;
		}
		return new Money(resultDollar, resultCents, positiveTest);
	}
	
	
	public String toString() {
		if(positive) {
			return "$ " + Math.round(this.dollars * 100) / 100 + "." + Math.round(this.cents * 100) / 100;
		}else {
			return "- $ " + Math.abs(Math.round(this.dollars * 100) / 100) + "." + Math.abs(Math.round(this.cents * 100) / 100);
		}
	}

	@Override
	public int compareTo(Money o) {
		int check;
		if(this.dollars > o.dollars) 
			check = 1;
		else if(this.dollars < o.dollars)
			check= -1;
		else
			check =0;
		return check;
	}
	
}