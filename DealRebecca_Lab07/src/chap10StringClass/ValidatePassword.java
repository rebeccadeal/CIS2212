/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 07 - String Class
 * Due Date: 3/20/18
 */

package chap10StringClass;

import javax.swing.JOptionPane; // import library to use dialog boxes

public class ValidatePassword {

	public static void main(String[] args) {
		
		// prompt user for password
		String password; // declare variable for user input
		password = JOptionPane.showInputDialog("Enter a password: "); // display dialog box for user input
		
		// call method to validate the password
		validatePassword(password);
		
	} // end main method
	
	// begin method to validate the user-inputed password
	public static void validatePassword(String pw) {
		
		// declare counters for digits & letters
		int countDigits = 0;
		int countLetters = 0; 
		
		// begin for loop to count digits & letters
		for (int i = 0; i < pw.length(); i++) {
			if (Character.isDigit(pw.charAt(i))) {
				countDigits++; // increment the count for digits
			}
			if (Character.isLetter(pw.charAt(i))) {
				countLetters++; // increment the count for letters			
			}
		} // end for loop
		
		// calculate number of special characters
		int digitsAndLetters = countDigits + countLetters;
		int specialChars = pw.length() - digitsAndLetters;
		
		// display appropriate message for whether the password is valid or invalid
		if (pw.length() < 8) {
			JOptionPane.showMessageDialog(null,	"Your password " + pw + " is not valid." +
												"\nIt must be at least 8 characters.");
		}
		else if (specialChars > 0) {
			JOptionPane.showMessageDialog(null,	"Your password " + pw + " is not valid." +
												"\nIt must be ONLY letters & digits.");			
		}
		else if (countDigits < 2) {
			JOptionPane.showMessageDialog(null,	"Your password " + pw + " is not valid." +
												"\nIt must have at least 2 digits.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Password is valid.");
		}
		
	} // end validatePassword method
	
} // end ValidatePassword class
