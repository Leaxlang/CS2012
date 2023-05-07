package _09Interfaces;

public class Time implements Calculable<Time>, Comparable<Time> {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}

	@Override
	public int compareTo(Time o) {
		int check;
		if(this.hours > o.hours) 
			check = 1;
		else if(this.hours < o.hours)
			check= -1;
		else
			check =0;
		return check;
	}

	@Override
	public Time add(Time o) {
		int hoursAmount = this.hours + o.getHours();
		int minutesAmount = this.minutes + o.getMinutes();
		int secondsAmount = this.seconds + o.getSeconds();
		while(secondsAmount > 59) {
			secondsAmount -= 60;
			minutesAmount++;
		}
		while(minutesAmount > 59) {
			minutesAmount -= 60;
			hoursAmount++;
		}
		while(hoursAmount > 24) {
			hoursAmount -= 24;
		}
		return new Time(hoursAmount, minutesAmount, secondsAmount);
	}

	@Override
	public Time subtract(Time o) {
		int hoursAmount = this.hours - o.getHours();
		int minutesAmount = this.minutes - o.getMinutes();
		int secondsAmount = this.seconds - o.getSeconds();
		while(secondsAmount < 0) {
			secondsAmount = 60-secondsAmount;
			minutesAmount--;
		}
		while(minutesAmount < 0) {
			minutesAmount = 60-minutesAmount;
			hoursAmount--;
		}
		while(hoursAmount < 0) {
			hoursAmount++;
		}
		while(secondsAmount > 59) {
			secondsAmount -= 60;
			minutesAmount++;
		}
		while(minutesAmount > 59) {
			minutesAmount -= 60;
			hoursAmount++;
		}
		while(hoursAmount > 24) {
			hoursAmount-=24;
		}
		return new Time(hoursAmount, minutesAmount, secondsAmount);
	}

}
