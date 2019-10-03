package mp1;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		setWidth(w);
	}
	
	public Rectangle() {
		length = 0;
		setWidth(0);
	}
	
	public double getlength() {
		return length;
	}
	
	public void setLength(double l) {
		l = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
		width = w;
	}
	
	public static String toString(double l, double w) {
		return("length: " + l + ", width: " + w);
				
	}
	
	public static boolean equal(double l, double w) {
		if (l )
				
	}
	
}
