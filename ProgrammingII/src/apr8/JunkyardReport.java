package apr8;

//Vickie Wu
//Apr 8 2019

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
	private Scanner keyboard; //user input for file name

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
		printReport();
	}

	public static void main(String[] args) throws IOException {
		new JunkyardReport();
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

		for (int i = 0; i < ppl.size(); i++) {
			audi += ppl.get(i).getAudi();
			bmw += ppl.get(i).getBmw();
			jaguar += ppl.get(i).getJaguar();
			lexus += ppl.get(i).getLexus();
			totalSales += ppl.get(i).getTotalSales();
		}

		System.out.println("OVERALL AUDI   UNITS SOLD: " + audi);
		System.out.println("OVERALL BMW    UNITS SOLD: " + bmw);
		System.out.println("OVERALL JAGUAR UNITS SOLD: " + jaguar);
		System.out.println("OVERALL LEXUS  UNITS SOLD: " + lexus + "\n");

		System.out.println("NUMBER SALESPERSONS: " + ppl.size());
		System.out.println("OVERALL SOLD:                 $" + String.format("%.2f", totalSales));
		System.out.println("AVERAGE SOLD per SALESPERSON: $" + String.format("%.2f", (totalSales / 12)));
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
			}
			ppl.add(new Salesperson(id, cars));
		}

		for (int i = 0; i < ppl.size(); i++) {
			ppl.get(i).sales();
		}

		inputFile.close();
	}

	public void openFile() throws FileNotFoundException {

		filename = keyboard.nextLine();

		try {
			file = new File(filename); // src/apr8/Junkyard.txt
			inputFile = new Scanner(file);

			System.out.println("\nFile Found!\n");
		} catch (FileNotFoundException e) {
			System.out.print("File not found, please enter the file name:");
			openFile();
		}
	}

}
