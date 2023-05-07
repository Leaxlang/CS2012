package _02TextFileIO;

import java.io.File;

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
		if(!new File("numberRow.txt").exists()) {
			System.out.println("missing: numberRow.txt");
		}
		if(!new File("numbersColumn.txt").exists()) {
			System.out.println("missing: numbersColumn.txt");
		}
		if(!new File("numberGrid.txt").exists()) {
			System.out.println("missing: numberGrid.txt");
		}
		if(!new File("gridStats.txt").exists()) {
			System.out.println("missing: gridStats.txt");
		}
		if(!new File("randomPeople.txt").exists()) {
			System.out.println("missing: randomPeople.txt");
		}
		if(!new File("namesList.txt").exists()) {
			System.out.println("missing: namesList.txt");
		}
		else {
			System.out.println("ALL COMPLETE");
		}
	}
}	