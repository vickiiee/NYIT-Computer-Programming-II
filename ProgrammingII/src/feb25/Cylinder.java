package feb25;

//Vickie Wu
//Feb 25 2019
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
		return "This is a cylinder: \n"
				+ "color = "+getColor()+" \n"
				+ "radius = "+ getRadius()+"\n"
				+ "height = "+ getHeight()+"\n"
				+ "base area = "+ super.getArea() + "\n"
				+ "surface area = "+ getArea() + "\n" 
				+ "volume = " + getVolume() + "\n";
	}

	public double getArea() {
		
		return (2*Math.PI*getRadius())*height+(2*super.getArea());
	}

	public double getVolume() {
		return Math.PI*(getRadius()*getRadius())*height;
	}
}
