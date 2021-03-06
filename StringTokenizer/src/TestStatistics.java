import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;

public class TestStatistics {

	public static void main(String[] args) {
		
		String input, output = "";
		
		input = JOptionPane.showInputDialog("Enter data separated by a comma and space");
		
		StringTokenizer inputString = new StringTokenizer(input, ", ", false);
		
		int dataSize = inputString.countTokens();
		
		double [] userData = new double [dataSize];
		int i = 0;
		
		while (inputString.hasMoreTokens() && i < userData.length) {
			userData[i] = Double.parseDouble(inputString.nextToken());
			i++;
		}
		
		if (i < userData.length) {
			JOptionPane.showMessageDialog(null, "Error: Insufficient values provided");
			System.exit(0);
		}
		Statistics stats = new Statistics(userData);
		
		double [] enteredData = stats.getUserData();
		double [] sortedData = stats.getSortedData();
		
		double min = stats.findMin();
		double max = stats.findMax();
		double mean = stats.findMean();
		double median = stats.findMedian();
		
		DecimalFormat deci = new DecimalFormat(".000");
		
		output += "Original Data:\n";
		for (i = 0; i < enteredData.length; i++) {
			output += enteredData[i] + " ";
		}
		output += "\nSorted Data:\n";
		for (i = 0; i < sortedData.length; i++) {
			output += sortedData[i] + " ";
		}
		output += "\nMin Value:\t" + deci.format(min);
		output += "\nMax Value:\t" + deci.format(max);
		output += "\nMean:\t" + deci.format(mean);
		output += "\nMedian:\t" + deci.format(median);
		
		JOptionPane.showMessageDialog(null, output);
	}

}
