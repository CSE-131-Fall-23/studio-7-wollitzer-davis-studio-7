package studio7;

public class Rectangle {

	private int length;
	private int width;
	private double perimeter;
	private boolean square;
	private double area;
	
	public Rectangle (int initLength, int initWidth) {
		this.length = initLength;
		this.width = initWidth;
		this.perimeter = 2*initLength + 2*initWidth;
		this.area = initLength*initWidth;
		if (initLength == initWidth) {
			square = true;
		
		} else {
			square=false;
		}
	}

	public boolean Bigger(int length2, int width2) {
		double newArea = length2*width2;
		if (newArea > this.area) {
			return true;
		} else {
			return false;
		}
	}
}
