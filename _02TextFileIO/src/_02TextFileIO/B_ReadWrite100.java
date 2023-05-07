package _02TextFileIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//#2 - program that reads all the numbers from the file named numberRow.txt you just made
//write those numbers out to a new file numbersColumn.txt
//the new file will have all the numbers listed one per line

public class B_ReadWrite100{
	public static void main (String[] args) {
		List<Integer> numberStorage = new ArrayList<>();

		try {
			File numberRow = new File("numberRow.txt");
			Scanner scanner = new Scanner(numberRow);

			while(scanner.hasNextInt()) {  
				int temp = scanner.nextInt();
				numberStorage.add(temp);

			}
			scanner.close();

		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		
		try {
			File numbersColumn = new File("numbersColumn.txt");
			PrintWriter printout = new PrintWriter(numbersColumn);
			
			numberStorage.forEach(printout::println);
			printout.flush();
			printout.close();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
	}
}