/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Class Demo 1 - Chapters 1, 2, 3
 * Date: 1/9/18
 */

package p1;

import javax.swing.JOptionPane;

public class FirstProgram {

	public static void main(String[] args) {
		
		// Our first code to execute
		System.out.println(" Hello World! "); // this is another line comment
		
		// dialog boxes
		JOptionPane.showMessageDialog(null, "This is my first dialog box");
		JOptionPane.showMessageDialog(null, "My second dialog box", "The Title", JOptionPane.ERROR_MESSAGE);
		
		double num1 = 5.5;
		double num2 = 10.10;
		
		num1 = num1 + 1;		// add 1 to the value of num1
		num1 += 1;			// better way to increment by 1
		num1++;				// preferred way to increment by 1
		
		System.out.println(num1 + " plus " + num2 + " equals " + (num1 + num2));

	} // end main

} // end class
