
public class Worker extends Employee {

	private double pctBonus;
	
	Worker(String n, double s, double p) {
		super(n, s);
		pctBonus = p;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double computeBonus() {
		return getSalary() * pctBonus;
	}
}
