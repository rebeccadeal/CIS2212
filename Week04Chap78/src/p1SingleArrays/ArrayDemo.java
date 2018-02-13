package p1SingleArrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		// declare a variable to reference the array.
//		double[] arrSales;
		
		// declare a variable to reference the array & create array
//		int[] arrValues = {};
		
		// create String array with 6 elements
//		String[] strArray = new String[6];
		
		// common way to code when number of elements is the same
		final int NUM_ELEMENTS = 4;
		double[] sales = new double[NUM_ELEMENTS];
		
		// simplest way to initialize VariableElement is to hard code
		sales[0] = 111;	// first element of the array has index 0
		sales[1] = 222;	// second element of the array has index 1
		sales[2] = 333;
		sales[3] = 444;
		
		// more common way to initialize an array
		double[] scores = {89.5, 92.0, 96.25, 78.2, 98.5};	// 5 elements in the scores array
		
		// access elements by using index
		System.out.println("scores[3]: " + scores[3]);
		System.out.println("sales[3]: " + sales[3]);
		
		// call the method to display the array
		displayArray(scores);
		
		// create array of Strings
		String[] students = {"Jason", "Jeremy", "Deanna", "Deana", "Brian"};
		
		// call the method to display the String array (OVERLOADED method)
		displayArray(students);
		
		// call the method to average the scores & then display the result
		double avgResult = avgScore(scores);
		System.out.println(avgResult);
//		System.out.println(avgScore(scores); // same result as above but with 1 line, instead of 2
		
		// copy all numbers from scores array into new scores2 array
//		double[] scores2 = scores[]; // this doesn't copy the values (it actually throws an error)
//		double[] scores2 = {}; // this also doesn't work because scores2 length needs to match scores length
		double[] scores2 = new double[scores.length];
		for (int i = 0; i < scores.length; i++) {
			scores2[i] = scores[i];
		}
		scores2[0] = 55555.55;
		displayArray(scores);
		displayArray(scores2);
				
	} // end main
	
/* ----------------------------------------- begin other methods ----------------------------------------- */
	
	// create a method to display array - pass array to method
	public static void displayArray(double[] scoresArray) {
		
		System.out.println("\nDisplay the array: ");
		
		for (int i = 0; i < scoresArray.length; i++) {
//			System.out.println("scoresArray[" + i + "]: " + scoresArray[i]);
			System.out.println("project #" + (i + 1) + ": " + scoresArray[i]);
		} // end for loop
		
		System.out.println("Out of for loop, but still in displayArray method.");
		
	} // end displayArray method (with double array parameter)
	
	// create an OVERLOADED method to display strings
	public static void displayArray(String[] studentsArray) {
		
		System.out.println("\nDisplay array of strings: ");
		
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println("studentsArray[" + i + "]: " + studentsArray[i]);
//			System.out.println("student #" + (i + 1) + ": " + studentsArray[i]);
		} // end for loop
		
		System.out.println("Out of for loop, but still in displayArray method.");
		
	} // end displayArray method (overload with String array parameter)
	
	// create method to average the scores in the array
	public static double avgScore(double[] scoreArr) {
		
		System.out.print("\nAverage the scores: ");
		double sum = 0, avg;
		
		for (int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		} // end for loop
		
		avg = sum / scoreArr.length;
		return avg;
		
	} // end avgScore method
	
} // end class
