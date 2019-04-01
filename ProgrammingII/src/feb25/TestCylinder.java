package feb25;


	/*
	 * A test driver for the Cylinder class.
	 */
	public class TestCylinder {
	   public static void main(String[] args) {
	      Cylinder cy1 = new Cylinder();
	      System.out.println(cy1.toString());
	      /*System.out.println("Radius is " + cy1.getRadius()
	         + " Height is " + cy1.getHeight()
	         + " Color is " + cy1.getColor()
	         + " Base area is " + cy1.getArea()
	         + " Volume is " + cy1.getVolume());
	   */
	      //Cylinder cy2 = new Cylinder(5.0, 2.0);
	      Cylinder cy2 = new Cylinder(2.0, 5.0);
	      System.out.println(cy2.toString());
	      /*System.out.println("Radius is " + cy2.getRadius()
	         + " Height is " + cy2.getHeight()
	         + " Color is " + cy2.getColor()
	         + " Base area is " + cy2.getArea()
	         + " Volume is " + cy2.getVolume());
	         */
	   }
	}


