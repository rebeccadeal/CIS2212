package p1;

// imported libraries
import java.util.Scanner;

public class SalesTax {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // for user input
		double sales, taxAmt, totalSales, discount;
	//	double totalSales; // another way to declare a variable;
		final double TAX_RATE = 0.07; // once a constant is set, it can't be changed
		// "final" is the keyword for a constant
		
		System.out.println("Enter amount of sale: ");
		sales = input.nextDouble();
		
		taxAmt = sales + TAX_RATE;
		
		totalSales = sales + taxAmt;
		
		System.out.println(" (before discounts) Tax Amount: $" + taxAmt);
		System.out.println(" (before discounts) Total Sale is $" + totalSales);
		
		// use selections to determine an action/response
		if(sales > 1000.0) {
			discount = 0.1;		// discount is 10%
			sales -= (sales * discount);
			taxAmt = sales * TAX_RATE;
			totalSales = sales + taxAmt;
		}
		else if(sales < 1000.0) {
			discount = 0.0;		// no discount
			sales -= (sales * discount);
			taxAmt = sales * TAX_RATE;
			totalSales = sales + taxAmt;
		}
		else if(sales == 1000.0) {
			discount = 0.05;		// discount is 5%
			sales -= (sales * discount);
			taxAmt = sales * TAX_RATE;
			totalSales = sales + taxAmt;
		}
		
		System.out.println();
		System.out.println("Tax Amount: $" + taxAmt);
		System.out.println("\nTotal Sale is $" + totalSales);

		// Close scanner
		input.close();
				
	} // end main

} // end class
