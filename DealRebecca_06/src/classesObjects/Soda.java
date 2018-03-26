/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 06 - Objects, Classes, UML Diagram
 * Due Date: 2/20/18
 */

package classesObjects;

import java.text.DecimalFormat;

public class Soda {
	
	DecimalFormat df3 = new DecimalFormat("#,##0.000");
	
	// data fields
	private String name; // name of the food
	private int calories; // calories per can
	private double ounces; // fluid ounces per can
	private int caffeine; // caffeine per can
	
	// no-arg constructor
	public Soda() {
		// no default values
	}
	
	// overloaded constructor
	public Soda(String name, int calories, double ounces, int caffeine) {
		this.name = name;
		this.calories = calories;
		this.ounces = ounces;
		this.caffeine = caffeine;
	}

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getOunces() {
		return ounces;
	}

	public void setOunces(double ounces) {
		this.ounces = ounces;
	}

	public int getCaffeine() {
		return caffeine;
	}

	public void setCaffeine(int caffeine) {
		this.caffeine = caffeine;
	}
	
	// method to calculate the amount of caffeine per fluid ounce
	public double calcCafPerOz() {
		return this.caffeine / this.ounces;
	}
	
	// display results
	@Override // use at override annotation
	public String toString() {
		String 	str = "\n  Name of soda: " + this.name;
				str += "\n  Calories per can: " + this.calories;
				str += "\n  Fluid ounces per can: " + this.ounces;
				str += "\n  Caffeine per can (mg): " + this.caffeine;
				str += "\n    Caffeine per fluid ounce (mg/fl oz): " + df3.format(this.calcCafPerOz());
		return str;
	}
	
} // end Soda class
