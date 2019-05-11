package may6;
//Vickie Wu
//May 10 2019
import java.util.*;
import java.io.*;

public class Bingo {
	private Random rand = new Random();
	private int[][] card; // Bingo card configuration
	private int[] stream; // list of 75 integers
	private boolean[][] marks; // simulates placing chips on a Bingo card 
	private int r;
	private ArrayList<Integer> call;

	public Bingo() {
		card = new int[5][5];
		stream = new int[75];
		//marks = new boolean[5][5];
	}

	/**
	 * This method writes a random Bingo card configuration and a stream of random
	 * number between 1 and 75 to the output file.
	 *
	 * The first column in the table contains only integers between 1 and 15, 
	 * the second column numbers are all between 16 and 30, 
	 * the third are 31 to 45, 
	 * the fourth 46-60, 
	 * and the fifth 61-75.
	 *
	 * There are no duplicate numbers on a Bingo card.
	 */
	public void write(String outputFile) throws IOException { //how to write a file

		 call = new ArrayList<Integer>(); //initialize
		
		//string to store #s for comparing random numbers in each column!
		String one = " ";
		String two = " ";
		String three = " ";
		String four = " ";
		String five = " ";

		boolean in = false; //is the randomly generated number in the string? in other words, has it been generated already?
		
		//GENERATE BINGO CARD
		for(int row = 0; row < card.length; row++) {
			for(int col = 0; col < card[0].length; col++) {
				if(col == 0) { //1-15
				//System.out.println("First Col");
					while (in == false) {
						r = (int) (Math.random() * 15 + 1);//(Math.random()*((max-min)+1))+min; includes min and max
						//System.out.println("First Col: "+one.indexOf(""+r));
						if (one.indexOf(""+r) == -1) { // if randomly generated num is not there// turn num into string
							in = true; //toggle boolean
							card[row][col] = r; //element becomes tht num
							one += r + " "; //store it into string to show tht num has been called and cannot be called again
						}
					}
					in = false; //default false means num is in the string which activates while loop to keep looping until it turns true
				}
				if(col == 1) { //16-30
					
					while (in == false) {//(Math.random()*((max-min)+1))+min;
						r = (int) (Math.random() * ((30-16)+1) + 16);
						//System.out.println("2nd Col: "+two.indexOf(""+r));
						if (two.indexOf(""+r) == -1) { // not there
							in = true;
							card[row][col] = r;
							two += r + " ";
						}
					}
					in = false;
				}
				if(col ==2) { //31-45
					while (in == false) {
						r = (int) (Math.random() * (45-31+1) + 31);
						//System.out.println("3rd Col: "+three.indexOf(""+r));
						if (three.indexOf(""+r) == -1) { // not there
							in = true;
							card[row][col] = r;
							three += r + " ";
						}
					}
					in = false;
				}
				if(col ==3) { //46-60
					while (in == false) {
						r = (int) (Math.random() * (60-46+1) + 46);
						//System.out.println("4th Col: "+four.indexOf(""+r));
						if (four.indexOf(""+r) == -1) { // not there
							in = true;
							card[row][col] = r;
							four += r + " ";
						}
					}
					in = false;
				}
				if(col ==4) { //61-75
					while (in == false) {
						r = (int) (Math.random() * (75-61+1) + 61);
						//System.out.println("five Col: "+five.indexOf(""+r));
						if (five.indexOf(""+r) == -1) { // not there
							in = true;
							card[row][col] = r;
							five += r + " ";
						}
					}
					in = false;
				}
			
			
			}
		}
		card[2][2]=0;
/*testing		
		for(int i = 0; i < card.length; i++) {
			for (int k = 0; k < card[0].length; k++) {
				System.out.print(card[i][k]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
*/		
		shuffle(call); //generate 'stream' of numbers to be called out
		
//how to write file: in depth: https://howtodoinjava.com/java/io/java-write-to-file/
		/*
		 * 1) have an existing file in folder // to do this, go into file explorer and into folder where the java code is. select correct package folder, and then right click to create new .txt file
		 * 2) create a string with the stuff you want to put in file
		 * 3) call instance FileWriter with the file name in parameter //determines location of file you want to edit 
		 * 4) filewriter instance.write(filename) //call write() method
		 * 
		 */
		    /*EX:
		     * String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
		     
		    FileWriter fileWriter = new FileWriter(outputFile);
		    fileWriter.write(fileContent);
		    fileWriter.close();
		*/
		
//WRITE FILE
		//create string with what you want to put in file
		String fileContent = "";

		for (int row = 0; row < card.length; row++) {
			for (int col = 0; col < card[0].length; col++) {
				fileContent += card[row][col] + " ";
			}
			fileContent += "\n";
		}

		for (int i = 0; i < call.size(); i++) {
			fileContent += call.get(i) + " ";
		}
		
		//create instance of fileWriter to show where you want the content to be in
		FileWriter file = new FileWriter(outputFile);
		file.write(fileContent);
		file.close();
//		throw new RuntimeException("You need to implement this method");
	}

