package studio7;

public class Rectangle {

	private double length;
	private double width;
	private double area;
	private double perimeter;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double area(double length, double width) {
		area = length*width;
		return area;
	}
	
	public double perimeter(double length, double width) {
		perimeter = (2*length)+(2*width);
		return perimeter;
	}
	
	public double largerArea(double area1, double area2) {
		if(area1>area1) {
			return area1;
		} else {
			return area1;
		}
	}
	
	public boolean isSquare(double length, double width ) {
		if(length==width) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Length: "+length + " Width: "+width;
	}
	
	
}
