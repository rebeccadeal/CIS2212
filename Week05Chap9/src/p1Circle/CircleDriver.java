package p1Circle;

public class CircleDriver {

	public static void main(String[] args) {
		
//		double dblNum;
		
		// declare an object of the Circle type
//		Circle circle1; // no radius value
		Circle circle1 = new Circle(); // use no-arg constructor
		
		// use getter to get the value
		double rad = circle1.getRadius();
		System.out.println("circle1 radius before the change: " + rad);
		
		// use the setter to set a value
		circle1.setRadius(2222); // setting it over 100 to see that it should reset to 100
		
		// display circle1 object
		System.out.println("\ncircle1 object after the change: " + circle1.toString());
		
		// create an object of the Circle type
		Circle circle2 = new Circle();
		
		// display results by calling the toString method
		System.out.println("\ncircle2 object: " + circle2.toString());
		
		// instantiate another object of the Circle class
		Circle circle3 = new Circle(4.55555); // use overloaded constructor & pass radius of 4.55555
		
		// display results
//		System.out.println("\ncircle3 object: " + circle3.toString());
		System.out.println("\ncircle3 object: " + circle3);
		// don't need to explicitly call the toString method in the above line because the compiler knows
		
		// access data field directly
//		circle3.radius = 33.33; // only possible if radius data field is public
		// you should always set it to private because this is what you don't want the user to be able to do
//		System.out.println("\ncircle3 changed directly: " + circle3);
		
	} // end main method

} // end CircleDriver class
