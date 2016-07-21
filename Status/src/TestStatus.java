import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestStatus {
	
	public static void main(String[] args) {
		
		Status refs[] = new Status [6];
		
		String input, name, output = "";
		int age, weight, id, numExams;
		double length, width;
		int scores [];

		input = JOptionPane.showInputDialog("Enter the length for the first rectangle: ");
		length = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the width for the first rectangle: ");
		width = Double.parseDouble(input);

		refs[0] = new Rectangle(length, width);
		
		input = JOptionPane.showInputDialog("Enter the length for the second rectangle: ");
		length = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the width for the second rectangle: ");
		width = Double.parseDouble(input);

		refs[1] = new Rectangle(length, width);
		
		input = JOptionPane.showInputDialog("Enter the length for the third rectangle: ");
		length = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter the width for the third rectangle: ");
		width = Double.parseDouble(input);

		refs[2] = new Rectangle(length, width);
		
		name = JOptionPane.showInputDialog("Enter the name of the first sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the first sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the first sibling: ");
		weight = Integer.parseInt(input);
		
		refs[3] = new Sibling(name, age, weight);
		
		name = JOptionPane.showInputDialog("Enter the name of the second sibling: ");
		
		input = JOptionPane.showInputDialog("Enter the age of the second sibling: ");
		age = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the weight of the second sibling: ");
		weight = Integer.parseInt(input);
		
		refs[4] = new Sibling(name, age, weight);

		input = JOptionPane.showInputDialog("Enter the data for a student: \nFormat: id, name, # of exams, exam scores");
		
		StringTokenizer studentList = new StringTokenizer(input, ",", false);
		
		while (studentList.hasMoreTokens()) {
			
			id = Integer.parseInt(studentList.nextToken());
			name = studentList.nextToken();
			numExams = Integer.parseInt(studentList.nextToken());
			
			scores = new int [numExams];
			
			for (int j = 0; j < numExams; j++) {
				scores[j] = Integer.parseInt(studentList.nextToken());
			}
			refs[5] = new Student(id, name, scores);
		}
		
		for (int i = 0; i < refs.length; i++) {
			refs[i].displayStatus();
		}
		
		for (int i = 0; i < refs.length; i++) {
			output += refs[i].getStatus();
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
}
