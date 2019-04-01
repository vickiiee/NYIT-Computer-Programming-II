package mar11;

//Vickie Wu
//March 11
public class TestShape1
{
   public static void main(String[] args)
   {
       Shape s1 = new Rectangle("red",4,5);
       System.out.println(s1);
       System.out.println("Area is "+s1.getArea());

       Shape t1 = new Triangle("blue",4,5);
       System.out.println(t1);
       System.out.println("Area is "+t1.getArea());
       
       //ADDED:
       Shape c1 = new Circle("green",4);
       System.out.println(c1);
       System.out.println("Area is "+c1.getArea());
    }
}