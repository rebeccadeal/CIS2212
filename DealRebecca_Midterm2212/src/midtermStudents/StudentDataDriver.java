/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Midterm Exm Part II Practical - College Student Data Tracking
 * Due Date: 2/27/18 @ 8:45 p.m.
 */

package midtermStudents;

// import library
import java.util.Scanner;

public class StudentDataDriver {

	public static void main(String[] args) {
		
		// scanner for user input
		Scanner input = new Scanner(System.in);

		// constant variables for validation
		final int MIN_STUDENT_ID = 20000;
		final int MAX_STUDENT_ID = 29999;
		final int CURRENT_YEAR = 2018;
		final int MIN_AGE = 13;
		final int VALID_BIRTH_YEAR = CURRENT_YEAR - MIN_AGE;
		
		// instantiate an object of the StudentData class using the no-arg constructor
		StudentData student1 = new StudentData();
		
		// declare variables for user input
		String firstName, lastName;
		int studentID, birthYear;
		
		// prompt user for first & last names
		System.out.print("Enter first name: ");
		firstName = input.nextLine();
		System.out.print("Enter last name: ");
		lastName = input.nextLine();
		
		// prompt user for student ID
		System.out.print("\nEnter 5-digit student ID: ");
		studentID = input.nextInt();
		
		// validate that the student ID is between 20000 & 29999, inclusive
		while ((studentID < MIN_STUDENT_ID) || (studentID > MAX_STUDENT_ID)) {
			System.out.print("Student ID range is 20000 through 29999. Please try again: ");
			studentID = input.nextInt();
		}
		
		// prompt user for year of birth
		System.out.print("\nEnter 4-digit birth year: ");
		birthYear = input.nextInt();
		
		// validate that the student is at least 13 years old in the current year
		while (birthYear > VALID_BIRTH_YEAR) {
			System.out.print("Students must be born in " + VALID_BIRTH_YEAR + " or earlier. Please try again: ");
			birthYear = input.nextInt();
		}
		
		// use setters to populate the first StudentData object with user input
		student1.setFirstName(firstName);
		student1.setLastName(lastName);
		student1.setStudentID(studentID);
		student1.setBirthYear(birthYear);
		
		// create & initialize two additional StudentData objects using the overloaded constructor
		StudentData student2 = new StudentData("Sofie", "Ricci", 23333, 1988);
		StudentData student3 = new StudentData("Mateo", "Lopez", 24444, 1973);
		
		// display results
		System.out.println(student1.toString()); // explicit toString
		System.out.println(student2); // implicit toString
		System.out.println(student3); // implicit toString
		
		// close input scanner
		input.close();
		
	} // end main method

} // end StudentDataDriver class
