/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 05 - Carpet/Flooring Calculator
 * Due Date: 2/13/18
 */

package objects.classes;

import java.util.Scanner;

public class CarpetCalcDemo {

	public static void main(String[] args) {
		
		// scanner for user input
		Scanner input = new Scanner(System.in);
		
		// create objects of the Measure class
		Measure defaultRoom = new Measure(); // use no-arg constructor
		Measure userRoom = new Measure(); // use no-arg constructor
		Measure scheduledRoom = new Measure(9.75, 12.5, 15.99); // use overloaded constructor & pass values
		
		// declare variables
		double length, width, price;
		
		// prompt user for length
		System.out.print("Length: ");
		length = input.nextDouble();
		
		// validate that the length is at least 10.0
		while (length < 10.0) {
			System.out.print("  Length must be at least 10.0. Please try again: ");
			length = input.nextDouble();
		}
		
		// prompt user for width
		System.out.print("\nWidth: ");
		width = input.nextDouble();
		
		// validate that the width is at least 10.0
		while (width < 10.0) {
			System.out.print("  Width must be at least 10.0. Please try again: ");
			width = input.nextDouble();
		}
		
		// prompt user for price
		System.out.print("\nPrice per square foot: ");
		price = input.nextDouble();
		
		// validate that the price is at least $1.50
		while (price < 1.5) {
			System.out.print("  Price must be at least $1.50. Please try again: ");
			price = input.nextDouble();
		}
		
		// set attributes for user inputed Measure object
		userRoom.setLength(length);
		userRoom.setWidth(width);
		userRoom.setPrice(price);
		
		// display results
		System.out.println("\nRoom 1 (default):" + defaultRoom.toString()); // explicit toString
		System.out.println("\nRoom 2 (user input):" + userRoom); // implicit toString
		System.out.println("\nBradenton Co-op (scheduled purchase):" + scheduledRoom); // implicit toString
		
		// close input Scanner
		input.close();
		
	} // end main method

} // end CarpetCalcDemo class
