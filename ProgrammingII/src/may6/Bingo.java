package may6;

import java.util.*;
import java.io.*;

public class Bingo {
	private Random rand = new Random();
	private int[][] card; // Bingo card configuration
	private int[] stream; // list of 75 integers
	private boolean[][] marks; // simulates placing chips on a Bingo card
	private int r;
	
	private Scanner fileLine;
	private Scanner file;

	public Bingo() {
		card = new int[5][5];
		stream = new int[75];
		marks = new boolean[5][5];
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
		//testing
		int sum = 0; 
		String g = "";
		
		//arr for comparing!
		int [] one = new int [5];
		int [] two = new int [5];
		int [] three = new int [5];
		int [] four = new int [5];
		int [] five = new int [5];
		
		boolean in = false;
		
		for(int row = 0; row < card.length; row++) {
			for(int col = 0; col < card[0].length; col++) {
				if(col == 0) { //1-15
					
					r = (int) (Math.random()*15+1);
					
					while (in == false) {
					for(int i = 0; i < one.length; i++) {
						if(one[i]==r) {
							in = true;
					}
						}}
	
					
					card[row][col] =r;
				}
				if(col == 1) { //16-30
					
				}
				if(col ==2) { //31-45
					
				}
				if(col ==3) { //46-60
					
				}
				if(col ==4) { //61-75
					
				}
			//TESTING
				card[row][col] =sum++;
				g+=card[row][col]+" ";
				if(col==card[0].length-1 ) {
					System.out.println(g);
					g="";
				}
			
			}
		}
		
		
		throw new RuntimeException("You need to implement this method");
	}

	/**
	 * Shuffles the list of numbers
	 */
	public void shuffle(ArrayList<Integer> list) {
		// swaps k-th index with a random index

		throw new RuntimeException("You need to implement this method");
	}

	/**
	 * This method reads a given inputFile that contains a Bingo card configuration and a stream of numbers between 1 and 75. 
	 * A Bingo card configuration is stored in the card array. 
	 * A list of 75 integers is stored in the stream array.
	 */
	public void read(String inputFile) throws IOException {
		File f = new File(inputFile); //Freaking src, src/apr8/Junkyard.txt
	      Scanner file = new Scanner(f);
	      
	      System.out.println("\n");

	      // Read lines from the file until no more are left.
	     /* while (file.hasNext())
	      {
	         // Read the next name.
	         String friendName = file.nextLine();

	         // Display the last name read.
	         System.out.println(friendName);
	      }
		int num = 0;*/
		
		//while(file.hasNextInt()) {
			
			//String analyze = file.nextLine();
			//fileLine = new Scanner(analyze);
			for(int row = 0; row< card.length; row++) {
				for (int col = 0; col < card[0].length; col++) {
					card[row][col]= file.nextInt();
					System.out.print(card[row][col]);
				}
			}
			
			for(int i = 0; i < stream.length; i++) {
				stream[i]=file.nextInt();
			}
			
		//}
		
		
		
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
		boolean win =false;
		int el=0;
		while(!win && el<75){
			int i = stream[el];
			
			for(int row = 0; row< card.length; row++) {
				for (int col = 0; col < card[0].length; col++) {
					
					if(card[row][col] == stream[el]) {
					System.out.print(card[row][col]);
						card[row][col]=0;
						checkBingo();
					}
				}
			}
			
		}
		throw new RuntimeException("You need to implement this method");

	}
	
	

	private boolean checkBingo() {
		int r = 0;
		//rows
		//if(card[0][0]==0 && card[1][0]&& card)
		for(int row =0; row < card.length; row++) {
			r+= card[row][0];
			
		}
		//i give up
		
	}

	public static void main(String[] args) throws IOException {
		Bingo game = new Bingo();
		//game.write("src/may6/input1.txt");//src/apr8/Junkyard.txt
		game.read("src/may6/test1.txt");
		//game.read("input1.txt");
		//int x = game.playGame();
		//System.out.println("the winning number is " + x);
	}

}