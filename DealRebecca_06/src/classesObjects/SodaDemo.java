/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 06 - Objects, Classes, UML Diagram
 * Due Date: 2/20/18
 */

package classesObjects;

public class SodaDemo {

	public static void main(String[] args) {
		
		// instantiate objects of the class
		Soda s1 = new Soda();
		Soda s2 = new Soda();
		
		// use setters to populate the s1 & s2 objects
		s1.setName("Diet Coke");
		s1.setCalories(0);
		s1.setOunces(12);
		s1.setCaffeine(46);
		s2.setName("Coke Zero");
		s2.setCalories(0);
		s2.setOunces(12);
		s2.setCaffeine(34);
		
		// define array of 8 objects
		Soda[] sodaArray = new Soda[8];
		
		// populate the array using indexes & overloaded function
		sodaArray[0] = s1; // populate with object s1 which is already initialized/populated
		sodaArray[1] = s2; // populate with object s2 which is already initialized/populated
		sodaArray[2] = new Soda("RedBull Sugarfree", 5, 8.4, 80); // create 3rd object of the Soda class
		sodaArray[3] = new Soda("RedBull", 110, 8.4, 80);
		sodaArray[4] = new Soda("Coca-Cola", 140, 12, 34);
		sodaArray[5] = new Soda("Sprite", 140, 12, 0);
		sodaArray[6] = new Soda("Mello Yello", 170, 12, 51);
		sodaArray[7] = new Soda("Mountain Dew", 170, 12, 54);
		
		// call the method to display the array
		displayArray(sodaArray);
		System.out.println(); // line break
		
	} // end main method
	
	// method to display the array
	public static void displayArray(Soda[] sodaArray) {
		
		System.out.println("Objects of the Soda class held in an array: ");
		
		for (int i = 0; i < sodaArray.length; i++) {
			System.out.print("\nSoda #" + (i + 1) + ": ");
			System.out.println(sodaArray[i]);
		}
		
	} // end displayArray method
	
} // end SodaDemo class
