package p1Circle;

public class Circle {
	
	// data field - the property/attribute/state of the object to be created
	private double radius; // always use the private modifier for data encapsulation aka data hiding
//	public double radius; // this would allow the user to directly change the data field
	
	// no-arg constructor (explicit; as opposed to default constructor which is implicit)
	public Circle() {
		radius = 2.0;
	}
	
	// overloaded constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// create the getter aka accessor (getter will always have a return)
	public double getRadius() {
		return this.radius; // usage of "this" keyword is optional here
	}
	
	// create the setter aka mutator (setter will always be void with parameters)
	public void setRadius(double radius) {
		
		// if number passed in is greater than 100, then set data field to 100
		if (radius > 100) {
			this.radius = 100.0;
		}
		else {
			this.radius = radius;
		}
		
	}
	
	// create instance method to calculate (the book would say "get") the area of the object
	public double calcArea() {
		double area = this.radius * this.radius * Math.PI; // usage of "this" keywords is optional here
		return area;
	}
	
	// create instance method to calculate the perimeter (the circumference)
	public double calcPerimeter() {
//		double perim = 2 * radius * Math.PI;
//		return perim;
		return 2 * this.radius * Math.PI; // equivalent to the 2 lines above
		// above usage of "this" keyword is optional here
	}
	
	// create toString to display results
	@Override 	// use the @Override annotation to override the Object.toString() method in the Object class
				// Object.toString() displays memory address
	public String toString() {
		String area = String.format("%,4.3f", this.calcArea()); // formats the result of calcArea method
		// above usage of "this" keyword is optional here
		String perim = String.format("%,4.4f", this.calcPerimeter());
		// above usage of "this" keyword is optional here
		String	str = "\n  radius: " + radius;
				str += "\n  area: " + area;
				str += "\n  perimeter: " + perim;
		return str;
	}

} // end Circle class
