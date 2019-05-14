package may13;

//VIckie Wu
//5/13/19

public class RecursiveProblem {

	public RecursiveProblem() {

	}

	public static void main(String[] args) {
		RecursiveProblem r = new RecursiveProblem();
		System.out.println("Sum of Range");
		System.out.println(r.sumOfRange(8, 3));
		System.out.println(r.sumOfRange(3, 8));
		System.out.println("--------------------------");
		System.out.println("Print Range");
		System.out.println(r.printRange(8, 3));
		System.out.println(r.printRange(3, 8));
	}

	public String printRange(int x, int y) {

		if (x == y) {
			return x + " ";
		}
		if (x > y) {

			return x + " " + printRange(x - 1, y);
		} else {
			return x + " " + printRange(x + 1, y);
		}

	}

	public int sumOfRange(int x, int y) {

		if (x == y) {
			return x;
		}

		if (x > y) {
			return x + sumOfRange(x - 1, y);
		}
		if (x < y) {
			return x + sumOfRange(x + 1, y);
		}
		return -1;
	}
}
