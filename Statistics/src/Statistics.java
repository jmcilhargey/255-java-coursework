import java.util.*;

public class Statistics {

	private double [] userData;
	private double [] sortedData;
	
	public Statistics(double [] d) {
		// Create empty array of d's length
		userData = new double [d.length];
		// Copy contents into new array
		System.arraycopy(d, 0, userData, 0, d.length);
		// Make array for the sorted data
		sortedData = new double [d.length];
		System.arraycopy(d, 0, sortedData, 0, d.length);
		Arrays.sort(sortedData);
	}
	
	public double [] getUserData() {
		double [] temp = new double [userData.length];
		System.arraycopy(userData, 0, temp, 0, userData.length);
		return temp;
	}
	
	public double [] getSortedData() {
		double [] temp = new double [sortedData.length];
		System.arraycopy(sortedData, 0, temp, 0, sortedData.length);
		return temp;
	}
	
	public double findMin() {
		return sortedData[0];
	}
	
	public double findMax() {
		return sortedData[sortedData.length - 1];
	}
	
	public double findMean() {
		double sum = 0;
		
		for (int i = 0; i < sortedData.length; i++) {
			sum += userData[i];
		}
		return sum / sortedData.length;
	}
	
	public double findMedian() {
		
		if (sortedData.length % 2 == 0) {
			return ((double)sortedData[(int)(sortedData.length / 2)] + sortedData[(int)(sortedData.length / 2 - 1)]) / 2;
		} else {
			return (double)sortedData[(int)(sortedData.length / 2)];
		}
		
	}
	
}
