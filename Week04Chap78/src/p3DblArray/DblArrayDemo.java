package p3DblArray;

public class DblArrayDemo {
	
	public static void main(String[] args) {
		
		// declare double array
//		int[][] anArray;
		
		// declare & create double array
//		int[][] values = {};
		
		// declare & create array of 3 rows & 5 columns
		int[][] nums = new int[3][5];
		
		// to assign a value to a specific element
		nums[2][2] = 115;
		
//		final int ROWS = 3;
//		final int COLUMNS = 4;
//		int[][] digits = new int[ROWS][COLUMNS];
		
		// declare, create, & initialize a double array
		int[][] numbers = {	{90, 92, 84, 83},
							{76, 85, 93, 82},
							{72, 85,  0, 88}
						  };
		// I think I prefer to format it like this
// 		int[][] numbers = 	{	{	0, 0, 0, 0	},
//								{	0, 0, 0, 0	},
//								{	0, 0, 0, 0	}	};
		
		// determine length of the rows
		System.out.println("Row length: " + numbers.length); // s/b 3 (?)

		// determine length of the columns
		System.out.println("Column length: " + numbers[2].length); // s/b 4 (?) 
		
		// display array ...
		display2dArray(numbers);
		
	} // end main method
	
	// create method to display a double array
	public static void display2dArray(int[][] array) {
		
		System.out.println("\nDisplay 2D array: ");
		
		for (int rows = 0; rows < array.length; rows++) {
			
			System.out.print("\n Row #" + (rows + 1) + ":");

			for (int columns = 0; columns < array[0].length; columns++) {
				
				System.out.printf("%6d", array[rows][columns]); // "d" here works for integers, "f" would be for floats
				
			} // end inner for loop
						
		} // end outer for loop
		
	} // end display2dArray method

} // end class
