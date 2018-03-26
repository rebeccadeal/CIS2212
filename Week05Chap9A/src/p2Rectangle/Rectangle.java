package p2Rectangle;

import java.text.DecimalFormat; // for decimal formatting

public class Rectangle {
	
	DecimalFormat calcFormat = new DecimalFormat("###,##0.000##");
	
	// data fields
	private double length, width;

	// no-arg constructor
	public Rectangle() {
		this.length = .25;
		this.width = .6;
	}
	
	// overloaded constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// getters & setters - use Eclipse
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	// method to calculate the area
	public double calcArea() {
		return this.width * this.length;
	}
	
	// method to calculate the perimeter
	public double calcPerim() {
		double perim = (this.width * 2) + (this.length * 2);
		return perim;
	}
	
	// display result with toString
	@Override
	public String toString() {
		String area = calcFormat.format(calcArea());
		String perim = calcFormat.format(calcPerim());
		String 	str = "\n  width: " + this.width;
				str += "\n  length: " + this.length;
				str += "\n  area: " + area;
				str += "\n  perimeter: " + perim;
		return str;
	}

} // end Rectangle class
