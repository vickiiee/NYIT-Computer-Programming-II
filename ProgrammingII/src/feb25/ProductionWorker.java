package feb25;


//Vickie Wu
//Feb 25

public class ProductionWorker extends Employee{
	
	public static final int NIGHT_SHIFT = 2;
	public static final int DAY_SHIFT = 1;
	public int shift;
	//day shift is 1
	//night shift is 2
	private double payRate;

	

	public ProductionWorker() {
		
	}
	
	public ProductionWorker(String name, String id, String hireDate, int shift, double wage) {
		//setName(name);
		//setEmployeeNumber(id);
		//setHireDate(hireDate);
		
		//EITHER WAY WORKS
		
		super(name, id, hireDate);
		this.shift = shift;
		this.payRate = wage;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}
	
	public void setPayRate(double rate) {
		this.payRate = rate;
	}

	/*public int getShift() {
		return shift;
	}
	*/
	public String getShift() {
		if (shift == 1) {
			return "Day";
		}
		if (shift == 2) {
			return "Night";
		}
		
		return "";
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public String toString() {
		String formattedString = String.format("%.02f", getPayRate());
		return "Name: " + getName() + "\n"
				+ "Employee Number: " + getEmployeeNumber() + "\n"
				+ "Hire Date: " + getHireDate() + "\n"
				+ "Shift: " + getShift() + "\n"
				+ "Hourly Pay Rate: $" + formattedString;
	}
}
