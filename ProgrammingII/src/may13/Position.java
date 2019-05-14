package may13;

//VIckie WU
//MAy 13

public class Position {
	private int row;
	private int col;

	public Position(int r, int c) {
		this.row = r;
		this.col = c;
	}

	public String toString() {
		/* returns a string of the form "(r, c)" */
		return "(" + row + "," + col + ")";
	}

}
