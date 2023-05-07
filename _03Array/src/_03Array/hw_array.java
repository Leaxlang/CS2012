package _03Array;

import java.util.Scanner;

public class hw_array{
	public static void main(String[] args) {

		int rows = howManyRows();
		int columns = howManyColumns();

		//creating the array
		int[][] box = new int[rows][columns];
		for(int i = 0; i < box.length; i++) {
			for(int j = 0; j < box[i].length; j++) {
				box[i][j]= (int)(100 + Math.random() * 900);
			}
		}

		printArray(box);
		
		System.out.println("\n----------------------------");
		
		int sum = findSum(box);
		System.out.println("the sum is: " + sum);
		
		System.out.println("the average is: " + findAverage(box, rows, columns, sum));
		
		System.out.println("the amount ouf rings: " + findConcentricRings(box, rows, columns));
		printConcentricRing(box, rows, columns);

	}
	
	//function to ask user-input for rows
	public static int howManyRows() {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rows?");
		int rows = input.nextInt();

		while((5 > rows)||(rows > 10)) {
			System.out.println("Please choose a number between 5 and 10.");
			rows = input.nextInt();
		}
		return rows;
	}
	
	//function to ask user-input for rows
	public static int howManyColumns() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many columns?");
		int columns = input.nextInt();

		while((5 > columns)||(columns > 10)) {
			System.out.println("Please choose a number between 5 and 10.");
			columns = input.nextInt();
		}
		return columns;
	}

	//function to print the array
	public static void printArray(int [][] myArr) {
		for(int i = 0; i < myArr.length; i ++) {
			System.out.println(" ");
			for(int j = 0; j < myArr[i].length; j ++) {
				System.out.print(myArr[i][j] + " ");
			}
		}
	}

	//function to calculate the sum of the array
	public static int findSum(int [][] myArr) {
		int sum = 0;
		for(int i = 0; i < myArr.length; i ++) {
			for(int j = 0; j < myArr[i].length; j ++) {
				sum += myArr[i][j];
			}
		}
		return sum;
	}

	//function to calculate the average of the array
	public static int findAverage(int box[][], int rows, int columns, int sum) {
		int average = sum/(rows*columns);
		return average;

	}

	//function to find out the amount of concentric rings
	public static int findConcentricRings(int box[][], int rows, int columns) {
		if(rows < columns) {
			return rows/2;
		}else {
			return columns/2;
		}

	}
	
	//function that prints the outer ring
	public static void printConcentricRing(int box[][],int row, int column) {
		int sum = 0;
		int counter = 0;

		System.out.println("Outer ring elements listed going clockwise:");

		//from top-right to bottom-right
		for(int i = 0; i < row;i++) {
			System.out.print(box[i][column-1] + " ");
			sum += box[i][column-1];
			counter++;
		}
		//from bottom-right to bottom-left
		for(int i = column-2; i > 0 ;i--) {
			System.out.print(box[row-1][i] + " ");
			sum += box[row-1][i];
			counter++;
		}
		//from bottom-left to top-left
		for(int i = row - 1; i > 0; i-- ) {
			System.out.print(box[i][0] + " ");
			sum += box[i][0];
			counter++;
		}
		//from top-left to top-right
		for(int i = 0; i < column - 1; i++) {
			System.out.print(box[0][i] + " ");
			sum += box[0][i];
			counter++;
		}
		System.out.println("");
		System.out.println("Sum of the outer ring: " + sum);
		System.out.println("Average of the outer ring: " + sum/counter);
	}

}
