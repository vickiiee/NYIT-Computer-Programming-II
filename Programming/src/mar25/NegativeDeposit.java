package mar25;

//VIckie Wu
//Mar25

/**
 * NegativeDeposit exceptions are thrown by the BankAccount class when a
 * negative value is passed to the deposit method.
 */

public class NegativeDeposit extends Exception {
	/**
	 * This constructor uses a generic error message.
	 */
	public NegativeDeposit() {
		super("Error: Negative value passed to the deposit method");
	}

	/**
	 * This constructor specifies the negative deposit in the error message.
	 * 
	 * @param The bad starting balance.
	 */
	public NegativeDeposit(double amount) {
		super("Error: Negative value passed to the deposit method: " + amount);
	}
}
