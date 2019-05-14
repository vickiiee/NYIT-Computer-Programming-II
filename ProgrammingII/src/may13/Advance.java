package may13;

//VIckie Wu
//May 13
public class Advance extends Ticket{

	private int days;
	private int pr1;
	private int pr2;
	
	public Advance(int days) {
		this.days = days;
		
		//default
		pr1 = 30;
		pr2 = 40;
	}

	@Override
	public double getPrice() {
		return setAdvancePrice(pr1, pr2);
	}

	public double setAdvancePrice(int pr1, int pr2){
		this.pr1 = pr1;
		this.pr2 = pr2;
		if(days>=10) {
			return pr1;
		}else
			return pr2;
	}
	
	

}
