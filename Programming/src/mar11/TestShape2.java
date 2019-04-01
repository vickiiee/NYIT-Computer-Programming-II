package mar11;

//Vickie Wu
//March 11

import java.util.ArrayList;
public class TestShape2
{
   public static void main(String[] args)
   {
       ArrayList<Shape> shapeLst = new ArrayList<Shape>();
       shapeLst.add( new Rectangle("red",4,5) );
       shapeLst.add( new Triangle("blue",4,5) );
       
       //ADDED:
       shapeLst.add( new Circle("green",4) );
       for (int i=0; i<shapeLst.size(); i++)
       System.out.println("Area="+shapeLst.get(i).getArea()+" "+ shapeLst.get(i));
   }

}