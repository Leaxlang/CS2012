package assignment1;

import java.util.*;

public class Three {
	public static void main(String[] args) {
		System.out.println("Please input integer.");
		
		boolean isValid = false;

		//this while loop while run as long as the input never was an int or 'quit'
		while (!isValid) {
			Scanner scanner = new Scanner(System.in);   
		    
			//check id input was 'quit'
			if(scanner.hasNext("quit")){
		    	System.exit(0);
		        scanner.close();
		    }
			//check if input was an integer
			else if (scanner.hasNextInt()){
		        isValid = true;
		        System.out.println(scanner.nextInt());
		        scanner.close();
		        System.exit(0);
			}
			//print a failure message to user
		    else {
		        System.out.println("Invalid input. Please type a number");
		    }
		}
		
	}
	

}
