package _09Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tester{
	public static void main(String[] args) {
		/* - - - MONEY - - - */
		
		ArrayList<Money> moneylist1 = new ArrayList<Money>();
		addingMoneyElements(moneylist1);
		Collections.shuffle(moneylist1);
		
		ArrayList<Money> moneylist2 = new ArrayList<Money>();
		addingMoneyElements(moneylist2);
		Collections.shuffle(moneylist2);
		
		
		ArrayList<Money> moneylistAdding = new ArrayList<Money>();
		for(int i = 0; i < moneylist1.size(); i++ ) {
			Money a = moneylist1.get(i);
			Money b = moneylist2.get(i);
			moneylistAdding.add(a.add(b));
		}
		moneylistAdding.forEach(System.out::println);
		Collections.sort(moneylistAdding);
		moneylistAdding.forEach(System.out::println);
		
		
		ArrayList<Money> moneylistSubtracting = new ArrayList<Money>();
		for(int i = 0; i < moneylist1.size(); i++ ) {
			Money a = moneylist1.get(i);
			Money b = moneylist2.get(i);
			moneylistSubtracting.add(a.subtract(b));
		}
		moneylistSubtracting.forEach(System.out::println);
		Collections.sort(moneylistSubtracting);
		moneylistSubtracting.forEach(System.out::println);

		
		
		/* - - - TIME - - - */
		ArrayList<Time> timeList1 = new ArrayList<Time>();
		addingTimeElements(timeList1);
		Collections.shuffle(timeList1);
		
		ArrayList<Time> timeList2 = new ArrayList<Time>();
		addingTimeElements(timeList2);
		Collections.shuffle(timeList2);
		
		
		ArrayList<Time> timeListAdding = new ArrayList<Time>();
		for(int i = 0; i < timeList1.size(); i++ ){
			Time a = timeList1.get(i);
			Time b = timeList2.get(i);
			timeListAdding.add(a.add(b));
		}
		timeListAdding.forEach(System.out::println);
		Collections.sort(timeListAdding);
		timeListAdding.forEach(System.out::println);
		
		
		ArrayList<Time> timeListSubtracting = new ArrayList<Time>();
		for(int i = 0; i < timeList1.size(); i++ ){
			Time a = timeList1.get(i);
			Time b = timeList2.get(i);
			timeListSubtracting.add(a.subtract(b));
		}
		timeListSubtracting.forEach(System.out::println);
		Collections.sort(timeListSubtracting);
		timeListSubtracting.forEach(System.out::println);
	}
	
	public static void addingMoneyElements(ArrayList<Money> list) {
		Random rd = new Random(); 
		for(int i = 0; i < 5; i++) {
			list.add(new Money(rd.nextInt(500),rd.nextInt(99),rd.nextBoolean()));
		}
	}
	public static void addingTimeElements(ArrayList<Time> list) {
		Random rd = new Random();
		for(int i = 0; i < 5; i++) {
			list.add(new Time(rd.nextInt(23),rd.nextInt(59),rd.nextInt(59)));
		}
	}
	
}