package assignment1;

import java.util.*;
import java.io.*;

public class Five {
	public static void main(String[] args) {

		//creating all necessary variables
		int sum = 0;
		float average = 0;
		int lineCount = 0;
		List<Integer> originalColumn = new ArrayList<>();

		//the path for the document that is being read
		String pathString = "src/assignment1/numbers.txt";
		
		//this try-block reads the numbers file
		try {
			File aFile = new File(pathString);
			Scanner scanner = new Scanner(aFile);

			while(scanner.hasNextLine()) {  
				int temp = scanner.nextInt();
				sum += temp;
				lineCount++;
				//to print the original column at the end, the values get stored in a list
				originalColumn.add(temp);

			}
			scanner.close();
			average = sum/(float)lineCount;

		}
		catch(Exception e) {
			System.err.println(e);
		}

		//this try-block create the new result doc and writes in it
		try {
			File result = new File("src/assignment1/results.txt");
			PrintWriter printout = new PrintWriter(result);
			printout.println("The sum is: " + sum);
			printout.println("The average is: " + average);
			printout.println("------- \n The original column of numbers was:");
			originalColumn.forEach(printout::println);
			printout.flush();
			printout.close();
		}
		catch(Exception e) {
			System.err.println(e);
		}


	}
}
