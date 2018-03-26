package p1;

import java.util.Scanner;

public class file2Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/*		System.out.print("Enter a word: ");
		String word = input.next(); 
		System.out.println("Your word is " + word);
		
		// display the word in reverse with a for loop
		System.out.print("Your word in reverse: ");
		for(int i = word.length() - 1; i >= 0;i-- ) {
			System.out.print(word.charAt(i)); // not [i] like in an array
		}*/
		
		System.out.println("String to integer: ");  input.nextLine();
		System.out.println("Enter an integer: ");  // get a String
		String intAsAString = input.next();
		
		// add Strings
		System.out.println("adding: " + intAsAString + intAsAString);  // can't do addition on Strings
		
		System.out.print("Enter an integer: ");
		int numAsInt =input.nextInt();									// 26
		System.out.println(" add numAsInt (line 30): " + numAsInt + numAsInt);   // puts numbers next to each other  2626
		System.out.println(" add numAsInt (line 31): " + (numAsInt + numAsInt)); // actually adds the values of the integers  52
		
		String numAsIntAsString = String.valueOf(numAsInt); 
		System.out.println("add numAsIntAsString: " + (numAsIntAsString + numAsIntAsString));
		
		input.nextLine();  // eats the line break in the buffer
		System.out.print("\nEnter a message on one line: ");
		String lineMsg = input.nextLine(); 
		System.out.println("User input on the line: \"" + lineMsg + "\"");  // use escape character \ to use ""

	} // end main

} // end class
