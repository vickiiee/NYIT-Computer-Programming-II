package apr8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Chapter 11 & 4
public class JunkyardReport {

	private File file;
	private Scanner inputFile;
	private String filename;
	private Scanner keyboard;

	private String analyze; // A line from file

	private int id;
	private int numOfSales; // total sale
	private int modelCode; // type of car
	private int numSold; // num of car sold

	private Scanner fileLine;

	private ArrayList<Salesperson> ppl;

	private int[] cars;
	/*
	 * AUDI: 0 BMW: 1 JAGUAR: 2 LEXUS: 3
	 */
	
	
	private int audi;
	private int bmw;
	private int jaguar;
	private int lexus;
	private double totalSales;

	public JunkyardReport() throws IOException {
		ppl = new ArrayList<Salesperson>();
		//cars = new int[4];
		printReport();
	}

	public static void main(String[] args) throws IOException {

		new JunkyardReport();
		/*
		 * JunkyardReport jk = new JunkyardReport(); keyboard = new Scanner(System.in);
		 * System.out.print("Enter the filename: "); // src/apr8/Junkyard.txt
		 * 
		 * jk.openFile();
		 * 
		 * System.out.println("Welcome to Luxury Junkyard, Inc. the end of month report"
		 * );
		 * System.out.println("--------------------------------------------------------"
		 * );
		 * 
		 * System.out.println("CURRENT SELLING PRICES");
		 * System.out.println("----------------------");
		 * 
		 * System.out.printf("%-10.30s  %-30.30s%n", "AUDI", "8876.50"); // %-30.30s
		 * System.out.printf("%-10.30s  %-30.30s%n", "BMW", "9909.89");
		 * System.out.printf("%-10.30s  %-30.30s%n", "JAGUAR", "10999.99");
		 * System.out.printf("%-10.30s  %-30.30s%n", "LEXUS", "7776.69");
		 * System.out.println(
		 * "\n------------------------------------------------------------------");
		 * 
		 * System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "SALESPERSON",
		 * "MODEL", "COUNT", "TOTAL SOLD $");
		 * System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "ID",
		 * "DESCRIPTION", "SOLD", "PER MODEL"); System.out.println(
		 * "------------------------------------------------------------------");
		 * 
		 * //getData(); /*
		 * 
		 * /*while (inputFile.hasNext()) {
		 * 
		 * analyze = inputFile.nextLine(); Scanner x = new Scanner(analyze);
		 * 
		 * // zybooks!!!! int id = x.nextInt(); int numOfSales = x.nextInt(); int
		 * modelCode = x.nextInt(); int numSold = x.nextInt();
		 * 
		 * // System.out.println("...." + id + "...." +numOfSales +"...." + modelCode //
		 * +"...." + numSold);
		 * System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", id, numOfSales,
		 * modelCode, numSold);
		 * 
		 * if (modelCode == 1) { cars[0] = numSold; } else if (modelCode == 2) { cars[1]
		 * = numSold; } else if (modelCode == 3) { cars[2] = numSold; } else if
		 * (modelCode == 4) { cars[3] = numSold; }
		 * 
		 * numOfSales--; while (numOfSales > 0) { analyze = inputFile.nextLine();
		 * Scanner tes = new Scanner(analyze);
		 * 
		 * modelCode = tes.nextInt(); numSold = tes.nextInt();
		 * 
		 * if (modelCode == 1) { cars[0] = numSold; } else if (modelCode == 2) { cars[1]
		 * = numSold; } else if (modelCode == 3) { cars[2] = numSold; } else if
		 * (modelCode == 4) { cars[3] = numSold; } numOfSales--;
		 * 
		 * // System.out.println("...." + id + "...." +numOfSales +"...." + modelCode //
		 * +"...." + numSold);
		 * System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", " ", " ",
		 * modelCode, numSold);
		 * 
		 * }
		 * 
		 * // for(int i = 0; i< cars.length;i++) { // System.out.print("Index: "+ i+
		 * "Total: "+cars[i] + "\n"); // cars[i]=0; // }
		 * 
		 * ppl.add(new Salesperson(id, cars));
		 * 
		 * } int tot = 0; for (int i = 0; i < ppl.size(); i++) { tot++; }
		 * System.out.print(tot); /* String data = inputFile.nextLine(); String[] pieces
		 * = data.split(" "); for(int i = 0; i<pieces.length; i++) {
		 * 
		 * System.out.println(pieces[i]);
		 * 
		 * }
		 */

		// System.out.println(analyze);

		/*
		 * for(int i = 0; i<analyze.length(); i++) {
		 * if(!analyze.substring(i,i+1).equals(" ")) {
		 * 
		 * System.out.println(analyze.substring(i,i+1)); } }
		 */

		/*
		 * System.out.println("\n"); // Read lines from the file until no more are left.
		 * while (inputFile.hasNext()) { // Read the next name. String friendName =
		 * inputFile.nextLine();
		 * 
		 * // Display the last name read. System.out.println(friendName); }
		 * 
		 * // Close the file. inputFile.close();
		 */
	}

