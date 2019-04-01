package mar25;

//VIckie Wu
//Mar25

/**
 * NegativeWithdraw exceptions are thrown by the BankAccount class when a
 * negative value is passed to the deposit method.
 */

public class NegativeWithdraw extends Exception {
	/**
	 * This constructor uses a generic error message.
	 */
	public NegativeWithdraw() {
		super("Error: Negative value passed to the withdraw method");
	}

	/**
	 * This constructor specifies the negative withdraw in the error message.
	 * 
	 * @param The bad starting balance.
	 */
	public NegativeWithdraw(double amount) {
		super("Error: Negative value passed to the withdraw method: " + amount);
	}
}