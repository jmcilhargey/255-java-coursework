import javax.swing.*;
import java.util.*;

public class TestStudent {
	
	
	public static void main(String[] args) {
		
		String input, name;
		int numStudents, id, numExams;
		int [] scores;
		
		input = JOptionPane.showInputDialog("Enter the number of students");
		numStudents = Integer.parseInt(input);
		
		Student [] students = new Student [numStudents];
		
		for (int i = 0; i < students.length; i++) {
			
			input = JOptionPane.showInputDialog("Enter the data for student #" + (i + 1) + "\nFormat: id, name, # of exams, exam scores");
			
			StringTokenizer studentList = new StringTokenizer(input, ",", false);
			
			while (studentList.hasMoreTokens()) {
				
				id = Integer.parseInt(studentList.nextToken());
				name = studentList.nextToken();
				numExams = Integer.parseInt(studentList.nextToken());
				
				scores = new int [numExams];
				
				for (int j = 0; j < numExams; j++) {
					scores[j] = Integer.parseInt(studentList.nextToken());
				}
				students[i] = new Student(id, name, scores);
			}
		}
		
		String output [] = { "", "", "", "", "" };
		for (int i = 0; i < students.length; i++) {
			String grade = students[i].findGrade();
			
			if (grade.equalsIgnoreCase("A")) {
				output[0] += Student.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equalsIgnoreCase("B")) {
				output[1] += Student.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equalsIgnoreCase("C")) {
				output[2] += Student.getOutput(students[i].getId(), students[i].getName(), grade);
			} else if (grade.equalsIgnoreCase("D")) {
				output[3] += Student.getOutput(students[i].getId(), students[i].getName(), grade);
			} else {
				output[4] += Student.getOutput(students[i].getId(), students[i].getName(), grade);
			}
		}
		String finalOut = "";
		for (int i = 0; i < output.length; i++) {
			finalOut += output[i];
		}
		JOptionPane.showMessageDialog(null, finalOut);
	}
}
