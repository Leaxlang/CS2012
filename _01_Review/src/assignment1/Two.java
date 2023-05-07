package assignment1;
import java.util.*;

public class Two{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String input
        System.out.println("Please input a String:");
        String StringInput = input.nextLine();
        System.out.println(StringInput);

        //Integer input
        System.out.println("Please input a Integer:");
        int IntInput = input.nextInt();
        System.out.println(IntInput);

        input.nextLine();  // Consume newline left-over 
        
        //Anything input and test for input type
        System.out.println("Please input anything:");

        if(input.hasNextInt()) {
        	System.out.println("This input is integer.");
        }else if(input.hasNextFloat()) {
        	System.out.println("This input is float");
        }else {
        	System.out.println("This input is string");
        }
        
        input.close();
    }
	
}
