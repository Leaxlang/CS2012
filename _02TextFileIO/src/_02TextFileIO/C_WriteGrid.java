package _02TextFileIO;

import java.io.File;
import java.io.PrintWriter;

//#3 - program that writes a file named numberGrid.txt
//write a set of 100 random numbers with values between 0 a 20
//The numbers should be arraigned as 10 lines that each contains 10 numbers

public class C_WriteGrid{
	public static void main(String[] args) {
		try {
			File numberGrid = new File("numberGrid.txt");
			PrintWriter printout = new PrintWriter(numberGrid);
			
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					printout.print(((int)(0 + Math.random() * 21)) + " ");
				}
				printout.println("");
			}
			printout.flush();
			printout.close();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
	}

}