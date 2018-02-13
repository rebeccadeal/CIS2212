package file1_whileLoop;

public class WhileLoopDemo {
	
	// global stuff goes here ...
	
	// ...
	public static void main(String[] args) {
		
		System.out.println("0");
		// ...
		
	} // end main method
	
	// create method to increment
	public static void increment() {
		
		System.out.println("\nIncrement numbers 0 - 10: ");
		int num1 = 0;
		
		while (num1 <= 10) {
			System.out.println(" " + num1);
			// ...
		}
		
	} // end increment() method
	
	// create method to decrement
	public static void decrement() {
		
		System.out.println("\nDecrement numbers 0 - 10: ");
		int num1 = 0;
		
		while (num1 >= 0) {
			System.out.println(" " + num1);
			num1--; System.out.print("value of num1 after decr: " + num1);
		}
		
	} // end decrement() method
	
	// create method to generate random numbers
	public static void randomNumbers() {
		
		System.out.println("\nDisplay 10 random numbers between 5 & 20, inclusive: ");
		
		int num3 = 0;
		
		while (num3 < 10) {
			
			// generate random number with lower limit of 5 & upper limit of 20
			int randNum = 5 + (int)(Math.random() * (20 - 5 + 1)); // p223
			
			if (randNum == 10) {
				System.out.print("ten   ");
			}
			else if (randNum == 13) { /*System.out.print("   .   ");*/
				continue; // leaves this iteration, but not the loop
			}
			else if (randNum == 7) { /*System.out.println("   +   ");*/
				break; // breaks out of the entire loop, no more iterations
			}
			else {
				System.out.print(randNum + "   ");
			}
			
			num3++;
			
		} // end while loop
		
	} // end randomNumbers() method

} // end WhileLoopDemo class
