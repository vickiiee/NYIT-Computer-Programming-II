package apr22;

//Vickie Wu
//4/22/19

// based on LinkStackS but Generic
public class LinkStackGeneric<T> { //Put generic parameter where class name is. can have 2 ex: <x,y>

	private LinkedList2<T> theList; 
	private int itsSize;
	
	private T [] example; //can replace only reference types //check slides

//--------------------------------------------------------------
	public LinkStackGeneric() // constructor
	{
		theList = new LinkedList2<T>();
		itsSize = 0;
	}

//--------------------------------------------------------------
	public void push(T j) // put item on top of stack
	{
		theList.addANodeToStart(j);
		itsSize++;
		System.out.println("push(" + j + ")");
	}

//--------------------------------------------------------------
	public void pop() // take item from top of stack
	{
		itsSize--;
		theList.deleteHeadNode();
		System.out.println("pop()");
	}

//--------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (theList.length() == 0);
	}

//--------------------------------------------------------------
	public void displayStack() {
		System.out.print("Stack (top-->bottom): \n");
		theList.showList();
	}
	/*In class work..
	 * ArrayList Generic/*public LinkStackGeneric() { theList = new ArrayList<T>();
	 * }
	 * 
	 * private List<T> theList;
	 * 
	 * //-------------------------------------------------------------- 
	 * public void push(T j) // put item on top of stack { theList.add(j); // itsSize++;
	 * System.out.println("push(" + j + ")"); }
	 * 
	 * //--------------------------------------------------------------
	 * 
	 * public void pop() // take item from top of stack { // itsSize--;
	 * theList.remove(theList.size() - 1); System.out.println("pop()"); }
	 * 
	 * //-------------------------------------------------------------- public
	 * boolean isEmpty() // true if stack is empty { return (theList.size() == 0); }
	 * 
	 * //-------------------------------------------------------------- public void
	 * displayStack() { System.out.println("Stack (top-->bottom): \n"); for (int i =
	 * theList.size() - 1; i >= 0; i--) { System.out.println(theList.get(i)); }
	 * 
	 * }
	 */

}
