// This is a demo of switch statements. We'll go over this in detail in the next class.

package p1;

import java.util.Scanner;

public class SwitchCaseDemo {

	// create Scanner object here as global Scanner object if user input is in main method AND in static methods
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// create Scanner object for user input
//		Scanner input = new Scanner(System.in);  // create Scanner object here if user input is just in main method
		
		// set up menu for user
		System.out.println("  1. Senior - 65+ years old");
		System.out.println("  2. Adult - 18+ & not in school");
		System.out.println("  3. Student - kindergarten through college");
		System.out.println("  4. Child - not yet in school");
		System.out.print("Enter type of ticket (1, 2, 3, 4): ");  // prompt the user
		
		int ticket1 = input.nextInt();
		
		// validate user input is correct
		if(ticket1 < 1 || ticket1 > 4) {
			System.out.println("\nChoice must be 1 - 4. Please try again.");
			ticket1 = input.nextInt();
			tickets(ticket1);  // call the method
		}
		else {
			// call the method to start the process
			tickets(ticket1);			
		}
		
		System.out.println("Thank you for your purchase.");
	
		// close the Scanner object. MUCH better to close than to suppress warnings (see line 13)
		input.close();
		
	} // end main

//  -------- notice the method begins after the main method ends but before the class ends 
	
	// create method to hold the switch statement
	public static void tickets(int ticType) {
		
		String ticketType;
		
		// create switch statements - based on the value of the variable
		switch(ticType) {
			case 1: ticketType = "Senior";
				break;
			case 2: ticketType = "Adult";
				break;
			case 3: ticketType = "Student";
				break;
			case 4: ticketType = "Child";
				break;
			default: ticketType = "Invalid Choice. Please try again.";
				System.exit(1);  // terminate program with a problem.
				break;
		} // end switch statement
		
		System.out.println("\nTicket \"type\" is " + ticketType);  // the word type is in quotes using escape character
		
	} // end tickets method

} // end class
