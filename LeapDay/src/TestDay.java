import javax.swing.JOptionPane;

public class TestDay {

	public static void main(String[] args) {
		
		String input, output;
		int day, month, year;
		
		input = JOptionPane.showInputDialog("Enter the day of the month: ");
		day = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the month number: ");
		month = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the year: ");
		year = Integer.parseInt(input);
		
		LeapDay date = new LeapDay(day, month, year);
		
		output = "Day number for " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear() + " is " + date.findDayNum();

		JOptionPane.showMessageDialog(null, output);
	}

}
