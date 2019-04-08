package apr8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Notes {

	private static PrintWriter x;

	public Notes() {//Zybook Ch9
		// File Input/Output: 
		/*
		 * To open a file for text output, you create an instance of the PrintWriter Class. Parameter is fileName.txt
		 * Allows you to write data to a file using println, with whatever you want to write in the parameter, like you've done so many times
		 * 
		 * PrintWriter x = new PrintWriter(fileName.txt);
		 * x.println("...");
		 * 
		 * 
		 * x.close();
		 * 	//will close file and tht means user wil not be able to edit/change anything in file
		 */
		
		
		/*
		 * Object Serialization
		 * 	class must implemetnt "Serializable" interface
		 * 
		 * 
		 */
		
	}

	 public static void main(String[] args) throws FileNotFoundException {
		
			File v = new File("demo.txt");
			
			System.out.println("try");
		
			System.out.println("Not found");
		
			
			      FileInputStream fileByteStream = null; // File input stream
			      Scanner inFS = null;                   // Scanner object
			      int fileNum1;                          // Data value from file
			      int fileNum2;                          // Data value from file

			      // Try to open file
			      System.out.println("Opening file myfile.txt.");
			      fileByteStream = new FileInputStream("demo.txt");
			      inFS = new Scanner(fileByteStream);
			      
			      // File is open and valid if we got this far (otherwise exception thrown)
			      // myfile.txt should contain two integers, else problems
			      System.out.println("Reading two integers.");
			      fileNum1 = inFS.nextInt();
			      fileNum2 = inFS.nextInt();

			      // Output values read from file
			      System.out.println("num1: " + fileNum1);
			      System.out.println("num2: " + fileNum2);
			      System.out.println("num1+num2: " + (fileNum1 + fileNum2));

			      // Done with file, so try to close it
			      System.out.println("Closing file myfile.txt.");
			      try {
					fileByteStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // close() may throw IOException if fails
			   
			
		//v.println("sdfdsf");
		
	}

}
