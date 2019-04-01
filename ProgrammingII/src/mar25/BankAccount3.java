package mar25;
//VIckie Wu

//MArch 25
/*
The BankAccount class simulates a bank account.
*/

public class BankAccount3 {
	private double balance; // Account balance

	/**
	 * This constructor sets the starting balance at 0.0.
	 * 
	 * @param d
	 */

	/**
	 * This constructor sets the starting balance to the value passed as an
	 * argument.
	 * 
	 * @param startBalance The starting balance.
	 * @exception NegativeStartingBalance When startBalance is negative.
	 */

	public BankAccount3(double startBalance) throws NegativeStartingBalance {
		if (startBalance < 0)
			throw new NegativeStartingBalance(startBalance);

		balance = startBalance;
	}

	/**
	 * The deposit method makes a deposit into the account.
	 * 
	 * @param amount The amount to add to the balance field.
	 */

	public void deposit(double amount) throws NegativeDeposit {
		if (amount < 0) {
			throw new NegativeDeposit(amount);
		}
		balance += amount;
		/*
		 * cant add negative amount;
		 */
	}

	/**
	 * The withdraw method withdraws an amount from the account.
	 * 
	 * @param amount The amount to subtract from the balance field.
	 */

	public void withdraw(double amount) throws NegativeWithdraw, WithdrawExceedsBalance { // separate exceptions with
																							// comma
		balance -= amount;
		if (amount < 0) {
			throw new NegativeWithdraw(amount);
		}
		if (balance < 0) {
			throw new WithdrawExceedsBalance(amount);
		}
	}

	/**
	 * The setBalance method sets the account balance.
	 * 
	 * @param b The value to store in the balance field.
	 */

	public void setBalance(double b) {
		balance = b;
	}

	/**
	 * The setBalance method sets the account balance.
	 * 
	 * @param str The value, as a String, to store in the balance field.
	 */

	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}

	/**
	 * The getBalance method returns the account balance.
	 * 
	 * @return The value in the balance field.
	 */

	public double getBalance() {
		return balance;
	}
}
