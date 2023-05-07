package _06CustomString;


public class Tester{
	public static void main(String[] args) {
		CustomString str = new CustomString(null);
		char[] help = {'H','e','l','l','o',',',' ','I',' ','a','m',' ','h','e','r','e' };
		str.setData(help);
		
		CustomString str2 = new CustomString(null);
		char[] help2 = {'H','e','l','l','o',',',' ','I',' ','a','m',' ','h','e','r','e' };
		str2.setData(help2);
		
		CustomString str3 = new CustomString(null);
		char[] help3 = {'H','e','l','l','o',',',' ','I',' ','p','m',' ','h','e','r','e' };
		str3.setData(help3);
		
		CustomString str4 = new CustomString(null);
		char[] help4 = {'H','e','l','l','o',',',' ','I',' ','a','m',' ' };
		str4.setData(help4);
		
		System.out.println(" =====FUNCTIONALITY TEST===== ");
		
		System.out.println("- change case: " + str.changeCase());
		
		System.out.println("- char at: " + str.charAt(2));
		
		System.out.println("- length: " + str.length());
		
		System.out.println("- split:");
		CustomString[] arr = str.split('I');
		for (CustomString s: arr) {
			System.out.println(s);
		}
	
		System.out.println("- substring version 1: " + str.substring(3));
		
		System.out.println("- substring version 2: " + str.substring(3,6));
		
		System.out.println("- title case: " + str.titleize());
		
		System.out.println("- to lower case: " + str.toLowerCase());
		
		System.out.println("- to upper case: " + str.toUpperCase());
		
		System.out.println("- concat: " + str.concat(str));
		
		
		System.out.println("\n ---------------");
		System.out.println("2 STRINGS SAME LENGTHS; SAME CHARACTERS");
		
		System.out.println("compare to: " + str.compareTo(str2));
		
		System.out.println("equals: " + str.equals(str2));
		
		
		System.out.println("---------------");
		System.out.println("2 STRINGS SAME LENGTHS; DIFFERENT CHARACTERS");
		
		System.out.println("compare to: " + str.compareTo(str3));
		
		System.out.println("equals: " + str.equals(str3));
		
		
		System.out.println("---------------");
		System.out.println("2 STRINGS DIFFERENT LENGTHS; DIFFERENT CHARACTERS");
		
		System.out.println("compare to: " + str.compareTo(str4));
		
		System.out.println("equals: " + str.equals(str4));		
	}
}