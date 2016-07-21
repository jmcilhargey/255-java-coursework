// Assignment 9B
// Joe McIlhargey
// ComSc-255

import javax.swing.JOptionPane;

public class StudentExt extends Student {
	
	private String gradeType;

	public StudentExt(int i, String n, int [] ex, String g) {
		
		super(i, n, ex);
		gradeType = g;
	}
	public String findGrade() {
		
		String grade = super.findGrade();
		
		if (gradeType.equalsIgnoreCase("Credit")) {
			if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
				grade = "CR";
			} else {
				grade = "NCR";
			}
		}
		return grade;
	}
	public static void displayResult(String [] output) {
		
		String finalOut = "";
	
		for (int i = 0; i < output.length; i++) {
			finalOut += output[i];
		}
		JOptionPane.showMessageDialog(null, finalOut);
	}
}