package _02TextFileIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


//#6 - program that reads the file named randomPeople.txt 
//sort all the names alphabetically by last name
//write all the unique names to a file named namesList.txt , there should be no repeats

public class F_SortName{
	public static void main(String[] args) {
		
		String[] names = readingPeopleFile();
		
		
		names = swapNames(names);
		
		Arrays.sort(names);

		names = deletingDuplicates(names);

		names = cleanArray(names);

		writingPeopleFile(names);

		}
		
	//creating a new file names namesList.txt
	public static void writingPeopleFile(String[] finalNameList) {
		try {
			File namesList = new File("namesList.txt");
			PrintWriter printout = new PrintWriter(namesList);
			printout.println("name");
			for(String name : finalNameList) {
				printout.println(name);
			}
			printout.flush();
			printout.close();
		}
		catch(Exception e) {
			System.out.println("1");
			System.err.println(e);
		}
	}


	//reading the randomPeople.txt file
	public static String[]readingPeopleFile() {
		try {
			File randomPeople = new File("randomPeople.txt");
			Scanner scanner = new Scanner(randomPeople);

			String[] names = new String[1000];
			int index = 0;

			while(scanner.hasNext()) {  
				names[index] = scanner.nextLine();
				index++;
			}
			
			scanner.close();
			return names;
			
		}catch(Exception e) {
				System.err.println(e);
			}
		return null;
		
	}

	//deleting duplicate names
	private static String[] deletingDuplicates(String[] names) {
		String[] temp = new String[names.length];
		int tempIndex = 0;
		for(int i = 0; i < names.length -1; i++) {
			if (!(names[i].equals(names[i + 1]))) {
				temp[tempIndex] = names[i];
				tempIndex++;
			}
		}
		return temp;
		
	}

	//swapping first and last name
	public static String[] swapNames(String[] names) {
		int index = 0;
		for(String name : names) {
			String[] parts = name.split(" ");
			String part1 = parts[0]; 
			String part2 = parts[1];
			names[index]=part2.concat(" ").concat(part1);
			index++;
			
		}
		return names;

	}
	//cleaning Array of 'null's
	public static String[] cleanArray(String[] array) {
		int counter = 0;
		for(String name:array) {
			if (name != null) {
				counter++;
			}
		}
		String[] resultingArray = new String[counter];
		for(int i = 0; i < counter; i++) {
			resultingArray[i] = array[i];
		}
		return resultingArray;
	}

}