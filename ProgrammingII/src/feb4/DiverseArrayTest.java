package feb4;

public class DiverseArrayTest {
	
	private static int [] i= {1,3,2,7,3};;
	public DiverseArrayTest() {
		
	}

	
	public static void main(String[] args) {
		DiverseArray h = new DiverseArray();
		int s = h.arraySum(i);
		System.out.println(s + " sum");
		System.out.println("\n /////////////////////////////////// \n");
		int [][] a = { {1,3,2,7,3}, 
					{10,10,4,6,2},
					{5,3,5,9,6},
					{7,6,4,2,1}};
		
		int [][] b = { {1,1,5,3,4}, 
				{12,7,6,1,9},
				{8,11,10,2,5},
				{3,2,3,0,6}};
		
		
		int [] d= h.rowSums(a);
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("\n /////////////////////////////////// \n");
		
		int [] q= h.rowSums(b);
		for(int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}
		
		System.out.println("\n /////////////////////////////////// \n");
		
		System.out.println(h.isDiverse(a) + "fianl");
		System.out.println(h.isDiverse(b)+ "fianl");
		
		h.addColumn(b);
		/*
		 * for (int i = 0; i < newArr.length; i++) {
			System.out.println("\n");
			for (int q = 0; q < newArr[0].length; q++) {
				System.out.print("" + newArr[i][q] + " ");
			}
		}
		 */
		h.addColumn(a);
	}
		
	
	

}
