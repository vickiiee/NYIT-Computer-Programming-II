package apr8;

import java.io.IOException;
import java.util.Scanner;

public class JunkyardReportRun {

	public JunkyardReportRun() {
		// TODO Auto-generated constructor stub
	}
	
	public JunkyardReport() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		JunkyardReport jk = new JunkyardReport();
		keyboard = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		
		jk.openFile();
		
		analyze = inputFile.nextLine();


		System.out.println("\n");
		// Read lines from the file until no more are left.
		while (inputFile.hasNext()) {
			// Read the next name.
			String friendName = inputFile.nextLine();

			// Display the last name read.
			System.out.println(friendName);
		}

		// Close the file.
		inputFile.close();
	}

}
