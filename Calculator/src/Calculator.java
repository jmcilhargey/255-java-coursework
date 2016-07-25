// Assignment 13
// Joe McIlhargey
// ComSc-255

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {
	
	// Initialize these as class variables here so we can edit field values during our calculations
	private double total = 0;
	private String entered = "";
	private JTextField display = new JTextField(entered);
	// Create list to store numbers and operands as we go
	private ArrayList<String> numbers = new ArrayList<String>();
	private ArrayList<String> operands = new ArrayList<String>();
	// Adding default serial version id
	private static final long serialVersionUID = 1L;
	// Make a limit to how many decimals can be displayed
	private DecimalFormat dec = new DecimalFormat("0.########");

	public Calculator() {
		
		JPanel keys = new JPanel();
		keys.setBorder(BorderFactory.createEmptyBorder(20, 20, 15, 20));
		keys.setLayout(new GridLayout(6, 4));
		
		// Create and style buttons 1 - 9 and place into keys JPanel
		JButton btns1[] = new JButton [9];
		
		for (int i = 0; i < 9; i++) {
			btns1[i] = new JButton(Integer.toString(i + 1));
		}
		buttonBuilder(btns1, new LineBorder(Color.GRAY, 2), new Color(144, 202, 249), keys);
		
		// Make remaining buttons and put into array so we can make them in a loop
		JButton [] btns2 = { new JButton("0"), new JButton("."), new JButton("=") };
		buttonBuilder(btns2, new LineBorder(Color.GRAY, 2), new Color(144, 202, 249), keys);
		
		// Do the same for the operands buttons
		JButton [] btns3 = { new JButton("/"), new JButton("*"), new JButton("-"), new JButton("+"), new JButton("C"), new JButton("%") };
		buttonBuilder(btns3, new LineBorder(Color.GRAY, 2), new Color(128, 203, 196), keys);
		
		// Use the border layout so we can arrange the keys on bottom and display results on top
		JPanel body = new JPanel(new BorderLayout());
		body.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		
		// Style the display and make it so that it's not editable
		display.setFont(new Font("SanSerif", Font.BOLD, 24));
		display.setBorder(new LineBorder(Color.GRAY, 2));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);
		
		// Now adding the keys and display to our calculator body
		body.add(display, BorderLayout.NORTH);
		body.add(keys, BorderLayout.CENTER);
		add(body);
	}
	// A helper function to generate buttons so we don't need to repeat the code in our constructor
	public void buttonBuilder(JButton [] btns, LineBorder brd, Color clr, JPanel keys) {
		
		for (JButton btn : btns) {
			
			btn.setBorder(brd);
			btn.addActionListener(this);
			btn.setOpaque(true);
			btn.setBackground(clr);
			btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			keys.add(btn);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// This is an event handler for when a button is clicked to determine the process
		JButton clicked = (JButton) e.getSource();
		String operation = clicked.getText();
		
		// Clears out the array lists and resets display
		if (operation == "C") {
			
			entered = "";
			numbers.clear();
			operands.clear();

		} else if (operation == "=") {
			// Add whatever number is in the display to our numbers, uness it's blank or just a negative symbol
			if (entered.length() > 0 && !entered.equals("-")) {
				numbers.add(entered);
			}
			// If we have at least 1 stored number then start the total with that
			if (numbers.size() >= 1) {
				total = Double.parseDouble(numbers.get(0));
			}
			// If we have more than 1 number, then we can do our calculations
			if (numbers.size() >= 2) {
				int i = 1;
				
				for (String symbol : operands) {
					// JOptionPane.showMessageDialog(null, symbol);
					if (symbol.equals("*")) {
						total *= Double.parseDouble(numbers.get(i));
					} else if (symbol.equals("/")) {
						total /= Double.parseDouble(numbers.get(i));
					} else if (symbol.equals("+")) {
						total += Double.parseDouble(numbers.get(i));
					} else if (symbol.equals("-")) {
						total -= Double.parseDouble(numbers.get(i));
					}
					i++;
				}
			}
			// Set the display string to 2 digits using our format and clear out our lists 
			entered = dec.format(total);
			numbers.clear();
			operands.clear();
			
		} else if (operation == "/" || operation == "*" || operation == "+" || operation == "-") {
			// We can set a negative value for a input if the field is blank
			if (entered.length() == 0 && operation.equals("-")) {
				entered += "-";
	
			} else if (entered.length() > 0) {
				// Throw the number and the operand in our lists
				numbers.add(entered);
				operands.add(operation);
				entered = "";
			}
		// Check if a decimal has already been entered and if not, add one
		} else if (operation == ".") {

			if (entered.indexOf('.') == -1) {
				entered += operation;
			}	
		// Check if there's a number and if return the percent equivalent and format decimals	
		} else if (operation == "%") {
			
			if (entered.length() > 0) {
				entered = dec.format((Double.parseDouble(entered) / 100));
			}
		} else {
			// Append the number to our entry
			entered += operation;
		}
		// Update the display with the value
		display.setText(entered);
	}
	
	public static void main (String [] args) {
			// Code to initialize an instance of our calculator and display on the screen
			Calculator frame = new Calculator();
			frame.setTitle("Calculator");
			frame.setSize(300, 450);
			
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);			
	}
}