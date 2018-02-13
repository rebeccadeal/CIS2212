package p2DeptFloorDemo;

import java.util.Scanner;

public class Departments {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// create constant for number of elements
		final int NUM_ELEMENTS = 3;
		// if you leave this constant uninitialized, then you can prompt the user for it, & then it can't be changed
		
		// declare & create array to fill with user input
		String[] dept = new String[NUM_ELEMENTS];
		int[] floor = new int[NUM_ELEMENTS];
		
		// get user input
		System.out.println("Enter " + NUM_ELEMENTS + " departments & floors: ");
		
		for (int i = 0; i < dept.length; i++) {
			
			System.out.print(" Dept. name: ");
			dept[i] = input.nextLine();
			
			System.out.print(" Floor #: ");
			floor[i] = input.nextInt();
			input.nextLine();
			
			// validate for values less than 1
			while (floor[i] < 1) {
				System.out.println("Invalid floor #. Please try again.");
				System.out.print(" Floor #: ");
				floor[i] = input.nextInt();
			} // end while loop
			
		} // end for loop
		
		// display the results
		System.out.println();
		displayArray(dept, floor);
		
		input.close();
		
	} // end main method
	
	public static void displayArray(String[] deptArray, int[] floorArray) {
		
		for (int i = 0; i < deptArray.length; i++) {
			System.out.println("Dept. " + deptArray[i] + " is on Floor #" + floorArray[i]);
		}
		
	} // end displayArray method

} // end class
