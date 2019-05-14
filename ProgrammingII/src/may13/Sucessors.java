package may13;

//VIckie Wu
//5/13/19
import java.io.IOException;
import java.util.Scanner;

import apr8.JunkyardReport;

public class Sucessors {

	private static Scanner userInput;
	private static int startNum;

	public Sucessors() {
		// TODO Auto-generated constructor stub
	}

	public static Position findPosition(int n, int[][] arr) {
		/*
		 * findPosition(8,arr) return the Position obj(2,1); findPosition (17,arr)
		 * returns null because it aint there
		 */

		// System.out.print(n);
		for (int row = 0; row < arr.length; row++) {
			// System.out.print("****");
			for (int col = 0; col < arr[0].length; col++) {
				// System.out.print(arr[row][col] + " ");
				if (arr[row][col] == n) {
					// System.out.print("HIT");
					// System.out.print("call method");
					return new Position(row, col);
				} // System.out.print("------- \n");
			}
		}

		return null;
	}

	public static Position[][] getSucessorArray(int[][] intArr) {
		/*
		 * returns a 2D successor array of positions created from a given 2D integer
		 * array
		 */
		Position[][] p = new Position[intArr.length][intArr[0].length];
		startNum++;
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				// if(intArr[i][j] == startNum) {
				p[i][j] = findPosition(intArr[i][j] + 1, intArr);
				// p[i][j] = new Position(i,j);
				startNum++;

				// }
			}
		}

//Testing
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				if (p[i][j] != null) {
					System.out.print(p[i][j].toString() + " ");
				} else {
					System.out.print("null ");
				}

			}
			System.out.print("\n");
		}

		return p;
	}

	public static void main(String[] args) throws IOException {

		// Position po = new Position(3,4);
		// System.out.println(po.toString());

		System.out.println("Enter the number of rows, columns, and starting number");
		userInput = new Scanner(System.in);

		int rows = userInput.nextInt();
		int cols = userInput.nextInt();
		startNum = userInput.nextInt();
//Testing		
		// System.out.println(rows + "," + cols +","+startNum);

/////////////
		int demo[][] = new int[rows][cols];

		// put all num in array
		int[] nums = new int[rows * cols];
		// System.out.println("nums length : "+ nums.length);
		int pl = startNum;
		for (int i = 0; i < nums.length; i++) {

			nums[i] = pl;
			pl++;
		}

		// swap
		for (int i = 0; i < 100; i++) {//// (Math.random()*((max-min)+1))+min; includes min and max
			int max = rows * cols - 1;
			int a = (int) (Math.random() * (max + 1));
			int b = (int) (Math.random() * (max + 1)); // random must have parenthesises
			int c = 0; // placeholder

			/*
			 * TESTING System.out.println("A is: "+a); System.out.println("b is: "+b);
			 * System.out.println("c is: "+c);
			 */

			c = nums[a];
			nums[a] = nums[b];
			nums[b] = c;

		}
		/*
		 * Testing
		 */
		for (int h = 0; h < nums.length; h++) {
			// System.out.println("elements in nums: " + nums[h]);
		}

		// populate it:
		int total = rows * cols;
		int s = 0;
		for (int i = 0; i < demo.length; i++) {
			// System.out.println("ROW: "+demo.length);
			for (int j = 0; j < demo[0].length; j++) {
				// System.out.println("COL: "+demo[0].length);
				// System.out.println(s);
				demo[i][j] = nums[s];
				s++;
			}
		}

		// print arr
		for (int i = 0; i < demo.length; i++) {
			// String row = "";
			for (int j = 0; j < demo[0].length; j++) {

				// System.out.println(s);
				System.out.print(demo[i][j] + "   ");
				s++;
			}
			System.out.print("\n");
		}

		getSucessorArray(demo);
	}
}
