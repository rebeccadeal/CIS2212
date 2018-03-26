package p1;

import java.util.Scanner;

public class AnnualRainfall {
	
	static int NUM_MONTHS = 12;
	
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		// declare 2 arrays
		String[] months = {
			"January", "February", "March", "April",
			"May", "June", "July", "August",
			"September", "October", "November", "December"
		};
		double[] rainfall = new double[NUM_MONTHS];
		
		// user prompt
		System.out.println("Enter rainfall in inches: ");
		
		//
		for (int i = 0; i < months.length; i++) {
			
			System.out.println("    Rainfall for " + months[i] + ": ");
			rainfall[i] = input.nextDouble(); // user input fills the array
			
			while (rainfall[i] < 0) {
				System.out.println("    \nRainfall must be 0 or greater. Please try again.");
				System.out.println("    Rainfall for " + months[i] + ": ");
				rainfall[i] = input.nextDouble(); // user input fills the array
			} // end while loop
			
		} // end for loop
		
		// call the methods to sum the rainfall & to calc average
		totalRainfall(rainfall);
		
		input.close();
		
	} // end main method
	
	// create method to sum the rainfall to get an annual value & also calculate the average rainfall
	public static double totalRainfall(double[] rain) {
		
		double sum = 0;
		
		for (int i = 0; i < rain.length; i++) {
			sum += rain[i];
		}
		
		System.out.printf("Total annual rainfall: %,4.2f", sum);
		avgRainfall(sum);
		
		return sum;
		
	} // end totalRainfall method
	
	// create method to calculate average monthly rainfall
	public static double avgRainfall(double sum) {
		
		double avg = sum / NUM_MONTHS;
		
		System.out.printf("\nAverage annual rainfall: %,4.2f", avg);
		return avg;
		
	} // end avgRainfall method

} // end AnnualRainfall class
