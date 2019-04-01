package mar25;

//Vickie WU
//Mar 25

public class NegativeStartingBalance extends Exception {

	/**
	 * This constructor uses a generic error message.
	 */
	public NegativeStartingBalance() {
		super("Error: Negative starting balance ");
	}

	/**
	 * This constructor specifies the bad starting balance in the error message.
	 * 
	 * @param The bad starting balance.
	 */
	public NegativeStartingBalance(double amount) {
		super("Error: Negative starting balance " + amount);
	}

	// ALTERNATIVE:
	/*
	 * private double bal;
	 * 
	 * public NegativeStartingBalance(double startBalance) { bal = startBalance; }
	 * 
	 * public String getMessage() { // or super return
	 * "Error: Negative Starting balance " + bal;
	 * 
	 * }
	 */
}
