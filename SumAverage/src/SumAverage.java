// Assignment 1
// Joe McIlhargey
// ComSc-255

import javax.swing.*;

public class SumAverage {	

	public static void main(String[] args) {
		
		double n1, n2, n3, sum, avg;
		String input, output;
		
		input = JOptionPane.showInputDialog("Enter a number");
		n1 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter a number");
		n2 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter a number");
		n3 = Double.parseDouble(input);
		
		sum = n1 + n2 + n3;
		avg = sum / 3;
		
		output = "The sum of " + n1 + ", " + n2 + ", and " + n3 + " is: " + sum + "\n";
		output += "The average of " + n1 + ", " + n2 + ", and " + n3 + " is: " + avg;

		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	}
}
