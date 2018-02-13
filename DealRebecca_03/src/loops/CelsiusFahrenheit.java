/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 03 - Convert Celsius/Fahrenheit
 * Due Date: 1/30/18
 */

package loops;

// import library
import java.util.Scanner;

public class CelsiusFahrenheit {
	
	static Scanner input = new Scanner(System.in); // for user input

	public static void main(String[] args) {
		double celsius = 0, fahrenheit = 32; // declare starting temperatures
		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius"); // header
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < 20; i++) { // for loop to print 20 rows of data
			System.out.print(celsius + "\t\t");
			System.out.printf("%3.2f", cToF(celsius)); // format converted temperature to 2 decimal places
			System.out.print("\t\t|\t" + fahrenheit + "\t\t");
			System.out.printf("%3.2f", ftoC(fahrenheit)); // format converted temperature to 2 decimal places
			System.out.println();
			celsius += 2.5; // increment Celsius column by 2.5
			fahrenheit += 5; // increment Fahrenheit column by 5
		}
	} // end main

	// convert Celsius to Fahrenheit
	public static double cToF(double celsius) {
		return celsius * 9/5 + 32;
	} // end cToF
	
	// convert Fahrenheit to Celsius
	public static double ftoC(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	} // end fToC
	
} // end class
