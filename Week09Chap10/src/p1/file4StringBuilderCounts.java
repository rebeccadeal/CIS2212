package p1;

public class file4StringBuilderCounts {

	public static void main(String[] args) {
		
		// create 3 StringBuilder strings to count letters & digits
		StringBuilder str1 = new StringBuilder("abcd1234");
		StringBuilder str2 = new StringBuilder("abcdefgh");
		StringBuilder str3 = new StringBuilder("###(*@$");
		StringBuilder str4 = new StringBuilder("abc5");
		
		System.out.println("Test str1: ");
		countLettersDigits(str1);
		
		System.out.println("\nTest str2: ");
		countLettersDigits(str2);
		
		System.out.println("\nTest str3: ");
		countLettersDigits(str3);
		
		System.out.println("\nTest str4: ");
		countLettersDigits(str4);
		
	} // end main
	
	
	// create method to count letters & digits
	public static void countLettersDigits(StringBuilder str2) {
		
		int countDigits = 0;
		int countLetters = 0; 
		
		// create loop to count
		for (int i = 0; i < str2.length(); i++) {
			if(Character.isDigit(  str2.charAt(i)  )  ) {
				countDigits++;  // increment the count for digits if found
			}
			
			if(Character.isLetter(str2.charAt(i))) {
				countLetters++;				
			}
		} // end loop to count
		
		if(countDigits <= 2) {
			System.out.println("There are 2 or fewer digits in " + str2);
		}
		else
			System.out.println("There are more than 2 digits in " + str2);
		
		if(countLetters <= 2) {
			System.out.println("There are 2 or fewer letters in " + str2);
		}
		else
			System.out.println("There are more than 2 letters in " + str2);
		
	} // end method
 
} // end class
