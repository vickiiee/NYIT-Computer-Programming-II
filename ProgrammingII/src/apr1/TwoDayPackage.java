package apr1;

//Vickie Wu

//April 1

public class TwoDayPackage extends Package {
	private String name;
	private double adnl_fee;

	public TwoDayPackage(double surcharge, double weight, double unitRate) {

		super(weight, unitRate);
		adnl_fee = surcharge;
		name = "2Day Package";

//		System.out.print("2DP called");
	}

	public double calculateCost() {
		return super.calculateCost() + adnl_fee;
	}

	public String toString() {
		// String senderName = getSender().getName()+ ", " +getSender().getAddress()+",
		// " +getSender().getCity()+", " +getSender().getState()+", "
		// +getSender().getZip();
		// String rName = getRecipient().getName()+ ", " +getRecipient().getAddress()+",
		// " +getRecipient().getCity()+", " +getRecipient().getState()+", "
		// +getRecipient().getZip();

		String senderName = getSender().getName() + ", " + getSender().getAddress() + ", " + getSender().getCity()
				+ ", " + getSender().getState() + ", " + getSender().getZip();
		String rName = getRecipient().getName() + ", " + getRecipient().getAddress() + ", " + getRecipient().getCity()
				+ ", " + getRecipient().getState() + ", " + getRecipient().getZip();
		return name + "\n" + "Sender: " + senderName + "\n" + "Recipient: " + rName + "\n" + "Ounces: " + getWeight()
				+ " Cost/Ounce: $" + getCost_per_oz() + " Weight based Cost: $" + super.calculateCost() + "\n"
				+ "Additional fee: $" + adnl_fee + " Total Cost: $" + calculateCost() + "\n";
	}

	// return super.toString()+ "Additional fee: $"+adnl_fee +" Total Cost: $" +
	// calculateCost()+"\n";

	/*
	 * name + "\n " + "Sender: " + senderName + "\n" + "Recipient: " + rName + "\n"
	 * + "Ounces: " + weight + " Cost/Ounce: $" + cost_per_oz +
	 * " Weight based Cost: $" +calculateCost();
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAdnl_fee() {
		return adnl_fee;
	}

	public void setAdnl_fee(double adnl_fee) {
		this.adnl_fee = adnl_fee;
	}

}
