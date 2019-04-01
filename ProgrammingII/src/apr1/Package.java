package apr1;

//Vickie Wu
//April 1

public class Package {

	private String name;
	private Customer sender;
	private Customer recipient;
	private double weight;
	private double cost_per_oz;
	
	public Package(double weight, double unitRate) {
//		System.out.print("Package called");
		this.weight = weight;
		this.cost_per_oz = unitRate;
		this.name = "Package";
	}
	
	public double calculateCost() {
		return weight*cost_per_oz;
	}
	
	public String toString() {
		String senderName = getSender().getName()+ ", " +getSender().getAddress()+", " +getSender().getCity()+", " +getSender().getState()+", " +getSender().getZip();
		String rName = getRecipient().getName()+ ", " +getRecipient().getAddress()+", " +getRecipient().getCity()+", " +getRecipient().getState()+", " +getRecipient().getZip();
		return name + "\n"
				+ "Sender: " + senderName + "\n"
				+ "Recipient: " + rName + "\n"
				+ "Ounces: " + weight + " Cost/Ounce: $" + cost_per_oz + " Weight based Cost: $" +calculateCost() +"\n";
	}

	public void set_sender_info(String name, String street, String city, String state, String zip) {
		//Michael K","111 One Street","New York","NY","10111
		sender = new Customer(name, street, city, state, zip);
		
	}

	public void set_recipient_info(String name, String street, String city, String state, String zip) {
		// "Suzan S","222 Two Street","New York","NY","10222"
		recipient = new Customer(name, street, city, state, zip);
	}

	public Customer getSender() {
		return sender;
	}

	public Customer getRecipient() {
		return recipient;
	}


	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getCost_per_oz() {
		return cost_per_oz;
	}

	
	
	
}
