package feb19;

//Vickie Wu
//Feb 19 2019
public class Cylinder extends Circle{

	private double height = 1.0;

	public Cylinder() {

	}

	public Cylinder(double height) {
		this.height = height;
	}

	public Cylinder(double height, double radius) {
		setRadius(radius);
		this.height = height;
	}

	public Cylinder(double height, double radius, String color) {
		setRadius(radius);
		this.height = height;
		setColor(color); 
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public String toString() {
		return "Radius is "+ getRadius()+". Height is "+ getHeight()+". Color is "+getColor()+". Base area is "+ getArea() + ". Volume is " + getVolume() ;
	}

	public double getVolume() {
		return Math.PI*(getRadius()*getRadius())*height;
	}
}
