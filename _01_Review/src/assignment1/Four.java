package assignment1;

import java.util.Scanner;

public class Four {
	
    public static void main(String[] args) {
    	
    	float input = getUserInput();
        float result = squareValue(input);
        System.out.print(result);
    }
    
    //this method asks the user for a float and returns it
    public static float getUserInput() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a float.");
        float userInput = scanner.nextFloat();
        scanner.close();
        return userInput;
    }
    
    //this method squares a given float value
    public static float squareValue(float num) { 
        return num * num;
    }
}

