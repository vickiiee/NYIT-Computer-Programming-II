package feb25;
//VIckie WU
//Feb 25
public class TeamLeader extends ProductionWorker{
	
	private double monthlyBonus;
	private double reqTrainingHours;
	private double attendedHrs;

	public TeamLeader() {
		// TODO Auto-generated constructor stub
	}

	public TeamLeader(String name, String id, String hd, int shift, double wage, double bonus, double reqTrHr, double aTrainHr) {
		super(name, id, hd, shift, wage);
		this.monthlyBonus = bonus;
		this.reqTrainingHours = reqTrHr;
		this.attendedHrs = aTrainHr;
	}

	public void setMonthlyBonus(double d) {
		monthlyBonus = d;
		
	}

	public void setRequiredTrainingHours(double d) {
		this.reqTrainingHours = d;
		
	}

	public void setTrainingHoursAttended(double d) {
		this.attendedHrs = d;
		
	}
	
	public String toString() {
		String pay = String.format("%.02f", getPayRate());
		String b = String.format("%.02f", getMonthlyBonus());
		return "Name: " + getName() + "\n"
				+ "Employee Number: " + getEmployeeNumber() + "\n"
				+ "Hire Date: " + getHireDate() + "\n"
				+ "Shift: " + getShift() + "\n"
				+ "Hourly Pay Rate: $" + pay + "\n"
				+ "Monthly Bonus: $" + b + "\n"
				+ "Required Training Hours: " + getRequiredTrainingHrs() +"\n"
				+ "Training hours attended: " + getAtHrs();
	}

	public double getAtHrs() {
		// TODO Auto-generated method stub
		return this.attendedHrs;
	}

	public double getRequiredTrainingHrs() {
		return this.reqTrainingHours;
	}

	public double getMonthlyBonus() {
		// TODO Auto-generated method stub
		return this.monthlyBonus;
	}

	
}
