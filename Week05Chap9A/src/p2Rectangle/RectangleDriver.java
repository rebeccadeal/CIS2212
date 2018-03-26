package p2Rectangle;

public class RectangleDriver {

	public static void main(String[] args) {
		
		// create objects of the Rectangle class
		Rectangle rec1 = new Rectangle(); // use no-arg constructor
		Rectangle rec2 = new Rectangle(2.22, 4.44); // use overloaded constructor & pass values
		
		System.out.println("anonymous rectangle object: " + new Rectangle(3, 4));
		// no way to access this object again, but it's helpful to test things out
		
		// display results
		System.out.println("\nrec1: " + rec1.toString()); // explicit toString
		System.out.println("\nrec2: " + rec2); // implicit toString
		// So why do you not have to use ".toString()" in the above line? Remember to look that up.
		
		// change width for rec1
		rec1.setWidth(10.55555555);
		
		// reset length for rec2
		rec2.setLength(15.25252525);
		
		// display new results
		System.out.println("\nnew rec1: " + rec1);
		System.out.println("\nnew rec2: " + rec2);

	} // end main method

} // end RectangleDriver class
