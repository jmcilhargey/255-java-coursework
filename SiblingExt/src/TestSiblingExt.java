import javax.swing.JOptionPane;

public class TestSiblingExt {

	public static void main(String[] args) {
		
		SiblingExt sibling1, sibling2, sibling3;
		String input, output, name;
		int age, height, weight;
		
		name = JOptionPane.showInputDialog("Enter the name of the first sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the first sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the first sibling: ");
		weight = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the height of the first sibling: ");
		height = Integer.parseInt(input);
		
		sibling1 = new SiblingExt(name, age, weight, height);
		
		name = JOptionPane.showInputDialog("Enter the name of the second sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the second sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the second sibling: ");
		weight = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the height of the second sibling: ");
		height = Integer.parseInt(input);
		
		sibling2 = new SiblingExt(name, age, weight, height);
		
		name = JOptionPane.showInputDialog("Enter the name of the third sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the third sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the third sibling: ");
		weight = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the height of the third sibling: ");
		height = Integer.parseInt(input);
		
		sibling3 = new SiblingExt(name, age, weight, height);
		
		SiblingExt lightest, youngest, tallest;
		
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
		
		if (sibling1.getHeight() > sibling2.getHeight() && sibling1.getHeight() > sibling3.getHeight()) {
			tallest = sibling1;
		} else if (sibling2.getHeight() > sibling1.getHeight() && sibling2.getHeight() > sibling3.getHeight()) {
			tallest = sibling2;
		} else {
			tallest = sibling3;
		}
		
		output = "The lightest sibling: " + lightest.getName() + "\t" + lightest.getAge() + "\t" + lightest.getWeight() + "\t" + lightest.getHeight() + "\n";
		output += "The youngest sibling: " + youngest.getName() + "\t" + youngest.getAge() + "\t" + youngest.getWeight() + "\t" +  youngest.getHeight() + "\n";
		output += "The tallest sibling: " + tallest.getName() + "\t" + tallest.getAge() + "\t" + tallest.getWeight() + "\t" + tallest.getHeight() + "\n";
		
		JOptionPane.showMessageDialog(null, output);
	}
}
