package testGeneric;
public class OrderedPair_Demo
{
    public static void main()
    {
        OrderedPair<String, Integer> p1 = 
            new OrderedPair<String, Integer>("Even", 8);
        OrderedPair<String, String>  p2 = 
            new OrderedPair<String, String>("hello", "world");
            
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        System.out.println(p2.getKey());
        System.out.println(p2.getValue());    
    }  
}
