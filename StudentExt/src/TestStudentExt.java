import java.util.StringTokenizer;

import javax.swing.*;

public class TestStudentExt {

	public static void main(String[] args) {
		
		String input, name, gradeType;
		int numStudents, id, numExams;
		int [] scores;
		
		input = JOptionPane.showInputDialog("Enter the number of students");
		numStudents = Integer.parseInt(input);
		
		StudentExt [] students = new StudentExt [numStudents];
		
		for (int i = 0; i < students.length; i++) {
			
			input = JOptionPane.showInputDialog("Enter the data for student #" + (i + 1) + "\nFormat: id, name, # of exams, exam scores, grade type");
			
			StringTokenizer studentList = new StringTokenizer(input, ",", false);
			
			while (studentList.hasMoreTokens()) {
				
				id = Integer.parseInt(studentList.nextToken());
				name = studentList.nextToken();
				numExams = Integer.parseInt(studentList.nextToken());
				
				scores = new int [numExams];
				
				for (int j = 0; j < numExams; j++) {
					scores[j] = Integer.parseInt(studentList.nextToken());
				}
				gradeType = studentList.nextToken();
				
				students[i] = new StudentExt(id, name, scores, gradeType);
			}
		}
		String output [] = { "", "", "", "", "", "", "" };
		
		for (int i = 0; i < students.length; i++) {
			String grade = students[i].findGrade();
			
			if (grade.equalsIgnoreCase("A")) {
				output[0] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equals("B")) {
				output[1] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equals("C")) {
				output[2] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equals("D")) {
				output[3] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equals("F")) {
				output[4] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equals("CR")) {
				output[5] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			} else {
				output[6] += StudentExt.getOutput(students[i].getId(), students[i].getName(), grade);
			}
		}
		StudentExt.displayResult(output);
	}
}