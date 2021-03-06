package p1Math;

import java.util.Scanner;

public class StringsDemo {
	
	public static void main(String[] args) {
		
		// create Scanner object for user input
		Scanner input = new Scanner(System.in);
				
/*		// get user input for a String
		System.out.print("Enter a string: ");
		String str1 = input.next(); // next() gets just up to the first white space
		System.out.println(str1);
		
		input.nextLine(); // eats the buffer
		
		System.out.print("Enter another string: ");
		String str2 = input.nextLine();
		System.out.println(str2);
*/		
		String school = "Sinclair";
		// get # of characters in variable
		int strLength = school.length();
		System.out.println("\nThere are " + strLength + " characters in the word \"Sinclair\".");
		
		// find the character at index 2
		char thirdLetter = school.charAt(2);
		System.out.println("The third letter of " + school + " is '" + thirdLetter + "'.");
		
		// concatenate Strings
		String str3 = "\nCIS 2212 ";
		str3 += "Java I ";
		str3 += "Tuesday evenings";
		System.out.println(str3);
		
		String dept = "CIS ";
		int courseNum = 2212;
		String course = dept + courseNum; // both values are now Strings
		System.out.println("The course is " + course);
		System.out.println();
		
		// to get just part of a string, use substring
		String college = " Community College";
		String fullSchoolName = school + college;
		System.out.println(fullSchoolName);
		
		String lastPart = fullSchoolName.substring(19); // gets string starting at index 19
		System.out.println("Substring starting at index 19: " + lastPart);
		
		String middlePart = fullSchoolName.substring(19, 23);
		System.out.println("Substring index 19 to 23: " + middlePart);
		
		// convert to upper/lower
		System.out.println("\nall uppercase: " + fullSchoolName.toUpperCase());
		System.out.println("all lowercase: " + fullSchoolName.toLowerCase());
		
		String manySpaces = "   John   Doe   ";
		System.out.println("\nwithout trim: " + manySpaces);
		System.out.println("with trim: " + manySpaces.trim());
		
		// replacing character(s)
		System.out.println("\nReplacing \"Co\" with \"**\" in " + fullSchoolName + " gives you " + fullSchoolName.replaceFirst("Co", "**"));
		System.out.println("Replacing \"Co\" with \"**\" in " + fullSchoolName + " gives you " + fullSchoolName.replaceAll("Co", "**"));
		System.out.println();
		
		// format a number using a String method
		double lotsOfDecimalPlaces = 44444444.234156789123;
		String strFormat = String.format("%.4f", lotsOfDecimalPlaces);
		System.out.println(strFormat);
		strFormat = String.format("%15.4f", lotsOfDecimalPlaces);
		System.out.println(strFormat);
		strFormat = String.format("$%,10.2f", lotsOfDecimalPlaces);
		System.out.println(strFormat);
		
		input.close();
		
	} // end main

} // end class
