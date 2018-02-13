package p4ExtraMaterial;

public class VarArgsMethods {
	
	// You can declare methods that take a variable number of arguments.
	// These types of parameters are treated as an array.
	// A method can have at most one VarArg parameter, and it must be the last parameter.
	
	// The syntax is an ellipsis (three periods in a row).
	
	public static int sum(int... values) {
		
		int total = 0;
		
		for (int value: values) {
			total += value;
		}
		
		return total;
		
	} // end sum method
	
	public static void main(String[] args) {
		
		System.out.println(sum(1, 5, 9, 10));
		
		System.out.println(sum(1, 6));
		
		System.out.println(sum(4));
		
		System.out.println(sum());
		
	} // end main method

} // end class
