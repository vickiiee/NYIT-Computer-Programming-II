package mar4;

//Vickie Wu
//March 11

public class SavingsAccount extends Account {

	private double interest;
	private double bal;

	public SavingsAccount(int accNum) {
		super(accNum);

	}

	public void addInterest() {
		deposit(getBalance() * interest);
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
