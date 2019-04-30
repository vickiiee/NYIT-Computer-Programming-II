package apr29;

import java.io.IOException;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.print(f.fib(9));

	}

	// 0,1,1,2,3,5,8,13,
	public int fib(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);

	}
	
	public void loop(int n) {
		
	}

}
