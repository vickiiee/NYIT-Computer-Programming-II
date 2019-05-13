package testGeneric;
public class GenericMAxMethodTest {
   // generic method printArray
   public static < E extends Comparable<E> > E maximum( E a, E b, E c ) {
      // Display array elements
      E max = a;
      if (b.compareTo(max)>0)
        max = b;
      if (c.compareTo(max)>0)
        max = c;
      return max;
    }


   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      
      System.out.println("maximum(1,2,4) = "+maximum(1,2,4));
      System.out.println("maximum(11.5,2.4,4.1) = "+maximum(11.5,2.4,4.1));
      System.out.println("maximum('b','a','k') = "+maximum('b','a','k'));
      System.out.println("maximum(\"do\",\"re\",\"mi\") = "+maximum("do","re","me"));
   }
}