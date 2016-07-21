
public class Manager extends Employee {

	private double pctBonus;
	private double travelExpense;
	
	Manager(String n, double s, double p, double t) {
		super(n, s);
		pctBonus = p;
		travelExpense = t;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
	
	public double computeBonus() {
		return getSalary() * pctBonus + 500;
	}
}
