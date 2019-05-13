package testGeneric;
public class Box_Demo1
{
    public static void main()
    {
        Box myIntBox = new Box();
        myIntBox.set(9);
        System.out.println(myIntBox.get());

        myIntBox.set("Hi");
        System.out.println(myIntBox.get());



    }
}
