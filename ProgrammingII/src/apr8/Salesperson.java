package apr8;

public class Salesperson {

	private int id;
	private int qcars[];

	private String carModel;

	private int carCount;
	private int totalCars;

	private double totalSales;

	/*
	 * AUDI: 0 BMW: 1 JAGUAR: 2 LEXUS: 3
	 */

	public Salesperson(int id, int[] cars) {
		this.id = id;
		this.qcars = cars;
	}

	public void sales() {
		boolean first = true;
		//look through array and figure out how many are audi, bmw, jaguar, lexus
		for (int i = 0; i < qcars.length; i++) {
			if (qcars[i] != 0) {
				if (i == 0) {
					carModel = "AUDI";
					totalCars += qcars[i];
					carCount = qcars[i];
				} else if (i == 1) {
					carModel = "BMW";
					totalCars += qcars[i];
					carCount = qcars[i];
				} else if (i == 2) {
					carModel = "JAGUAR";
					totalCars += qcars[i];
					carCount = qcars[i];
				} else if (i == 3) {
					carModel = "LEXUS";
					totalCars += qcars[i];
					carCount = qcars[i];
				}

				//if its the first time printing, print out id as well
				if (first) {
					first = false;
					System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", id, carModel, carCount, String.format("%.2f", calculate(i)));
				} else {
					System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", "", carModel, carCount, String.format("%.2f", calculate(i)));
				}
			}

		}
		System.out.println("                            ---------------------------------------");

		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", "", "", totalCars, String.format("%.2f", totalSales));
		System.out.print("\n");
	}

	public double calculate(int modelCode) {
		if (modelCode == 0) {
			totalSales += qcars[modelCode] * (8876.50);
			return qcars[modelCode] * (8876.50); // AUDI
		} else if (modelCode == 1) {
			totalSales += qcars[modelCode] * (9909.89);
			return qcars[modelCode] * (9909.89); // BMW
		} else if (modelCode == 2) {
			totalSales += qcars[modelCode] * (10999.99);
			return qcars[modelCode] * (10999.99); // JAGUAR
		} else if (modelCode == 3) {
			totalSales += qcars[modelCode] * (7776.69);
			return qcars[modelCode] * (7776.69); // LEXUS
		}

		return 0;

	}

	public double getTotalSales() {
		return totalSales;
	}

	public int getAudi() {
		return qcars[0];
	}

	public int getBmw() {
		return qcars[1];
	}

	public int getJaguar() {
		return qcars[2];
	}

	public int getLexus() {
		return qcars[3];
	}

}
