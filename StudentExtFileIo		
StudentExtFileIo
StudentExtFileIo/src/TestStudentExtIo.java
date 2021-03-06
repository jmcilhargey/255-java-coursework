import java.io.*;
import java.util.StringTokenizer;

public class TestStudentExtIo {

	public static void main(String[] args) throws Exception {
		
		String input, name, gradeType;
		int studentCount, id, numExams;
		int [] scores;
		
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));

		PrintWriter pw = new PrintWriter(new FileWriter("out.txt"), false);
		
		input = br.readLine();
		studentCount = Integer.parseInt(input);
		
		StudentExt [] students = new StudentExt [studentCount];
		
		for (int i = 0; i < studentCount; i++) {
			
			input = br.readLine();
			// Note, removed spaces from input file because tokenizer recognizes spaces in name when using ", " delimiter
			StringTokenizer studentData = new StringTokenizer(input, ",", false);
			
			id = Integer.parseInt(studentData.nextToken());
			name = studentData.nextToken();
			numExams = Integer.parseInt(studentData.nextToken());
			
			scores = new int [numExams];
			
			for (int j = 0; j < numExams; j++) {
				scores[j] = Integer.parseInt(studentData.nextToken());
			}
			gradeType = studentData.nextToken();
			
			students[i] = new StudentExt(id, name, scores, gradeType);			
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
		
		for (int i = 0; i < output.length; i++) {
			pw.write(output[i]);
			pw.flush();
		}
		
		if (br != null) {
			br.close();
		}
		if (pw != null) {
			pw.close();
		}
	}
}
