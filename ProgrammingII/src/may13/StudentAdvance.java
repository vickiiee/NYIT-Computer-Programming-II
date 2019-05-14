package may13;

//Vickie Wu
//5/13/19

public class StudentAdvance extends Advance {

	public StudentAdvance(int days) {
		super(days);
	}

	@Override
	public double getPrice() {
		return super.getPrice() / 2;
	}

	public String toString() {
		return super.toString() + "(student id required)\n";
	}
}
