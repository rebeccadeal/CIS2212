package p2;

public class BlindsDemo {

	public static void main(String[] args) {
		
		// instantiate objects of the class
		Blinds b1 = new Blinds(36, 24, "brown", true);
		Blinds b2 = new Blinds();
		
		// use setters to populate the b2 object
		b2.setLength(54.75);
		b2.setWidth(30);
		b2.setColor("wood tone");
		b2.setClosed(false);
		
		// define array of 10 objects
		Blinds[] blindsArray = new Blinds[10];
		
		// populate the array using indexes
		blindsArray[0] = b1; // populate with object b1 which is already initialized/populated
		blindsArray[1] = b2; // populate with object b2 which is already initialized/populated
		blindsArray[2] = new Blinds(34.5, 24, "blue", true); // created 3rd object of the Blinds class
		blindsArray[3] = new Blinds(40, 32, "alabaster", true);
		blindsArray[4] = new Blinds(36.75, 26, "tan", true);
		blindsArray[5] = new Blinds(30.5, 29, "off-white", true);
		blindsArray[6] = new Blinds(32.33, 24.24, "mahogany", true);
		blindsArray[7] = new Blinds(54.25, 32, "gray", true);
		blindsArray[8] = new Blinds(52.455, 24.225, "metallic", true);
		blindsArray[9] = new Blinds(18, 24, "green", true);
		
		// call the method to display the array
		displayArray(blindsArray);
		System.out.println(); // line break
		
		// use foreach loop to go through each object to sum the number of slats
		double total = 0;
		for (Blinds calc : blindsArray) { // foreach loop
			System.out.printf("Length: %,1.2f \n", calc.getLength());
			total += calc.getLength();
		}
		
		// display the total length
		System.out.printf("\nTotal length of all blinds: %,1.4f \n", total);
		System.out.printf("Average length of all blinds: %,1.4f \n", (total / blindsArray.length));
		
	} // end main method
	
	// create method to display the array
	public static void displayArray(Blinds[] blinds) {
		
		System.out.println("Objects of the Blinds class held in an array: ");
		
		for (int i = 0; i < blinds.length; i++) {
			System.out.print("\nObject #" + (i + 1) + ": ");
			System.out.println(blinds[i]);
		}
		
	} // end displayArray method

} // end BlindsDemo class
