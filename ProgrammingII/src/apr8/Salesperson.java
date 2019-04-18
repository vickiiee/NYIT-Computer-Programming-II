package apr8;

public class Salesperson {

	private int id;
	private int qcars[];

	private String carModel;

	private int carCount;
	private int totalCars;
	
	private double  totalSales;
	
	private int audi;
	private int bmw;
	private int jaguar; 
	private int lexus;
	/*
	 * AUDI: 0 BMW: 1 JAGUAR: 2 LEXUS: 3
	 */

	/*
	 * private String carCosts; private String carModel; private String
	 * numCarSold;
	 */
	public Salesperson(int id, int[] cars) {
		this.id = id;
		//cars = new int [4];
		this.qcars = cars;
		
		
	}

	/*
	 * public Salesperson(String id, String carCosts, String carModel, String
	 * numCarSold) { this.id = id; this.carCosts = carCosts; this.carModel =
	 * carModel; this.numCarSold = numCarSold; }
	 * 
	 * public Salesperson(String id, String carCosts, String carModel, String
	 * carModel1,String numCarSold) { this.id = id; this.carCosts = carCosts;
	 * this.carModel = carModel; this.numCarSold = numCarSold; }
	 * 
	 * public Salesperson(String id, String carCosts, String carModel, String
	 * carModel1,String carModel2,String numCarSold) { this.id = id; this.carCosts
	 * = carCosts; this.carModel = carModel; this.numCarSold = numCarSold; }
	 * 
	 * public Salesperson(String id, String carCosts, String carModel,String
	 * carModel1, String carModel2,String carModel3, String numCarSold) { this.id =
	 * id; this.carCosts = carCosts; this.carModel = carModel; this.numCarSold =
	 * numCarSold; }
	 */

	public void sales() {
		boolean first = true;
		//System.out.println("begin:     a: " + qcars[0] + "b: "+qcars[1] + "j: "+qcars[2] + "l: "+qcars[3]);
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

				if (first) {
					first = false;
					System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", id, carModel, carCount, String.format("%.2f", calculate(i)));
				} else {
					System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", "", carModel, carCount, String.format("%.2f", calculate(i)));
				}
			}

		}
		System.out.println("                            ---------------------------------------");
		//System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", "",  "------------------------------------", "----------------------------------------------", "");
		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %10.30s%n", "", "", totalCars, String.format("%.2f", totalSales));
		System.out.print("\n");

		
		// System.out.printf("%-15.30s %-15.30s %-15.30s %-15.30s%n", "ID",
		// "DESCRIPTION", "SOLD", "PER MODEL");

	}

	/*
	 * AUDI: 0 BMW: 1 JAGUAR: 2 LEXUS: 3
	 */

//	System.out.printf("%-10.30s  %-30.30s%n", "AUDI", "8876.50"); // %-30.30s
	// System.out.printf("%-10.30s %-30.30s%n", "BMW", "9909.89");
//	System.out.printf("%-10.30s  %-30.30s%n", "JAGUAR", "10999.99");
	// System.out.printf("%-10.30s %-30.30s%n", "LEXUS", "7776.69");
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
