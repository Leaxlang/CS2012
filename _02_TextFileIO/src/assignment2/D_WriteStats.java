package assignment2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//#4 - program that reads all the numbers from the file named numberGrid.txt you just made
//make a new file named gridStats.txt that contains statistics about that list of numbers
//grand total
//totals by row 
//totals by column
//average values of all numbers 
//the count of how many times the number 17 is in the list 

public class D_WriteStats{
	public static void main(String[] args) {
		int grandTotal; 
		int average;
		int counter17;

		
		try {
			File numberGrid = new File("src/assignment2/numberGrid.txt");
			Scanner scanner = new Scanner(numberGrid);

			while(scanner.hasNext()) {  
				int temp = scanner.nextLine();
				//numberStorage.add(temp);
				
				
				if (temp == 17) {
					counter17++;
				}

			}
			scanner.close();

		}
		catch(Exception e) {
			System.err.println(e);
		}
//		
//		try {
//			File gridStats = new File("src/assignment2/gridStats.txt");
//			PrintWriter printout = new PrintWriter(gridStats);
//			printout.println("The grand total is: " + grandTotal);
//			numberStorage.forEach(printout::println);
//			printout.flush();
//			printout.close();
//		}
//		catch(Exception e) {
//			System.err.println(e);
//		}
		
		
	}
}