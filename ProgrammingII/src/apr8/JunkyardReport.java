package apr8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


//Chapter 11 & 4
public class JunkyardReport {

	private static File file;
	private static Scanner inputFile;
	private static String filename;
	private static Scanner keyboard;
	
	private static String analyze;
	// private Scanner userInput;

	private String id;
	private String numCarsSold;
	private String modelCode; //type of car
	
	int [] cars;
	/*
	 * AUDI:   0
	 * BMW:    1
	 * JAGUAR: 2
	 * LEXUS:  3
	 */
	
	
	
	public JunkyardReport() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		JunkyardReport jk = new JunkyardReport();
		keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: "); //src/apr8/Junkyard.txt
		
		jk.openFile();
		
		System.out.println("Welcome to Luxury Junkyard, Inc. the end of month report");
		System.out.println("--------------------------------------------------------");
		
		System.out.println("CURRENT SELLING PRICES");
		System.out.println("----------------------");
		
		System.out.printf("%-10.30s  %-30.30s%n", "AUDI", "8876.50"); //%-30.30s
		System.out.printf("%-10.30s  %-30.30s%n", "BMW", "9909.89");
		System.out.printf("%-10.30s  %-30.30s%n", "JAGUAR", "10999.99");
		System.out.printf("%-10.30s  %-30.30s%n", "LEXUS", "7776.69");
		System.out.println("\n------------------------------------------------------------------");
		
		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "SALESPERSON", "MODEL", "COUNT", "TOTAL SOLD $");
		System.out.printf("%-15.30s  %-15.30s  %-15.30s  %-15.30s%n", "ID", "DESCRIPTION", "SOLD", "PER MODEL");
		System.out.println("------------------------------------------------------------------");
	
		
		
		
		
		analyze = inputFile.nextLine();
		Scanner x = new Scanner(analyze);
		
		//zybooks!!!!
		int id = x.nextInt();
		int numOfSales = x.nextInt();
		int modelCode = x.nextInt();
		int numSold = x.nextInt();
		
		System.out.println("TSET" + id + "TSET" +numOfSales +"TSET" + modelCode +"TSET" + numSold);
		
		/*String data = inputFile.nextLine();
		String[] pieces = data.split(" ");
		for(int i = 0; i<pieces.length; i++) {

				System.out.println(pieces[i]);

		}*/
		
		System.out.println(analyze);
	
		
		for(int i = 0; i<analyze.length(); i++) {
			if(!analyze.substring(i,i+1).equals(" ")) {
				
				System.out.println(analyze.substring(i,i+1));
			}
		}

/*
		System.out.println("\n");
		// Read lines from the file until no more are left.
		while (inputFile.hasNext()) {
			// Read the next name.
			String friendName = inputFile.nextLine();

			// Display the last name read.
			System.out.println(friendName);
		}

		// Close the file.
		inputFile.close();*/
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
