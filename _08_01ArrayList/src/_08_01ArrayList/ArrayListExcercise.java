package _08_01ArrayList;

import java.io.File;
import java.util.*;


public class ArrayListExcercise{
	public static void main(String[] args) {
		
		//Write a program that creates an ArrayList of Strings. Make up ten or more random words (all lowercase) and put them in the ArrayList 
		//in any way you choose. Display them on the screen.
		
		ArrayList <String> sentence1 = new ArrayList<String>(Arrays.asList("write","a","program","that","creates","an","arraylist","of","strings","ok"));
		System.out.println("ArrayList before: " + sentence1);

		theSortingCode(sentence1);
		System.out.println("ArrayList after: " + sentence1);
		
		//Then, using the String ArrayList sorting function you already wrote, store a sentence in an arrayList of Strings 
		//(where each word is an element in the ArrayList).Put the words in alphabetical order and print them out again.
		ArrayList <String> sentence2 = new ArrayList<String>(Arrays.asList("write","another","program","that","creates","an","arraylist","of","strings","ok"));
		System.out.print("Sentence: ");
		for(String s:sentence2) {
			System.out.print(s + " ");
		}
		theSortingCode(sentence2);
		System.out.println("Sorted: " + sentence2);
		
		
		theCarMethod();
		
	}
	
	//Then, using the sort of your choice, arrange the words in alphabetical order and display them again.
	//Put the sorting code in its own function.
	public static void theSortingCode(ArrayList <String> list) {
		Collections.sort(list);
	}
	
	public static void theCarMethod() {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("From which file do you want to load this information?");
		String fileName = input.nextLine();
		
		try {
			File data = new File(fileName);
		
			Scanner scan = new Scanner(data);
			
			while(scan.hasNext()) {  
				String line = scan.nextLine();
				String make =line.split(",")[0];
				String model = line.split(",")[1];
				String year = line.split(",")[2];
				int year2 = Integer.parseInt(year);
				String licensePlate = line.split(",")[3];

				cars.add(new Car(make, model, year2, licensePlate));

			}
			scan.close();
			System.out.println("Data loaded.");
			
			cars.sort((car1, car2)
					-> car1.getYearAsInteger().compareTo(
						car2.getYearAsInteger()));
			System.out.println("Cars: " + cars);
			

		}
		catch(Exception e) {
			System.err.println(e);
		}
		
	}
}