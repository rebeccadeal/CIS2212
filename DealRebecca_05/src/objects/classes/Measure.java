/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 05 - Carpet/Flooring Calculator
 * Due Date: 2/13/18
 */

package objects.classes;

import java.text.DecimalFormat;

public class Measure {
	
	// number formatting
	DecimalFormat threeDecimals = new DecimalFormat("###,##0.000");
	DecimalFormat twoDecimals = new DecimalFormat("###,##0.00");
	
	// data fields
	private double length, width, price;

	// no-arg constructor
	public Measure() {
		this.length = 10.0;
		this.width = 10.0;
		this.price = 1.5;
	}
	
	// overloaded constructor
	public Measure(double length, double width, double price) {
		this.length = length;
		this.width = width;
		this.price = price;
	}
	
	// getters & setters
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// method to calculate the area
	public double calcArea() {
		return this.width * this.length;
	}
	
	// method to calculate the cost
	public double calcCost() {
		return this.width * this.length * this.price;
	}
	
	// display result with toString
	@Override
	public String toString() {
		String area = threeDecimals.format(calcArea());
		String cost = twoDecimals.format(calcCost());
		String 	str = "\n  Length: " + threeDecimals.format(this.length);
				str += "\n  Width: " + threeDecimals.format(this.width);
				str += "\n  Total Area: " + area;
				str += "\n  Price per sq ft: $" + twoDecimals.format(this.price);
				str += "\n  Total Cost: $" + cost;
		return str;
	}

} // end Measure class
