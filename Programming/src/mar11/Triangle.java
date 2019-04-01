package mar11;

//Vickie Wu
//March 11

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(String color, int b, int h) {
		super(color);
		this.base = b;
		this.height = h;
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return ((.5)*base*height);
	}
	
	public String toString() {
		return "Triangle: Color of shape: "+ getColor();
	}

}
