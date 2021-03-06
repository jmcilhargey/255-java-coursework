// Assignment 6
// Joe McIlhargey
// ComSc-255

import java.util.*;

public class Statistics {

	private double [] userData;
	private double [] sortedData;
	
	public static int count = 0;
	
	public static double [] computeSortedData(double [] data) {
		Arrays.sort(data);
		return data;
	}
	
	public static double computeMin(double [] data) {
		double min = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}

	public static double computeMax(double [] data) {
		double max = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;		
	}

	public static double computeMean(double [] data) {
		double sum = 0;
		
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;		
	}
	
	public static double computeMedian(double [] data) {
		Arrays.sort(data);
		if (data.length % 2 == 0) {
			return (data[(data.length / 2)] + data[(data.length / 2 - 1)]) / 2;
		} else {
			return data[(data.length / 2)];
		}		
	}
	
	public Statistics(double [] d) {
		
		userData = new double [d.length];
		
		System.arraycopy(d, 0, userData, 0, d.length);
		
		sortedData = new double [d.length];
		System.arraycopy(d, 0, sortedData, 0, d.length);
		Arrays.sort(sortedData);
		
		count++;
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
