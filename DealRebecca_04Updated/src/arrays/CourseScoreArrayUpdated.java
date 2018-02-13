/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 04 - Course Score in Arrays
 * Due Date: 2/6/18
 */

package arrays;

// Import library
import java.util.Scanner;

public class CourseScoreArrayUpdated {
	
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
		
		// Declare the arrays
		double[] ptsEarned = new double[numAssignments];
		double[] ptsMax = new double[numAssignments];
		
		// Call method to fill the arrays
		points(ptsEarned, ptsMax, numAssignments);
		
		// Call methods to calculate total earned points & total max points
		double totPtsEarned = calcTotalPts(ptsEarned);
		double totPtsMax = calcTotalPts(ptsMax);
		
		// Calculate the courseScore
		double courseScore = (totPtsEarned / totPtsMax) * 100;
		
		// Call method to display the parallel arrays
		displayArray(ptsEarned, ptsMax);
		
		// Display point totals, course score, & letter grade
		System.out.print("\n\nTotal Earned Points: ");
		System.out.printf("%.2f", totPtsEarned);
		System.out.print("\nTotal Max Points: ");
		System.out.printf("%.2f", totPtsMax);
		System.out.print("\nCourse Score: ");
		System.out.printf("%.2f", courseScore);
		System.out.println("%");
		System.out.println("Letter Grade: " + ltrGrade(courseScore));
		
		// Close input Scanner
		input.close();
		
	} // end main method
	
	// Fill arrays with point values
	public static void points(double[] ptsEarned, double[] ptsMax, int numAssignments) {
		
		// Scanner for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for point values
		for (int i = 0; i < numAssignments; i++) {
			
			ptsEarned[i] = -1;
			while (ptsEarned[i] < 0) {
				System.out.print("\nEarned pts for Assignment #" + (i+1) + ": ");
				ptsEarned[i] = input.nextDouble();
			}
			
			ptsMax[i] = 0;
			while (ptsMax[i] < 1) {
				System.out.print("Max pts for Assignment #" + (i+1) + ": ");
				ptsMax[i] = input.nextDouble();
			}
			
		} // end for loop
		
		// Close input Scanner
		input.close();
		
	} // end points method
	
	// Calculate the total points in each array
	public static double calcTotalPts(double[] ptsArray) {
		
		// Declare total points variable & initialize it to zero
		double totalPts = 0;
		
		// Accumulate points from array to total points variable
		for (int i = 0; i < ptsArray.length; i++) {
			totalPts += ptsArray[i];
		}
		
		// Return total points
		return totalPts;
		
	} // end calcTotalPts method
	
	// Display point values from the arrays
	public static void displayArray(double[] ptsEarnedArray, double[] ptsMaxArray) {
		
		// Display header
		System.out.print("\n\tEarned\t\tMax");
		
		// Display parallel arrays
		for (int i = 0; i < ptsEarnedArray.length; i++) {
			System.out.print("\n\t");
			System.out.printf("%6.2f", ptsEarnedArray[i]);
			System.out.print("\t\t");
			System.out.printf("%6.2f", ptsMaxArray[i]);
		}
		
	} // end displayArray method
	
	// Determine the letter grade
	public static char ltrGrade(double totalPtsEarned) {
		
		// Declare letter grade variable
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
		
		// Return letter grade
		return ltrGrade;
		
	} // end ltrGrade method
	
} // end class
