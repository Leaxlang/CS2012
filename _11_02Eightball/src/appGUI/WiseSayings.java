package appGUI;

/*
 * GROUP-1:
 * Alondra Perez 
 * Lea Lang
 * Naomi Shah
 */

import java.io.File;
import java.util.Scanner;
import java.util.*;

public class WiseSayings {
	ArrayList<String> sayingsList = new ArrayList<String>();
	
	//loading sayings from text file into ArrayList
	public WiseSayings() {
		try {
			File sayingsFile = new File("Sayings.txt");
		
			Scanner scanner = new Scanner(sayingsFile);

			while(scanner.hasNext()) {  
				String temp = scanner.nextLine();
				sayingsList.add(temp);
			}
			scanner.close();
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
	//Selecting a random saying from list
	String getRandomSaying() {
		int length = sayingsList.size();
		int random = (int) (Math.random() * length);
		return sayingsList.get(random);
	}
}
