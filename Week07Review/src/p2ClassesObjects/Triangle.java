package p2ClassesObjects;

import java.text.DecimalFormat; // for decimal formatting

public class Triangle {
	
	// create object to format
	DecimalFormat calcFormat = new DecimalFormat("#,##0.00##");
	
	// data fields
	private double sideA, sideB, sideC;
	
	// no-arg constructor
	public Triangle() { // initialize so that every object created with no args is 1.5 on all sides
		this.sideA = 1.5;
		this.sideB = 1.5;
		this.sideC = 1.5;
	}
	
	// overloaded constructor
	public Triangle(double a, double b, double c) {
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}

	// getters & setters (aka accessors & mutators, respectively)
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	// create instance method to calculate area
	public double calcArea() {
		double s = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
	
	// display the results with Object.toString()
	@Override
	public String toString() {
		String 	str = "\n   sideA: " + this.sideA;
				str += "\n   sideB: " + this.sideB;
				str += "\n   sideC: " + this.sideC;
				str += "\n   area: " + calcFormat.format(this.calcArea()) + "\n";
		return str;
	}

} // end Triangle class
