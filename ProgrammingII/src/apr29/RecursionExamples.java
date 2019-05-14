package apr29;
//Vickie Wu
//Apr29

public class RecursionExamples {

	private int sum;

	public RecursionExamples() {
		// PowerN
		//addEvenTo
		//bunnyEars
	}

	public static void main(String[] args) {
		RecursionExamples f = new RecursionExamples();
		System.out.println(f.powerN(3,2));
		System.out.println(f.addEvenTo(8));
		System.out.println(f.bunnyEars(3));
		System.out.println(f.bunnyEars2(3)); //work on it --> done!
		
		System.out.println(f.triangle(10)); //work on it
		/*//f.bunnyEars2(3);
		
		*/
	}

	public int powerN(int y, int z) {

		if (z == 1) {
			return y;
		}
		return y * powerN(y, z - 1);

		/*
		 * ex(3,1) = 3; ex(3,2) = 9; ex(3,3) = 27
		 */
	}

	public int addEvenTo(int n) {
		if (n < 2) { // add only positive even numbers
			return 0;
		}
		if (n % 2 == 1) {
			n = n - 1;
		}
		if (n == 2) {
			return n;
		} else
			return n + addEvenTo(n - 2);
		/*
		 * addEvenTo(5) --> 6 addEvenTo(6) -->12
		 */

	}

	public int bunnyEars(int n) {
		if (n <= 0) {
			return 0;
		} else
			return bunnyEars(n - 1) + 2;
	}

	/*
	 * bunnyEars(0) = 0 bunnyEars(1) = 2 bunnyEars(2) = 4
	 */

///Work on oit --------------------------------------------------------------------------------------------------------------------------	
	public int bunnyEars2(int n) {
		/*
		 * bunnyEars2(0) = 0 
		 * bunnyEars2(1) = 2 //(2+ bunnyEars2(0)) 
		 * bunnyEars2(2) = 5 //(3+ bunnyEars2(1))
		 */
		if (n == 0) {
			return 0;
			
		}else
		if (n % 2 == 0 && n !=0) // even
			return (3 + bunnyEars2(n - 1));

		else if (n % 2 == 1) // odd
			return (2 + bunnyEars2(n - 1));
		
		return -1;
	}
	
	/*public int bunnyEars2(int bunnies) {
		  if (bunnies == 0) return 0;
		  if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
		  else return 2 + bunnyEars2(bunnies-1);
		}*/ //coding bat. fixed problem.. correct code just called the wrong method (bunnyEars instead of bunnyEars2) so dumb
	
	public String triangle(int rows) {
		String g = "";
		if(rows <=0) {
			return "";
		}
		else {
		//for(int i = 0; i < rows; i++) {
			//	g+="*";
			//}
			g =getT(rows, g);
		}
			return triangle(rows -1)+ g+"\n";
		
		
	}
	
	public String getT(int n, String g ) { //in place of a for loop
		// g = "";
		if (n < 1) {
			return "";
			// return g;
		} else {
			g += "*";
			return g+getT(n - 1, g);
		}
			
		
		
	}
}
