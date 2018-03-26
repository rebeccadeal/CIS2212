package p1;

public class file1Strings {

	public static void main(String[] args) {
		
		// 1st way to initialize String
		String msg1 = "Hello"; 
		String msg2 = "Goodbye"; 
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		msg1 = "Hello"; 
		msg2 = new String("Hello");
//		msg2 = "Hello";
		
		// 2nd way to initialize String
		String myDog = new String("  MiNdY   "); // String literal in parameter
		String myCat = new String("     HoBBes the cAt     ");  // myCat is an object aka reference variable
		//myDog = myDog.trim();
		//myCat = myCat.trim();
		System.out.println("\nMy dog's name is " + myDog + " and my cat's name is " + myCat + ".");
		
		// 3rd way to create a String - convert from character array to String type
		char[] charArray = {'J', 'a', 'v', 'a', ' ', 'S', 't', 'r', 'i', 'n', 'g'};  // create character array
		String fromCharArray = new String(charArray);
		System.out.println("\n\"fromCharArray\": " + fromCharArray);
		
		
//		msg2 = msg1;  // assign value of msg1 to msg2 - can't be done like this
		// all that did was assign the memory address of msg1 to msg2 so they both point to memory address of msg1
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		
//		msg2 = "Good Afternoon";
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		
		
		// compare Strings - compares MEMORY ADDRESS, not content
		if(msg1 == msg2) {
			System.out.println("Strings are equal - same memory address");
		}
		else
			System.out.println("\nStrings are not equal - different memory addresses");
		
		
		// to compare content of Strings, use equals method of String class
		if(msg1.equals(msg2)) {
			System.out.println("\nYes, Strings have the same content");
		}
		else
			System.out.print("No, Strings do NOT have the same content");
		
		// find the length of the String literal
		int myDogLength = myDog.length();
		int myCatLength = myCat.length();
		System.out.println("\nMy dog's name has " + myDogLength + " characters & my cat's name has " + myCatLength + " characters." );
		
		// convert to upper/lower case to compare apples to apples
		System.out.println("\nAll uppercase: " + myDog.toUpperCase());
		System.out.println("All lowercase: " + myCat.toLowerCase());
		
		System.out.println("\ncharacter at index 2 (3rd position): " + myDog.charAt(2));
		
		// concatenate 3 strings
		String str1 = "Today is Tuesday. ";
		String str2 = "I'm in Java class. ";
		String str3 = str1.concat(str1);
		System.out.println(str3);
		
		String str4 = str1 + str2;
		System.out.println(str4);
		
		String str5 = "5";
		String str6	= "6";
		String str7 = str5 + str6;
		System.out.println(str7);
		
		
	} // end main

}
