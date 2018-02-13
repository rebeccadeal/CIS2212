package file3_forLoop;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		
	/*	for (counter initialized; condition; increment/change) {
			statements to be executed while condition is true
		}
	*/	
	//	increment();
	//	numsSquared();
		expTable();
		
	} // end main method
	
	public static void increment() {
		
		// increment with a for loop
		for (int index = 0; index <= 10; index++) {
			
			System.out.println("Index: " + index);
			
		} // end for loop
		
	} // end increment method
	
	// create method to display numbers squared
	public static void numsSquared() {
		
		System.out.println("\nNumber\tNum Squared"); // header
		System.out.println("-------------------"); // underline
		
		// list numbers & numbers squared 1 - 10
		for (int num = 1; num <= 10; num++) {
			
			System.out.println(num + "\t" + (num * num));
			
		} // end for loop
		
	} // end numsSquared method
	
	// nested loops form a table
	public static void expTable() {
		
		System.out.println("\nTable of Exponents:"); // header
		System.out.print("\n\t");
		
		// display header row at top
		for (int i = 1; i <= 5; i++) {
			System.out.print("\t" + i);
		}
		
		System.out.print("\n\t");
		
		// underline of dashes
		for (int i = 0; i < 6; i++) {
			System.out.print("________");
		}
		
		System.out.println("\n       |");
		
		// display header column at side & the body of the table
		for (int i = 1; i <= 5; i++) {
			
			System.out.print(i + "      |"); // prints the values in the first column
			
			// display the body of the table
			for (int j = 1; j <= 5; j++) {
				
				// FIX THE NUMBER FORMATTING HERE
			//	System.out.print("\t" + Math.pow(i, j));
				System.out.printf("%10.0f", Math.pow(i, j));
			//	double extraNum = 5.5555;
			//	System.out.printf("%10.0f, %2.1f", Math.pow(i, j), extraNum);
				
			} // end inner for loop
			
			System.out.println();
			
		} // end outer for loop
		
	} // end expTable method

} // end ForLoopDemo class
