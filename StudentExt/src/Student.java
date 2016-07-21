
public class Student {
	
	private int id;
	private String name;
	private int [] exams;
	
	public Student(int i, String n, int [] ex) {
		id = i;
		name = n;
		exams = new int [ex.length];
		
		System.arraycopy(ex, 0, exams, 0, ex.length);
	}
	
	public String findGrade() {
		String grade;
		int points = 0;
		for (int i = 0; i < exams.length; i++) {
			points += exams[i];
			// JOptionPane.showMessageDialog(null, exams[i]);
		}
		
		int avg = points / exams.length;

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static String getOutput(int id, String name, String grade) {
		return id + " " + name + "(" + grade + ")\n";
	}
}
