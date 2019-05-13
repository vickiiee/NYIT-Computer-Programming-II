package testGeneric;
public class Box_Demo2
{
    public static void main()
    {
        Box2<Integer> myIntBox = new Box2<Integer>();
        myIntBox.set(9);
        System.out.println(myIntBox.get());

        myIntBox.set("Hi");
        System.out.println(myIntBox.get());

    }
}
