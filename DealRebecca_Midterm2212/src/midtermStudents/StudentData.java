/* Rebecca Deal
 * CIS 2212 Tuesdays Spring 2018
 * Midterm Exm Part II Practical - College Student Data Tracking
 * Due Date: 2/27/18 @ 8:45 p.m.
 */

package midtermStudents;

public class StudentData {
	
	// data fields
	private String firstName; // first name of student
	private String lastName; // last name of student
	private int studentID; // student ID number
	private int birthYear; // year of birth
	private final static int CURRENT_YEAR = 2018; // static constant integer variable for the current year

	// no-arg constructor
	public StudentData() {
		// no default values
	}

	// overloaded constructor
	public StudentData(String firstName, String lastName, int studentID, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.birthYear = birthYear;
	}

	// getters & setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public static int getCurrentYear() {
		return CURRENT_YEAR;
	}
	
	/* no setter for CURRENT_YEAR because it is a static constant that won't change */
	
	// method to calculate the age of the student
	public int calcAge() {
		return StudentData.CURRENT_YEAR - this.birthYear;
	}
	
	// display results
	@Override // override the toString method
	public String toString() {
		String 	str =	"\n" + this.firstName + " " + this.lastName;
				str +=	"\n   Student ID: " + this.studentID;
				str +=	"\n   Age in " + StudentData.CURRENT_YEAR + ": " + this.calcAge() + " years old";
		return str;
	}
	
} // end StudentData class
