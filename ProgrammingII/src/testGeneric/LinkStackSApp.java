package testGeneric;
class LinkStackSApp
{
    public static void main(String[] args)
    {
        LinkStackS theStack = new LinkStackS(); // make stack

        theStack.push("20 twenty");                    // push items
        theStack.push("40 fourty");

        theStack.displayStack();              // display stack

        theStack.push("60 sixty");                    // push items
        theStack.push("80 eighty");

        theStack.displayStack();              // display stack

        theStack.pop();                       // pop items
        theStack.pop();

        theStack.displayStack();              // display stack

    }  // end main()
}  // end class LinkStackApp
////////////////////////////////////////////////////////////////
