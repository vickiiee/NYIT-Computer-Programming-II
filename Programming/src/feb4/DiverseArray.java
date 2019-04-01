package feb4;

//Vickie Wu
//Feb 18
public class DiverseArray {

	public DiverseArray() {
	}

	public static void main(String[] args) {

		//DiverseArrayTest y = new DiverseArrayTest();
		//y.main(args);

		int[][] mat1 = { { 1, 3, 2, 7, 3 }, { 10, 10, 4, 6, 2 }, { 5, 3, 5, 9, 6 }, { 7, 6, 4, 2, 1 } };
		for (int i = 0; i < mat1.length; i++) {
			System.out.print("\n");
		for (int q = 0; q < mat1[0].length; q++) {
			if(mat1[i][q]<10) {
				System.out.print(" " + mat1[i][q] + " ");
				}else {
					System.out.print(mat1[i][q] + " ");
				}
			}
		}
		
		System.out.println("\n isDiverse(mat1): "+isDiverse(mat1)+ "");
		

		int[][] mat2= { { 1, 1, 5, 3, 4 }, { 12, 7, 6, 1, 9 }, { 8, 11, 10, 2, 5 }, { 3, 2, 3, 0, 6 } };
		for (int i = 0; i < mat2.length; i++) {
			System.out.print("\n"); //ln
			for (int q = 0; q < mat2[0].length; q++) {
				if(mat2[i][q]<10) {
					System.out.print(" " + mat2[i][q] + " ");
				}else {
					System.out.print(mat2[i][q] + " ");
				}
				
			}
		}
		System.out.println("\n isDiverse(mat2): "+isDiverse(mat2)+ "");
		
		System.out.println("\nRow sums in 6th Column");
		addColumn(mat1);
		System.out.println("\nNew mat1");
		addColumn(mat2);
		System.out.println("\nNew mat2");
		
	}

	// (a) arraySum(int[] arr)
	public static int arraySum(int[] arr) {
		int sum = 0;

		for (int e : arr) {
			sum = sum + e;
		}
		return sum;
	}

	// (b) rowSums(int[][] arr2D)
	public static int[] rowSums(int[][] arr2D) {
		int[] rowSums = new int[arr2D.length];

		for (int i = 0; i < arr2D.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr2D[0].length; j++) {
				sum = sum + arr2D[i][j];
				rowSums[i] = sum;
			}
		}
		return rowSums;
	}

	// (c) isDiverse(int[][] arr2D)
	public static boolean isDiverse(int[][] arr2D) {
		boolean t = false;
		int[] arr = rowSums(arr2D);

		for (int i = 0; i < arr.length; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					return false;
				}
			}
		}
		return true;

	}

	public static void addColumn(int[][] arr) {
		int col = arr.length;
		int row = arr[0].length + 1;

		int[][] newArr = new int[col][row++];

		for (int i = 0; i < arr.length; i++) {
			for (int q = 0; q < arr[0].length; q++) {
				newArr[i][q] = arr[i][q];
			}
		}

		int[] v = rowSums(arr);

		for (int i = 0; i < newArr.length; i++) {
			newArr[i][newArr[0].length - 1] = v[i];
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print("\n"); //ln
			for (int q = 0; q < newArr[0].length; q++) {
				if(newArr[i][q]<10) {
					System.out.print(" " + newArr[i][q] + " ");
				}else {
					System.out.print(newArr[i][q] + " ");
				}
				
			}
		}
	}

}
