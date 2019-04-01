package mar11;

//Vickie Wu
//March 11

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle(String color, int w, int l) {
		super(color);
		this.length = l; 
		this.width = w;
	}
	
	public double getArea() {
		return length*width;
	}

	public String toString() {
		return "Rectangle: Color of shape: "+ getColor();
	}
}
