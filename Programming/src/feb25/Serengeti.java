package feb25;

//Vickie Wu
//Feb 25 2019
public class Serengeti {

	private int[] board;
	private int currentPlayer;
	private int playerCount;

	/**
	 * Creates the board array to be of size playerCount and fills it with random
	 * integer values from 1 to 10, inclusive. Initializes currentPlayer to a random
	 * integer value in the range between 0 and playerCount-1, inclusive.
	 * 
	 * @param playerCount the number of players
	 */

	public Serengeti() {

	}

	public Serengeti(int playerCount) {
		/* to be implemented in part (a) */
		this.playerCount = playerCount;
		board = new int[playerCount];

		for (int i = 0; i < playerCount; i++) {
			int element = (int) (Math.random() * 10 + 1);
			// System.out.println(element);
			board[i] = element;
		}

		System.out.println(playerCount + " Players:");

		displayBoard();

	}

	/**
	 * Distributes the chips from the current player's position one a time to each
	 * player in the game. Distribution begins with the next position and continues
	 * until all the chips have been distributed. If there are still chips to
	 * distribute when the player at the highest position reached, the next chip
	 * will be distributed to the player at position 0. Precondition: the current
	 * player has at least one chip. Postcondition: the current player has not
	 * changed.
	 */
	public void distributeCurrentPlayerChips() {
		int chips = board[currentPlayer];
		board[currentPlayer] = 0;

		int player = currentPlayer + 1;

		for (int i = 0; i < chips; i++) {
			if (player == playerCount) {
				player = 0;
			}
			
			board[player] = board[player] + 1;

			player++;
		}

	}

	// There may be instance variables, constructors, and methods that are not
	// shown.
	/*
	 * Select a random currentPlayer (display which one was picked and how many
	 * chips they had) then call distributeCurrentPlayerChips() then call
	 * displayBoard()
	 */
	public void playRound() {
		currentPlayer = (int) (Math.random() * (playerCount));
		
		System.out.println("\n	Current player is " + currentPlayer);
		System.out.println("	Chips: " + board[currentPlayer]);
		
		distributeCurrentPlayerChips();
		displayBoard();
	}

	// Print the board elements horizontally separated by spaces.
	public void displayBoard() {
		for (int i = 0; i < playerCount; i++) {
			if (i == 0) {
				System.out.print("	" + board[i] + " ");
			} else {
				System.out.print(board[i] + " ");
			}

		}
	}

}
