import javax.swing.JOptionPane;

// Assignment 3
// Joe McIlhargey
// ComSc-255

public class Rectangle implements Status {
	
	private double length, width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	
	public String getStatus() {
		
		String status = "";
		
		status += "Rectangle\n";
		status += "Length=" + length + "," + "Width=" + width + "\n";
		
		return status;
	}
	
	public void displayStatus() {
		JOptionPane.showMessageDialog(null, getStatus());
	}
}
