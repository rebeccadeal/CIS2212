/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 02 - BMI Calculator
 * Due Date: 1/23/18
 */

package methods;

// Import libraries
import java.util.Scanner;

public class BMICalculatorUpdated {
	
	static Scanner input = new Scanner(System.in); // for user input

	public static void main(String[] args) {
				
		// Declare variables
		String firstName, lastName, fullName, id;
		double bmi;
		
		// Prompt user for first name, last name, height, & weight
		System.out.println("BMI Calculator");
		System.out.println("--------------");
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		
		// Get bmi, fullName, & id from respective methods
		bmi = getHeightWeight();
		fullName = concatNames(firstName, lastName);
		id = createID(lastName);
		
		// Display values from methods
		System.out.println("\n" + fullName);
		System.out.println("ID#:\t" + id);
		String strFormat = String.format("%.3f", bmi);
		System.out.println("BMI:\t" + strFormat);
		
		// Determine & display the categorization of the BMI
		if (bmi < 18.5) {
			System.out.println("A BMI of less than 18.5 is considered underweight.");
		}
		else if (bmi < 24.9) {
			System.out.println("A BMI between 18.5 and 24.9 is considered normal range.");
		}
		else if (bmi < 29.9) {
			System.out.println("A BMI between 24.9 and 29.9 is considered overweight.");
		}
		else {
			System.out.println("A BMI over 29.9 is considered obese.");
		}
		
	} // end main
	
	// Concatenate the user's first & last names
	public static String concatNames(String first, String last) {
		
		String full = first + " " + last;
		return full;
		
	} // end concatNames
	
	// Validate the user's height & weight, & calculate the BMI
	public static double getHeightWeight( ) {
		
		double height, weight, bmi;

		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		if ((height < 36) || (height > 84)) {
			System.out.println("\nHeight must be between 36 & 84 inches, inclusive.");
			System.out.println("Please try again.");
			System.exit(0);
		}
		
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		if ((weight < 50) || (weight > 600)) {
			System.out.println("\nWeight must be between 50 & 600 pounds, inclusive.");
			System.out.println("Please try again.");
			System.exit(0);
		}
		
		bmi = calcBMI(height, weight);
		return bmi;

	} // end getHeightWeight
	
	// Create the ID from a random number & the first two letters of the last name
	public static String createID(String last) {
		
		int idNum;
		String id;
		
		final int MINIMUM = 1000;
		final int MAXIMUM = 9999;

		idNum = (int)(Math.random() * (MINIMUM - MAXIMUM) + MAXIMUM);
		last = last.toUpperCase();
		last = last.substring(0, 2);
		id = idNum + last;
		return id;
		
	} // end createID
	
	// Calculate the BMI from the height & weight
	public static double calcBMI(double ht, double wt) {
		
		double bmi = (wt/(ht*ht))*703;
		return bmi;
		
	} // end calcBMI

} // end class