	public void printReport() throws IOException {

		keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: "); // src/apr8/Junkyard.txt

		openFile();

		System.out.println("Welcome to Luxury Junkyard, Inc. the end of month report");
		System.out.println("--------------------------------------------------------");

		System.out.println("CURRENT SELLING PRICES");
		System.out.println("----------------------");

		System.out.printf("%-10.30s  %10.30s%n", "AUDI", "$8,876.50"); // %-30.30s
		System.out.printf("%-10.30s  %10.30s%n", "BMW", "$9,909.89");
		System.out.printf("%-10.30s  %10.30s%n", "JAGUAR", "$10,999.99");
		System.out.printf("%-10.30s  %10.30s%n", "LEXUS", "$7,776.69");
		System.out.println("\n------------------------------------------------------------------");

		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "SALESPERSON", "MODEL", "COUNT", "TOTAL SOLD $");
		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "ID", "DESCRIPTION", "SOLD", "PER MODEL");
		System.out.println("------------------------------------------------------------------");

		getData();
		
		for(int i = 0; i <ppl.size(); i++) {
			audi+= ppl.get(i).getAudi();
			bmw += ppl.get(i).getBmw();
			jaguar += ppl.get(i).getJaguar();
			lexus += ppl.get(i).getLexus();
			totalSales+=ppl.get(i).getTotalSales();
		}
		
		System.out.println("OVERALL AUDI   UNITS SOLD: ");
		System.out.println(audi);
		System.out.println("OVERALL BMW    UNITS SOLD:");
		System.out.println(bmw);
		System.out.println("OVERALL JAGUAR UNITS SOLD:");
		System.out.println(jaguar);
		System.out.println("OVERALL LEXUS  UNITS SOLD:");
		System.out.println(lexus +"\n");
		
		System.out.println("NUMBER SALESPERSONS: "+ppl.size());
		//System.out.println();
		System.out.println("OVERALL SOLD:                 $"+String.format("%.2f", totalSales));
		System.out.println("AVERAGE SOLD per SALESPERSON: $"+String.format("%.2f", (totalSales/12)));
	}

	public void getData() {
		while (inputFile.hasNext()) {
			cars = new int[4];
			analyze = inputFile.nextLine();
			fileLine = new Scanner(analyze);

			// zybooks!!!!
			id = fileLine.nextInt();
			numOfSales = fileLine.nextInt();
			modelCode = fileLine.nextInt();
			numSold = fileLine.nextInt();

			// System.out.println("...." + id + "...." +numOfSales +"...." + modelCode
			// +"...." + numSold);
//System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", id, numOfSales, modelCode, numSold);

			if (modelCode == 1) {
				cars[0] = numSold;
			} else if (modelCode == 2) {
				cars[1] = numSold;
			} else if (modelCode == 3) {
				cars[2] = numSold;
			} else if (modelCode == 4) {
				cars[3] = numSold;
			}

			numOfSales--;

			while (numOfSales > 0) {
				analyze = inputFile.nextLine();
				fileLine = new Scanner(analyze);

				modelCode = fileLine.nextInt();
				numSold = fileLine.nextInt();

				if (modelCode == 1) {
					cars[0] = numSold;
				} else if (modelCode == 2) {
					cars[1] = numSold;
				} else if (modelCode == 3) {
					cars[2] = numSold;
				} else if (modelCode == 4) {
					cars[3] = numSold;
				}
				numOfSales--;

				// System.out.println("...." + id + "...." +numOfSales +"...." + modelCode
				// +"...." + numSold);
//System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", " ", " ", modelCode, numSold);
			}

			
			
ppl.add(new Salesperson(id, cars));
			
		}
		
		/*for (int i = 0; i < ppl.size(); i++) {
				// cars[i] = 0;
				//System.out.print("\nARRRRIndex:------------------------------------------------");

				// = new int[4];
				int [] w = ppl.get(i).getQcars();
				for (int h = 0; h < w.length; h++) {
					System.out.print("Index: " + h + "Total: " + w[h] + "\n");

				}
				
			}*/

		for (int i = 0; i < ppl.size(); i++) {
			ppl.get(i).sales();
		//	System.out
		}
		System.out.print(ppl.size());
//for (int i = 0; i < cars.length; i++) {
//				System.out.print("Index: " + i + "Total: " + cars[i] + "\n");

	//		}

		inputFile.close();
	}

	public void openFile() throws FileNotFoundException {

		filename = keyboard.nextLine();

		try {
			file = new File(filename); // Freaking src,
			inputFile = new Scanner(file);

			System.out.println("\nFile Found!\n");
		} catch (FileNotFoundException e) {

			System.out.print("File not found, please enter the file name:");
			openFile();
		}
	}

}