	/**
	 * Shuffles the list of numbers
	 */
	public void shuffle(ArrayList<Integer> list) {
		// swaps k-th index with a random index
		
		//populate arraylist with num in order
		for(int i = 1; i < 76; i++) {
			list.add(i);
		}
			/*TESTing
			for(int i = 0; i < 75; i++) {
				System.out.print(list.get(i) + " ");
				if(i%25==0) {
					System.out.print("\n");
				}
			}*/
		
		//randomize it
		for(int i = 0; i < 100; i++) {////(Math.random()*((max-min)+1))+min; includes min and max
			int a = (int) (Math.random() * (74+1));
			int b = (int) (Math.random() * (74+1)); //random must have parenthesises
			int c = 0; //placeholder
			
				/*TESTING
				System.out.println("A is: "+a);
				System.out.println("b is: "+b);
				System.out.println("c is: "+c);
				*/
			
			c = list.get(a);
			list.set(a, list.get(b));
			list.set(b, c);
		}
		
				/*TESTING
				System.out.print("\n");
				System.out.print("\n");
				for(int i = 0; i < 75; i++) {
					System.out.print(list.get(i)+ " ");
					if(i%25==0) {
						System.out.print("\n");
					}
				}*/
		//throw new RuntimeException("You need to implement this method");
	}

	/**
	 * This method reads a given inputFile that contains a Bingo card configuration and a stream of numbers between 1 and 75. 
	 * A Bingo card configuration is stored in the card array. 
	 * A list of 75 integers is stored in the stream array.
	 */
	public void read(String inputFile) throws IOException {
		File f = new File(inputFile); // ex: src/apr8/Junkyard.txt
		Scanner file = new Scanner(f);

		for (int row = 0; row < card.length; row++) {
			for (int col = 0; col < card[0].length; col++) {
				card[row][col] = file.nextInt(); // return next int of array
				//System.out.print(card[row][col] + " ");
			}
			//System.out.print("\n");
		}
		// after it gets the first 25 ints, put the remaining 75 nums into stream array
		for (int i = 0; i < stream.length; i++) {
			stream[i] = file.nextInt();
		}
		
		//throw new RuntimeException("You need to implement this method");
	}

	/**
	 * This method returns the first integer from the stream array that gives you
	 * the earliest winning condition.
	 *
	 * - all the spots in a column are marked 
	 * - all the spots in a row are marked 
	 * - all the spots in either of the two diagonals are marked 
	 * - all four corner squares are marked
	 */
	public int playGame() {
		boolean win = false;
		int el = -1;

		while (win == false && el < 75) {
			el++;
			// System.out.print("WHIle lop");
			for (int row = 0; row < card.length; row++) {
				for (int col = 0; col < card[0].length; col++) {

					if (card[row][col] == stream[el]) {
						// System.out.print(card[row][col]);
						card[row][col] = 0;
						boolean zero = checkBingo();
						if (zero) {
							win = true;
							// System.out.println(stream[el]+"WINNER" + el);
						}
					}
				}
			}

		}
		return stream[el];
		// throw new RuntimeException("You need to implement this method");
	}
	
	private boolean checkBingo() {	
		// rows
		for (int row = 0; row < card.length; row++) {
			int r = 0;

			for (int col = 0; col < card[0].length; col++) {
				r += card[row][col];
			}
			if (r == 0) {
				return true;
			}
		}

		// col
		for (int col = 0; col < card[0].length; col++) {
			int c = 0;

			for (int row = 0; row < card.length; row++) {
				c += card[row][col];
			}
			if (c == 0) {
				return true;
			}
		}

		// diagonal1
		int d1 = 0;
		for (int row = 0; row < card.length; row++) {
			d1 += card[row][row];
		}
		if (d1 == 0) {
			return true;
		}

		// diagonal2
		int d2 = 0;
		for (int row = 0; row < card.length; row++) {// 0,4|1,3|2,2|3,1|4,0
			d2 += card[row][4 - row]; // (card.length -1)
		}
		if (d2 == 0) {
			return true;
		}

		// four corners
		int c1 = card[0][0];
		int c2 = card[0][4];
		int c3 = card[2][2];
		int c4 = card[4][0];
		int c5 = card[4][4];
		if (c1 + c2 + c3 + c4 + c5 == 0) {
			return true;
		}

		// everything else
		return false;

	}

	public static void main(String[] args) throws IOException {
		Bingo game = new Bingo();
		game.write("src/may6/input1.txt");//src/apr8/Junkyard.txt
		//game.read("src/may6/test2.txt");
		game.read("src/may6/input1.txt");
		int x = game.playGame();
		System.out.println("\nthe winning number is " + x);
	}

}