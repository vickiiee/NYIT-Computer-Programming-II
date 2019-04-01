package mar11;

//Vickie Wu
//March 11

public class HourlyEmployee extends Employee{

	private double wage;
	private double hoursWorked;
	//fixed
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public HourlyEmployee(String first, String last, String ssn, double wage, int hoursWorked) {
		super(first, last, ssn);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
		
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnings() {
		
		if(hoursWorked <=40) 
			return wage*hoursWorked;
		else
			return (wage*hoursWorked) + ((hoursWorked - 40) * wage *1.5);
		
	}

	public String toString() {
		return "Hourly Employee:\n"+firstName+" "+lastName+
                "\nsocial security number: "+ socialSecurityNumber + "\nHourly Wage: " + wage + "\nHours Worked " + hoursWorked + "\nTotal Earnings: " + earnings()+ "\n";
		
	}
}
