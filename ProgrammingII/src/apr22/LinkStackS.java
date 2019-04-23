package apr22;

////////////////////////////////////////////////////////////////
class LinkStackS {//Given
	
	private StringLinkedList theList;
	private int itsSize;

//--------------------------------------------------------------
	public LinkStackS() // constructor
	{
		theList = new StringLinkedList();
		itsSize = 0;
	}

//--------------------------------------------------------------
	public void push(String j) // put item on top of stack
	{
		theList.addANodeToStart(j);
		itsSize++;
		System.out.println("push(" + j + ")");
	}

//--------------------------------------------------------------
//public Link pop()            // take item from top of stack
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
} // end class LinkStack