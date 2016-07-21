// Assignment 3
// Joe McIlhargey
// ComSc-255

import javax.swing.*;

public class TestRectangle {
	
	public static void main(String[] args) {
		
		double length, width;
		String input;
		String output = "";
		
		for (int i = 1; i <= 2; i++) {
			
			input = JOptionPane.showInputDialog("Enter the length: ");
			length = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog("Enter the width: ");
			width = Double.parseDouble(input);
			
			Rectangle rect = new Rectangle(length, width);
			
			output += "Values for rectangle " + i + ":\n";
			output += "Length: " + rect.getLength() + "\n";
			output += "Width: " + rect.getWidth() + "\n";
			output += "Perimeter: " + rect.getPerimeter() + "\n";
			output += "Area: " + rect.getArea() + "\n\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}