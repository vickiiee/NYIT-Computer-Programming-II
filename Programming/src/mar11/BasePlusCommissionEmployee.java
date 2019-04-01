package mar11;

//Vickie Wu
//March 11

public class BasePlusCommissionEmployee extends Employee{
	
	private int sale;
	private double percent;
	private int salary;
	//fixed
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public BasePlusCommissionEmployee(String first, String last, String ssn, int sale, double percent, int salary) {
		super(first, last, ssn);
		this.sale = sale;
		this.percent = percent;
		this.salary = salary;
		// TODO Auto-generated constructor stub
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return salary+(sale*percent);
	}
	
	public String toString() {
		return "Base Plus Commision Employee: \n"+firstName+" "+lastName+
                "\nsocial security number: "+ socialSecurityNumber + "\nTotal Earnings: "+earnings();
		
	}

}
