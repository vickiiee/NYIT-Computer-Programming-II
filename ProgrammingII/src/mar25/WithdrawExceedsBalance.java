package mar25;

//VIckie Wu
//Mar25

/**
 * WithdrawExceedsBalance exceptions are thrown by the BankAccount class when a
 * negative value is passed to the deposit method.
 */

public class WithdrawExceedsBalance extends Exception {
	/**
	 * This constructor uses a generic error message.
	 */
	public WithdrawExceedsBalance() {
		super("Error: Negative value passed to the deposit method");
	}

	/**
	 * This constructor specifies the withdraw over balance limit in the error
	 * message.
	 * 
	 * @param The bad starting balance.
	 */
	public WithdrawExceedsBalance(double amount) {
		super("Error: Negative value passed to the deposit method: " + amount);
	}
}