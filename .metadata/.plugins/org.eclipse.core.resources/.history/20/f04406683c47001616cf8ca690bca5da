import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		
		String input, output = "";
		int dataSize;
		
		input = JOptionPane.showInputDialog("Enter the number of data points");
		dataSize = Integer.parseInt(input);
		
		double [] userData = new double [dataSize];
		
		for (int i = 0; i < dataSize; i++) {
			input = JOptionPane.showInputDialog("Enter a data value for point #" + (i + 1));
			userData[i] = Double.parseDouble(input);
		}
		Statistics stats = new Statistics(userData);
		
		double [] enteredData = stats.getUserData();
		double [] sortedData = stats.getSortedData();
		
		double min = stats.findMin();
		double max = stats.findMax();
		double mean = stats.findMean();
		double median = stats.findMedian();
		
		output += "Original Data:\n";
		for (int i = 0; i < enteredData.length; i++) {
			output += enteredData[i] + " ";
		}
		output += "\nSorted Data:\n";
		for (int i = 0; i < sortedData.length; i++) {
			output += sortedData[i] + " ";
		}
		output += "\nMin Value:\t" + min;
		output += "\nMax Value:\t" + max;
		output += "\nMean:\t" + mean;
		output += "\nMedian:\t" + median;
		
		JOptionPane.showMessageDialog(null, output);
	}

}
