package mar4;

//Vickie Wu
//March 11

public class CheckingAccount extends Account {

	private double overDraftLim;
	private int a;

	public CheckingAccount(int accNum) {
		super(accNum);
		this.a = accNum;
		// TODO Auto-generated constructor stub
	}

	public void setLimit(double lim) {
		overDraftLim = lim;
	}

	public double getLimit() {
		return overDraftLim;
	}

}
