package _02TextFileIO;

import java.io.*;
import java.util.*;

//#5 - program that reads the name data from the provided files named firstNames.txt and lastNames.txt
//    and produces a list of 1000 random names  randomPeople.txt
//    one complete name (firstname lastname) per line

public class E_WriteName{
	public static void main(String[] args) {
		List<String> firstNameStorage = new ArrayList<>();
		List<String> lastNameStorage = new ArrayList<>();
	
		//reading firstnames and storing them in a list
		try {
			File firstNames = new File("firstNames.txt");
		
			Scanner scanner = new Scanner(firstNames);

			while(scanner.hasNext()) {  
				String temp = scanner.next();
				firstNameStorage.add(temp);

			}
			scanner.close();

		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		//reading last names and storing them in a list
		try {
			File lastNames = new File("lastNames.txt");
		
			Scanner scanner = new Scanner(lastNames);

			while(scanner.hasNext()) {  
				String temp = scanner.next();
				lastNameStorage.add(temp);

			}
			scanner.close();

		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		//making the new file
		try {
			File randomPeople = new File("randomPeople.txt");

			PrintWriter printout = new PrintWriter(randomPeople);
			Random rand = new Random();
			for(int i = 0; i < 1000; i++) {
				printout.println(firstNameStorage.get(rand.nextInt(firstNameStorage.size())) + " " + lastNameStorage.get(rand.nextInt(lastNameStorage.size())));
			}
			printout.flush();
			printout.close();

		}
		catch(Exception e) {
			System.err.println(e);
		}	
	
		
		
	}
}