package p1;

// imported libraries
import java.util.Scanner;

public class SalesTax {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // for user input
		double sales, taxAmt, totalSales;
	//	double totalSales; // another way to declare a variable;
		final double TAX_RATE = 0.07; // once a constant is set, it can't be changed
		// "final" is the keyword for a constant
		
		System.out.println("Enter amount of sale: ");
		sales = input.nextDouble();
		
		taxAmt = sales + TAX_RATE;
		
		totalSales = sales + taxAmt;
		
		System.out.println("Tax Amount: $" + taxAmt);
		System.out.println("Total Sale is $" + totalSales);
				
	} // end main

} // end class
