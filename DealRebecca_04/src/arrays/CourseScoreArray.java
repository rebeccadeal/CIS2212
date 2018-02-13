/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 04 - Course Score in Arrays
 * Due Date: 2/6/18
 */

package arrays;

// Import library
import java.util.Scanner;

public class CourseScoreArray {
	
	public static void main(String[] args) {
		
		// Scanner for user input
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		int numAssignments = 0;
		
		// Prompt user for the number of assignments & validate with while loop
		while (numAssignments < 1) {
			System.out.print("How many assignments (at least 1): ");
			numAssignments = input.nextInt();
		}
		System.out.println();
		
		// Call methods to create the parallel arrays
		double[] ptsEarned = ptsEarned(numAssignments);
		System.out.println();
		double[] ptsMax = ptsMax(numAssignments);
		
		// Call methods to calculate total earned points & total max points
		double totPtsEarned = calcTotalPts(ptsEarned);
		double totPtsMax = calcTotalPts(ptsMax);
		
		// Calculate the courseScore
		double courseScore = (totPtsEarned / totPtsMax) * 100;
		
		// Call method to display the parallel arrays
		displayArray(ptsEarned, ptsMax);
		
		// Display point totals, course score, & letter grade
		System.out.println("\nTotal Earned Points: " + totPtsEarned);
		System.out.println("Total Max Points: " + totPtsMax);
		System.out.println("Course Score: " + courseScore + "%");
		System.out.println("Letter Grade: " + ltrGrade(courseScore));
		
		// Close input Scanner
		input.close();
		
	} // end main method
	
	public static double[] ptsEarned(int numAssignments) {
		
		// Scanner for user input
		Scanner input = new Scanner(System.in);
		
		// Create array for earned points
		double[] ptsEarnedArray = new double[numAssignments];
		
		// Prompt user for earned points & validate with while loop
		for (int i = 0; i < numAssignments; i++) {
			ptsEarnedArray[i] = -1;
			while (ptsEarnedArray[i] < 0) {
				System.out.print("Earned pts for Assignment #" + (i+1) + ": ");
				ptsEarnedArray[i] = input.nextDouble();
			}
		}
		
		// Close input Scanner
		input.close();
				
		// Return the array
		return ptsEarnedArray;
		
	} // end ptsEarned method
	
	public static double[] ptsMax(int numAssignments) {
		
		// Scanner for user input
		Scanner input = new Scanner(System.in);
				
		// Create array for max points
		double[] ptsMaxArray = new double[numAssignments];
				
		// Prompt user for max points & validate with while loop
		for (int i = 0; i < numAssignments; i++) {
			ptsMaxArray[i] = 0;
			while (ptsMaxArray[i] < 1) {
				System.out.print("Max pts for Assignment #" + (i+1) + ": ");
				input.nextLine();
				ptsMaxArray[i] = input.nextDouble();
			}
		}
				
		// Close input Scanner
		input.close();
						
		// Return the array
		return ptsMaxArray;
		
	} // end ptsMax method
	
	public static double calcTotalPts(double[] ptsArray) {
		
		double totalPts = 0;
		
		for (int i = 0; i < ptsArray.length; i++) {
			totalPts += ptsArray[i];
		}
		
		return totalPts;
		
	} // end calcTotalPts method
	
	public static void displayArray(double[] ptsEarnedArray, double[] ptsMaxArray) {
		
		System.out.println("\n\tEarned\t\tMax");
		
		for (int i = 0; i < ptsEarnedArray.length; i++) {
			System.out.println("\t" + ptsEarnedArray[i] + "\t\t" + ptsMaxArray);
		}
		
	} // end displayArray method
	
	public static char ltrGrade(double totalPtsEarned) {
		
		char ltrGrade;
		
		// Select letter grade character with if/else statement
		if (totalPtsEarned >= 90) {
			ltrGrade = 'A';
		}
		else if (totalPtsEarned >= 80) {
			ltrGrade = 'B';
		}
		else if (totalPtsEarned >= 70) {
			ltrGrade = 'C';
		}
		else if (totalPtsEarned >= 60) {
			ltrGrade = 'D';
		}
		else {
			ltrGrade = 'F';
		}
		
		return ltrGrade;
		
	} // end ltrGrade method
	
} // end class
