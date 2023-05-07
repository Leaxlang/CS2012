package _02TextFileIO;
 
import java.io.File;
import java.io.PrintWriter;


//#1 - program that writes a file named numberRow.txt
//    write a set of 100 random numbers with values between 0 and 1000
//    the numbers should all be on the same line separated by a space


public class A_Write100{
	public static void main(String[] args) {
		
		try {
			File numberRow = new File("numberRow.txt");
			PrintWriter printout = new PrintWriter(numberRow);
			
			for(int i = 0; i < 100; i++) {
				printout.print(((int)(0 + Math.random() *1001)) + " ");
			}
			printout.flush();
			printout.close();
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}

}