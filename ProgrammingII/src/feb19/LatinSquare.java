package feb19;

//Vickie Wu
//Feb 19 2019
public class LatinSquare {

	private static int numElements;

	public LatinSquare() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			//Testing all samples
		  int[][] arr2D1 = { { 10, 30, 20, 0 }, 
		  					{ 0, 20, 30, 10 }, 
		  					{ 30, 0, 10, 20 }, 
		  					{20, 10, 0, 30 } };
		  
		  int[][] arr2D2 = { { 1, 2, 3 }, 
		  					{ 3, 1, 2 }, 
		  					{ 2, 3, 1 }, };
		  
		  int[][] arr2D3 = { { 1, 2, 3 }, 
				  			{ 3, 1, 2 }, 
				  			{ 7, 8, 9 }, };
		  
		  int[][] arr2D4 = { { 10, 30, 20, 0 }, 
				            { 20, 20, 30, 10 }, 
				            { 30, 0, 10, 20 }, 
				            {20, 10, 0, 30 } };
		 
		 int[][] arr2D5 = { { 10, 30, 20, 0 }, 
				            { 0, 20, 30, 10 }, 
				            { 30, 0, 10, 16 }, 
				            { 20, 10, 0, 30 } };

		printArray2D(arr2D1);
		if (isLatin(arr2D1))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");
		
		printArray2D(arr2D2);
		if (isLatin(arr2D2))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");
		
		printArray2D(arr2D3);
		if (isLatin(arr2D3))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");
		
		printArray2D(arr2D4);
		if (isLatin(arr2D4))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");
		
		printArray2D(arr2D5);
		if (isLatin(arr2D5))
			System.out.println("Yes, 2D array is a Latin Square");
		else
			System.out.println("NO, 2D array is NOT a Latin Square");

	}

	public static boolean isLatin(int[][] arr2d) {
		// create place to store elements for comparison --> ARRAY IDEA NOT USED
		numElements = arr2d[0].length;
		int[] storedVals = new int[numElements];

		// String to store values
		String val = "";

		for (int i = 0; i < arr2d[0].length; i++) {
			storedVals[i] = arr2d[0][i];
			val += " " + arr2d[0][i] + ",";
		}

		// Check rows
		for (int i = arr2d.length - 1; i >= 0; i--) {
			boolean t = duplicate(arr2d[i]);
			if (t) {
				System.out.println("Row " + i + " has duplicates.");
				return false;
			} else {
				// check against stored values
				for (int q = 0; q < arr2d[i].length; q++) {
					if (val.indexOf(" " + arr2d[i][q]) == -1) {
						System.out.println("Row " + i + " does not have all row 0 elements");
						return false;
					}
				}
			}
		}

		// Check columns
		// make temp array for comparison
		int[] temp = new int[arr2d.length];

		for (int i = arr2d.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr2d.length; j++) {
				temp[j] = arr2d[j][i];
			}
			// call duplicate
			boolean t = duplicate(temp);
			if (t) {
				System.out.println("Column " + i + " has duplicates.");
				return false;
			} else {
				// check against stored values
				for (int q = 0; q < temp.length; q++) {
					if (val.indexOf(" " + temp[q]) == -1) {
						System.out.println("Column " + i + " does not have all row 0 elements");
						return false;
					}
				}
			}
		}

		return true;
	}

	public static boolean duplicate(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// if values are same:
					return true;
				}
			}
		}

		return false;
		// false: no duplicates
		// true: there are duplicates

	}

	public static void printArray2D(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			System.out.print("\n");
			for (int q = 0; q < arr2d[0].length; q++) {
				if (arr2d[i][q] < 10) {
					System.out.print(" " + arr2d[i][q] + " ");
				} else {
					System.out.print(arr2d[i][q] + " ");
				}
			}
		}System.out.print("\n");
	}
}
