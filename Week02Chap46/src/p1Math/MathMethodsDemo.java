package p1Math;

import java.text.NumberFormat;
import java.util.Scanner;

public class MathMethodsDemo {
			
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		// string literal
		System.out.println("Hello World in line 8");
		
		// call the method - do not pass any values to the method
		helloWorld();
		helloWorld();
		helloWorld();

		System.out.println("\nback in the main method again");
		
		// pass a value into the method
		int number = 0;
		ifNumZero(number); // call the method & pass the value
		
		// pass a value into a method & return the value
		double returnResult = powMethod(number); // call the method & assign the value to a new variable
		System.out.println("\nResult: " + returnResult);
		
		// prompt user
		double num1 = 2, num2 = 2;
		System.out.print("enter the base: ");
		num1 = input.nextDouble();
		System.out.print("enter the base: ");
		num2 = input.nextDouble();
		double returnRes = powMethod(num1, num2); // call the overloaded method
		System.out.println("\nResult: " + returnRes); 
		
		// format for currency
		NumberFormat currencyUSD = NumberFormat.getCurrencyInstance();
		System.out.println("\nreturnRes formatted as currency: " + currencyUSD.format(returnRes));
		
		input.close();
		
	} // end main
	
	// create method called helloWorld
	public static void helloWorld() {
		System.out.println("\"Hello World\" from the method");
	} // end helloWorld method
	
	// create method to check if a value is 0
	public static void ifNumZero(int num) {
		
		if (num > 0) {
			System.out.println(num + " is greater than zero.");
		}
		else if (num == 0) {
			System.out.println(num + " has a value of exactly 0.");
		}
		else if (num < 0) {
			System.out.println(num + " is less than zero.");
		}
		else {
			System.out.println("There must be a problem here.");
		}
		
		// call the helloWorld method INSIDE this method
		helloWorld();
		
	} // end ifNumZero method
	
	// create method - pass in a value & return a value
	public static double powMethod(int num) {
		
		double result; // variable to hold the result
		
		result = Math.pow(num, 3); // value passed in & cubed
		
		return result;
		
	} // end powMethod method
	
	// overloaded method uses same name, but different parameters
	public static double powMethod(double base, double exp) {
		
		double result;
		
		result = Math.pow(base, exp);
		
		return result;
		
	} // end overloaded powMethod method
	
} // end class
