package _02TextFileIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//#4 - program that reads all the numbers from the file named numberGrid.txt you just made
//make a new file named gridStats.txt that contains statistics about that list of numbers
//grand total
//totals by row 
//totals by column
//average values of all numbers 
//the count of how many times the number 17 is in the list 

public class D_WriteStats{
	public static void main(String[] args) {

		try {
			File numberGrid = new File("numberGrid.txt");
			Scanner scanner = new Scanner(numberGrid);
			int[][] numbers = new int[10][10];

			int i = 0;
			int j = 0;

			//filling array with numbers from the grid
			while(scanner.hasNext()) {
				while(i<10) {
					numbers[i][j] = scanner.nextInt(); 
					i++;
				}
				i = 0;
				j++;
			}
			scanner.close();

			try {
				File numberRow = new File("gridStats.txt");
				PrintWriter printout = new PrintWriter(numberRow);

				printout.println("the sum is: " + findSum(numbers));
				printout.println("the average is: " + findAverage(numbers, findSum(numbers)));

				//prints the totals per row
				printout.println("the totals per row are: ");

				int sum = 0;
				for(int a = 0; a < 10; a++) {
					for(int b = 0; b < 10; b++) {
						sum += numbers[a][b];
					}		
					printout.println(a+1 + ". row: " + sum);
					sum = 0;

				}

				//prints the totals per column
				printout.println("the totals per column are: ");

				int sum2 = 0;
				for(int c = 0; c < 10; c++) {
					for(int d = 0; d < 10; d++) {
						sum2 += numbers[d][c];
					}		
					printout.println(c+1 + ". column: " + sum2);
					sum2 = 0;

				}

				printout.println("the amount of 17's: " + count17(numbers));
				printout.flush();
				printout.close();
			}
			catch(Exception e) {
				System.err.println(e);
			}



		}catch(Exception e) {
			System.err.println(e);
		}

	}

	//function to calculate the sum of the array
	public static int findSum(int [][] myArr) {
		int sum = 0;
		for(int i = 0; i < myArr.length; i ++) {
			for(int j = 0; j < myArr.length; j ++) {
				sum += myArr[i][j];
			}
		}
		return sum;
	}

	//function to calculate the average of the array
	public static int findAverage(int box[][], int sum) {
		int average = sum/(100);
		return average;

	}

	//function to calculate the amount of 17s in the grid
	public static int count17(int [][] myArr) {
		int counter = 0;
		for(int i = 0; i < myArr.length; i ++) {
			for(int j = 0; j < myArr.length; j ++) {
				if(myArr[i][j] == 17) {
					counter++;
				}
			}
		}
		return counter;
	}
}
