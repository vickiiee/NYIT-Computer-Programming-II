package mar11;

//Vickie Wu
//March 11
/**
 * Abstract class Employee - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	public abstract double earnings();

	public String toString() {
		return ("\n" + firstName + " " + lastName + "\nsocial security number: " + socialSecurityNumber);
	}
}

