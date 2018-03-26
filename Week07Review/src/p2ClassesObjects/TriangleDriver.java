package p2ClassesObjects;

public class TriangleDriver {

	public static void main(String[] args) {
		
		// create instances of the Triangle class (aka instantiate objects of the Triangle type)
		Triangle tri1 = new Triangle(); // no-arg constructor uses the default values
		Triangle tri2 = new Triangle(3, 4, 5); // overloaded constructor
		
		// display results
		System.out.println("tri1: " + tri1.toString());
		System.out.println("tri2: " + tri2.toString());
		
		// change sideA & sideB in object tri1 using the setters
		tri1.setSideA(4.5);
		tri1.setSideB(5.5);
		System.out.println("tri1: " + tri1.toString());
		
		// use getter to get value of sideC for tri1
		System.out.println("tri1: sideC: " + tri1.getSideC());
		
	} // end main method

} // end TriangleDriver class
