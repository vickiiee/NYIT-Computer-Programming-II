package mar25;

public class Notes {

	public Notes() {
		/*
		 * Exception Handling:
		 * 		try/catch blocks for exceptions
		 * 		used so that the program can be compiled all the way through without crashing
		 * 		great for testing
		 * 		if exception is thrown, put that into the catch block parameters to 'catch' it
		 * 
		 * 	Can use multiple catch statements for several exceptions after try block
		 */
		
		/*	EX:
		 * 		try{
		 * 			//array 
		 * 			//loop too far into array 
		 *      } catch (ArrayOutOfBOndsException e){ //Exception handling
		 *      	//print it didnt work
		 *      }
		 *      
		 *      Result: will print it didnt work.
		 *      
		 *      Can be used to determine if something is there or not, kinda like if/else 
		 *      
		 *  EX: determine int or string:
		 *      scanner;
		 *      int num; //to store user input
		 *      try{
		 * 			num = scanner.nextLine()n;
		 * 			
		 *      } catch (NumberMismatchException e){
		 *      	//print input not int
		 *      }
		 */      
		 
		/*
		 *		IllegalArgumentException --> general
		 *
		 *		Finally block alaways after 'catch' block
		 *		will always execute after catch block no matter what
		 */
		
		/*
		 * Stack Trace: shows all the methods that were executing when the exception was caught
		 */
		
		/*
		 * THROWS exceptions in in method name line --> for custom exceptions https://www.geeksforgeeks.org/throw-throws-java/
		 * 
		 * Ex: NegativeDeposit, NegativeStarting Balance, Negative Withdraw classes example of custom exceptions
		 * 	BankAccount3: example of method throwing exceptions by calling new exceptions
		 */
	}
	

}
