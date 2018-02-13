/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Lab 01 - Course Score
 * Due Date: 1/16/18
 */

package selections;

// Import libraries
import java.util.Scanner;

public class CourseScoreUpdated {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // for user input
		
		// Declare variables
		double maxScore1, maxScore2, maxScore3, maxScore4;
		double score1, score2, score3, score4;
		double totMaxPoints, totPoints, courseScore;
		char letterGrade;
		
		// Prompt user for 4 max scores & 4 earned scores
		System.out.print("Max Score 1: ");
		maxScore1 = input.nextDouble();
		System.out.print("Earned Score 1: ");
		score1 = input.nextDouble();
		System.out.print("Max Score 2: ");
		maxScore2 = input.nextDouble();
		System.out.print("Earned Score 2: ");
		score2 = input.nextDouble();
		System.out.print("Max Score 3: ");
		maxScore3 = input.nextDouble();
		System.out.print("Earned Score 3: ");
		score3 = input.nextDouble();
		System.out.print("Max Score 4: ");
		maxScore4 = input.nextDouble();
		System.out.print("Earned Score 4: ");
		score4 = input.nextDouble();
		
		// Calculate point totals & course score
		totMaxPoints = maxScore1 + maxScore2 + maxScore3 + maxScore4;
		totPoints = score1 + score2 + score3 + score4;
		courseScore = totPoints / totMaxPoints * 100;
		
		// Select letter grade character with if/else statement
		if (courseScore >= 90) {
			letterGrade = 'A';
		}
		else if (courseScore >= 80) {
			letterGrade = 'B';
		}
		else if (courseScore >= 70) {
			letterGrade = 'C';
		}
		else if (courseScore >= 60) {
			letterGrade = 'D';
		}
		else {
			letterGrade = 'F';
		}
		
		// Display point totals, course score, & letter grade
		System.out.println("\nTotal Earned Points: " + totPoints);
		System.out.println("Total Max Points: " + totMaxPoints);
		System.out.println("\nCourse Score: " + courseScore + "%");
		System.out.println("Letter Grade: " + letterGrade);
		
		// Close scanner
		input.close();
		
	} // end main

} // end class
