package assignment2;

import java.io.File;
import java.util.Scanner;

//#7 - write a program that checks if all the program generated Activity Lab files exist in the project folder (assumes Eclipse IDE).
//    writes to the console "all complete" and lists the file names, or "missing files" list the files with "missing" in front of the absent files.
//
//The file names to check for are:
//
//numberRow.txt
//numbersColumn.txt
//numberGrid.txt
//gridStats.txt
//randomPeople.txt
//namesList.txt 

public class G_FilesValid{
	public static void main(String[] args) {
		try {
			File numberGrid = new File("src/assignment2/numberRow.txt");
			Scanner scanner = new Scanner(numberGrid);
			System.out.println("ALL COMPLETE");
			
		}
		catch(Exception e) {
			System.out.println("Missing: numberRow.txt");
		}
	}
}