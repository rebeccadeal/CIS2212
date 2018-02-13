package file2_doWhileLoop;

import javax.swing.JOptionPane;

public class DoWhileLoopDemo {
	
	public static void main(String[] args) {
		
	/*	do {
		
			statements to be executed while condition is true
			
		} while (condition);
	*/	
		getUserInput();
		
	} // end main method
	
	// create method to get user input for scores
	public static void getUserInput() {
		
		double score1, score2, average;
		String input;
		int userChoice;
		
		do {
			
			// get user input in dialog boxes
			input = JOptionPane.showInputDialog(null, "Enter Score #1", "Get User Input for Score #1", JOptionPane.QUESTION_MESSAGE);
			score1 = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog(null, "Enter Score #2", "Get User Input for Score #2", JOptionPane.QUESTION_MESSAGE);
			score2 = Double.parseDouble(input);
			
			// call the calcAvg method to get the average for the scores
			average = Math.round(calcAvg(score1, score2));
			
			// display results in dialog box
			JOptionPane.showMessageDialog(null, "Average of \n " + score1 + " and " + score2 + " equals " + average, "Results", JOptionPane.INFORMATION_MESSAGE);;
			
			// ask user if he wants to continue (change the condition of do-while loop??)
			userChoice = JOptionPane.showConfirmDialog(null, "Would you like to average more scores?", "Continue?", JOptionPane.YES_NO_OPTION);
						
		} while (userChoice == JOptionPane.YES_OPTION);
		
		System.out.println("Still in getUserInput method, but out of do-while loop.");
		
	} // end getUserInput method
	
	// create method to average the scores
	public static double calcAvg(double sc1, double sc2) {
		
		return (sc1 + sc2) / 2;
		
	} // end calcAvg method

} // end DoWhileLoopDemo class
