// Assignment 4
// Joe McIlhargey
// ComSc-255

import javax.swing.JOptionPane;

public class TestSibling {
	
	public static void main(String[] args) {
		
		Sibling sibling1, sibling2, sibling3;
		String input, output, name;
		int age, weight;
		
		name = JOptionPane.showInputDialog("Enter the name of the first sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the first sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the first sibling: ");
		weight = Integer.parseInt(input);
		
		sibling1 = new Sibling(name, age, weight);
		
		name = JOptionPane.showInputDialog("Enter the name of the second sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the second sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the second sibling: ");
		weight = Integer.parseInt(input);
		
		sibling2 = new Sibling(name, age, weight);
		
		name = JOptionPane.showInputDialog("Enter the name of the third sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the third sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the third sibling: ");
		weight = Integer.parseInt(input);
		
		sibling3 = new Sibling(name, age, weight);
		
		Sibling lightest, youngest;
		
		if (sibling1.getWeight() < sibling2.getWeight() && sibling1.getWeight() < sibling3.getWeight()) {
			lightest = sibling1;
		} else if (sibling2.getWeight() < sibling1.getWeight() && sibling2.getWeight() < sibling3.getWeight()) {
			lightest = sibling2;
		} else {
			lightest = sibling3;
		}
		
		if (sibling1.getAge() < sibling2.getAge() && sibling1.getAge() < sibling3.getAge()) {
			youngest = sibling1;
		} else if (sibling2.getAge() < sibling1.getAge() && sibling2.getAge() < sibling3.getAge()) {
			youngest = sibling2;
		} else {
			youngest = sibling3;
		}
		
		output = "The lightest sibling: " + lightest.getName() + "\t" + lightest.getAge() + "\t" + lightest.getWeight() + "\n";
		output += "The youngest sibling: " + youngest.getName() + "\t" + youngest.getAge() + "\t" + youngest.getWeight() + "\n";
		
		JOptionPane.showMessageDialog(null, output);
	}
}