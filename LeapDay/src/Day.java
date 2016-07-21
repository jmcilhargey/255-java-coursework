
public class Day {

	private int day;
	protected int month;
	private int [] table  = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
	
	public Day(int d, int m) {
		day = d;
		month = m;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int findDayNum() {
		return table[month - 1] + day;
	}
}
