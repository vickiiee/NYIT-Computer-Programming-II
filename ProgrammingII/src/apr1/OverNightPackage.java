package apr1;

//Vickie Wu
//April 1

public class OverNightPackage extends Package{

	private String name;
	private double adnl_fee_per_oz;
	
	public OverNightPackage(double surcharge, double weight, double unitRate) {
		super(weight, unitRate);
		adnl_fee_per_oz = surcharge;
//		System.out.print("o called");
		name = "OvernightPackage";
	}

	public double calculateCost() {
		return super.calculateCost() + adnl_fee_per_oz*getWeight();
	}

	public String toString() {
		String senderName = getSender().getName()+ ", " +getSender().getAddress()+", " +getSender().getCity()+", " +getSender().getState()+", " +getSender().getZip();
		String rName = getRecipient().getName()+ ", " +getRecipient().getAddress()+", " +getRecipient().getCity()+", " +getRecipient().getState()+", " +getRecipient().getZip();
		
		return name + "\n"
				+ "Sender: " + senderName + "\n"
				+ "Recipient: " + rName + "\n"
				+ "Ounces: " + getWeight() + " Cost/Ounce: $" + getCost_per_oz() + " Weight based Cost: $" +super.calculateCost() +"\n" 
				+ "Additional fee/ounce: $"+adnl_fee_per_oz +" Total Cost: $" + calculateCost()+"\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAdnl_fee_per_oz() {
		return adnl_fee_per_oz;
	}

	public void setAdnl_fee_per_oz(double adnl_fee_per_oz) {
		this.adnl_fee_per_oz = adnl_fee_per_oz;
	}
	
	
}
