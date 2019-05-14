package may13;

//VIckie Wu
// May 13
public class Entry<F, S> {

	private F first;
	private S second;

	public Entry(F x, S y) {
		// TODO Auto-generated constructor stub
		first = x;
		second = y;
	}

	public S getS() {
		// TODO Auto-generated method stub
		return second;
	}

	public F getF() {
		return first;
	}

	public String toString() {
		String g = "";
		g += second;
		return g;
	}
}
