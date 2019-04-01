package feb19;

//Vickie Wu
//Feb 19 2019
public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "";//"Radius is "+ getRadius()+". Height is "+ +". Color is "+getColor()+". Base area is "+ getArea() ;
	}
	public double getArea() {
		return Math.PI*(getRadius()*getRadius());
	}
}
