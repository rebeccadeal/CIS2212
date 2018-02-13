package file4_validateWhileLoop;

import java.util.Scanner;

public class ValidateWhileLoopDemo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter a positive integer: ");
		number = input.nextInt();
		
		// don't use if statements for validation, use while loops instead
	/*	if (number <= 0) {
			System.out.print(number + " is <= 0. Please try again: ");
			number = input.nextInt();
		}
		else {
			System.out.println(number + " is > 0.");
		}
	*/
		// validate with a while loop
		while (number <= 0) {
			System.out.print(number + " is <= 0. Please try again: ");
			number = input.nextInt();
		}
		
		System.out.println("Positive number: " + number);
		
		input.close();
		
	} // end main method

} // end ValidateWhileLoopDemo class
