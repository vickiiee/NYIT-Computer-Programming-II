package mar11;

//Vickie Wu
//March 11

public class Shape {

	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public double getArea() {
		System.err.print("Shape Unknown! Cannot compute area!\n");
		return 0;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "SHAPESSSSS TITLE";
	}
}
