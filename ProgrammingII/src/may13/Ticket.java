package may13;

//VIckie Wu
//MAy 13

public abstract class Ticket {
	private int serialNumber; // Unique ticket id number
	private int start;

	public Ticket() {
		serialNumber = getNextSerialNumber();

	}

	// return the price of this ticket
	public abstract double getPrice();

// returns a string with information about the ticket
	public String toString() {
		return "Number: " + serialNumber + "\nPrice: " + getPrice() + "\n";
	}

// return a new unique serial number
	public int getNextSerialNumber() {
		start = (int) (Math.random() * ((999 - 100 + 1) + 100));
		return start;
	}
	/* implementation not shown */
}
