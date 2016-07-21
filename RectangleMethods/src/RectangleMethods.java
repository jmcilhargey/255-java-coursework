// Assignment 2
// Joe McIlhargey
// ComSc-255

import javax.swing.*;

public class RectangleMethods {

	public static double computeArea(double length, double width) {
		return length * width;
	}
	public static double computePerim(double length, double width) {
		return 2 * (length + width);
	}
	
	public static void main(String[] args) {
		
		String input, output;
		double length, width;
		
		input = JOptionPane.showInputDialog("Enter the length: ");
		length = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the wi dth: ");
		width = Double.parseDouble(input);
		
		output = "Values for rectangle :\n";
		output += "Length: " + length + "\n";
		output += "Width: " + width + "\n";
		output += "Perimeter: " + computePerim(length, width) + "\n";
		output += "Area: " + computeArea(length, width) + "\n";
		
		JOptionPane.showMessageDialog(null, output);
	}
}
