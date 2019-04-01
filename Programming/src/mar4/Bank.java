package mar4;

//Vickie Wu
//March 11

public class Bank {

	private Account[] accs;

	private int accNum; // Account Numbers 101, 102, etc;

	private int index; // index of array
	private int lim; // Array length/ Bank limit

	public Bank(int num) {
		accs = new Account[num];

		this.lim = num;
		accNum = 101;
		index = 0;
	}

	public void openCheckingAccount(double balance, double creditLimit) {
		if (index >= lim) {
			System.out.println("\nCannot add Checking account; EXCEEDS LIMIT");
			return;

		} else {
			CheckingAccount a = new CheckingAccount(accNum);
			a.setLimit(creditLimit);
			a.deposit(balance);

			accs[index] = (CheckingAccount) a;

			accNum++; // Account NUmber increments
			index++; // element number increments
		}

	}

	public void openSavingsAccount(double balance, double interest) {
		if (index >= lim) {
			System.out.println("\nCannot add Savings account; EXCEEDS LIMIT");
			return;
		} else {
			SavingsAccount a = new SavingsAccount(accNum);
			a.setInterest(interest);
			a.deposit(balance);

			accs[index] = (SavingsAccount) a;
			accNum++;
			index++;
		}
	}

	public void printAccounts() {
		for (int i = 0; i < accs.length; i++) {
			System.out.println(accs[i].toString());
		}
	}

	public void deposit(int accNum, int deposit) {
		boolean toggle = false;

		for (int i = 0; i < accs.length; i++) {
			if (accs[i].getAccountNumber() == accNum) {
				toggle = true; // accNum exists
				accs[i].deposit(deposit);
				System.out.print("Deposit successful\n");
				return;
			}
		}

		// accNum does not exist
		if (toggle == false) {
			System.out.println("Account number: " + accNum + " not found.\n");
		}
	}

	public void withdraw(int accNum, int withdrawal) {
		boolean toggle = false;

		for (int i = 0; i < accs.length; i++) {
			if (accs[i].getAccountNumber() == accNum) {
				toggle = true;

				// Check if its checking to determine overdrafting
				Account obj = accs[i];
				// CheckingAccount
				if (obj instanceof CheckingAccount) {
					CheckingAccount ck = (CheckingAccount) obj;
					if (Math.abs(ck.getBalance() - withdrawal) > ck.getLimit()) {
						System.out.println("CANNOT WITHDRAW: " + Math.abs(ck.getBalance() - withdrawal + ck.getLimit())
								+ " over limit\n");
						return;
					}
				} else {
					// savings
					if (accs[i].getBalance() - withdrawal < 0) {
						System.out.println("CANNOT WITHDRAW: not enough money in savings acc\n");
						return;
					}
				}

				accs[i].withdraw(withdrawal);
				System.out.print("Withdraw successful\n");
				return;

			}
		}
		// acc num dont exist
		if (toggle == false) {
			System.out.println("\nAccount number: " + accNum + " not found.\n");
		}
	}

	public void addInterest(int accNum) {
		boolean toggle = false;
		for (int i = 0; i < accs.length; i++) {
			if (accs[i].getAccountNumber() == accNum) {
				toggle = true;
				// Check if its checking to determine if it can add interest or not
				Account obj = accs[i];

				// CheckingAccount
				if (obj instanceof CheckingAccount) {
					CheckingAccount ck = (CheckingAccount) obj;
					System.out.println("Cannot add interest to checking account\n");
					return;
				} else {
					// savings
					if (obj instanceof SavingsAccount) {
						SavingsAccount s = (SavingsAccount) obj;
						s.addInterest();
						return;
					}
				}
			}

		}
		if (toggle == false) {
			System.out.println("\nAccount number: " + accNum + " not found.\n");
		}
	}
}
