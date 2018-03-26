package p2;

import java.text.DecimalFormat;

public class Blinds {
	
	DecimalFormat df2 = new DecimalFormat("#,##0.00");
	
	// data fields
	private double length; // in inches
	private double width; // in inches
	private String color;
	private boolean isClosed;
	
	// no-arg constructor
	public Blinds() {
		// no default values
	}
	
	// overloaded constructor
	public Blinds(double length, double width, String color, boolean closed) {
		this.length = length;
		this.width = width;
		this.color = color;
		this.isClosed = closed;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	
	// instance method to calculate the # of slats needed (s/b 10 slats per foot)
	public double calcSlats() {
		double result = (length / 12) * 10;
		return result;
	}
	
	// display results
	@Override // use at override annotation
	public String toString() {
//		String slats = df2.format(this.calcSlats());
		String 	str = "\n  Length: " + df2.format(this.length);
				str += "\n  Width: " + df2.format(this.width);
				str += "\n  # of Slats Needed: " + Math.ceil(this.calcSlats());
				str += "\n  Color: " + this.color;
				str += "\n  Closed: " + this.isClosed;
		return str;
	}

} // end Blinds class
