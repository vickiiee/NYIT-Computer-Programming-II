package apr22;


//VIckie Wu
//4/22/19
class LinkStackSApp {
	public static void main(String[] args) {

		System.out.println("STRING test\n--------------------------------------------------");

		LinkStackGeneric<String> theStack = new LinkStackGeneric<String>();
		// STRING
		theStack.push("20 twenty"); // push items
		theStack.push("40 fourty");

		theStack.displayStack(); // display stack

		theStack.push("60 sixty"); // push items
		theStack.push("80 eighty");

		theStack.displayStack(); // display stack

		theStack.pop(); // pop items
		theStack.pop();

		theStack.displayStack(); // display stack

//------------------------------------------------------------------------------------------------------------------
		// INTEGER
		System.out.println("\nINTEGER test\n--------------------------------------------------");
		LinkStackGeneric<Integer> e = new LinkStackGeneric<Integer>();
		e.push(123); // push items
		e.push(15345);

		e.displayStack(); // display stack

		e.push(6849); // push items
		e.push(2342);

		e.displayStack(); // display stack

		e.pop(); // pop items
		e.pop();

		e.displayStack(); // display stack

//------------------------------------------------------------------------------------------------------------------
		// Double
		System.out.println("\nDOUBLE test\n--------------------------------------------------------");
		LinkStackGeneric<Double> d = new LinkStackGeneric<Double>();
		d.push(1.23); // push items
		d.push(15.345);

		d.displayStack(); // display stack

		d.push(6.849); // push items
		d.push(2.342);

		d.displayStack(); // display stack

		d.pop(); // pop items
		d.pop();

		d.displayStack(); // display stack

	} // end main()
} // end class LinkStackApp
////////////////////////////////////////////////////////////////