
public class Executive extends Employee {

	private double pctBonus;
	private double travelExpense;
	private int optionsCount;
	
	Executive(String n, double s, double p, double t, int o) {
		super(n, s);
		pctBonus = p;
		travelExpense = t;
		optionsCount = o;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
	
	public int getOptionsCount() {
		return optionsCount;
	}
	
	public double computeBonus() {
		return getSalary() * pctBonus + 1000;
	}
}
