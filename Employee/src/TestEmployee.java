import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		
		String input, name;
		double salary, pctBonus, travelExpense, bonus;
		int workers, managers, executives, optionsCount;
		
		input = JOptionPane.showInputDialog("Enter the number of workers: ");
		workers = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the number of managers: ");
		managers = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter the number of executives: ");
		executives = Integer.parseInt(input);
		
		Employee employees[] = new Employee [workers + managers + executives];
		
		int count = 0;
		StringTokenizer employeeData;
		for (int i = 0; i < workers; i++) {
			
			input = JOptionPane.showInputDialog("Enter the worker name, salary, and percent bonus: ");

			employeeData = new StringTokenizer(input, ",", false);
			
			while (employeeData.hasMoreTokens()) {
				
				name = employeeData.nextToken();
				salary = Double.parseDouble(employeeData.nextToken());
				pctBonus = Double.parseDouble(employeeData.nextToken());
				
				employees[count++] = new Worker(name, salary, pctBonus);
			}
		}
		
		for (int i = 0; i < managers; i++) {
			
			input = JOptionPane.showInputDialog("Enter the worker name, salary, percent bonus, and travel expense: ");

			employeeData = new StringTokenizer(input, ",", false);
			
			while (employeeData.hasMoreTokens()) {
				
				name = employeeData.nextToken();
				salary = Double.parseDouble(employeeData.nextToken());
				pctBonus = Double.parseDouble(employeeData.nextToken());
				travelExpense = Double.parseDouble(employeeData.nextToken());
				
				employees[count++] = new Manager(name, salary, pctBonus, travelExpense);
			}	
		}
		
		for (int i = 0; i < executives; i++) {
			
			input = JOptionPane.showInputDialog("Enter the worker name, salary, percent bonus, travel expense, and executive options: ");

			employeeData = new StringTokenizer(input, ",", false);
			
			while (employeeData.hasMoreTokens()) {
				
				name = employeeData.nextToken();
				salary = Double.parseDouble(employeeData.nextToken());
				pctBonus = Double.parseDouble(employeeData.nextToken());
				travelExpense = Double.parseDouble(employeeData.nextToken());
				optionsCount = Integer.parseInt(employeeData.nextToken());
				
				employees[count++] = new Executive(name, salary, pctBonus, travelExpense, optionsCount);
			}
		}
		
		String output, workerOut = "", managerOut = "", executiveOut = "";
		
		for (int i = 0; i < employees.length; i++) {
			
			name = employees[i].getName();
			salary = employees[i].getSalary();
			bonus = employees[i].computeBonus();
			
			if (employees[i] instanceof Worker) {
				pctBonus = ((Worker)employees[i]).getPctBonus();
				workerOut += "Name: " + name + "\nSalary: $" + salary + "\n"; 
				workerOut += "Percent Bonus: " + pctBonus + "\nTotal Bonus: " + bonus + "\n\n";
			}
			
			if (employees[i] instanceof Manager) {
				pctBonus = ((Manager)employees[i]).getPctBonus();
				travelExpense = ((Manager)employees[i]).getTravelExpense();
				managerOut += "Name: " + name + "\nSalary: $" + salary + "\n"; 
				managerOut += "Percent Bonus: " + pctBonus + "\nTotal Bonus: " + bonus + "\n\n";
				managerOut += "Travel Expense: " + travelExpense + "\n";
			}
			
			if (employees[i] instanceof Executive) {
				pctBonus = ((Executive)employees[i]).getPctBonus();
				travelExpense = ((Executive)employees[i]).getTravelExpense();
				optionsCount = ((Executive)employees[i]).getOptionsCount();
				executiveOut += "Name: " + name + "\nSalary: $" + salary + "\n"; 
				executiveOut += "Percent Bonus: " + pctBonus + "\nTotal Bonus: " + bonus + "\n";
				executiveOut += "Travel Expense: " + travelExpense + "\nOptions Count: " + optionsCount + "\n\n";
			}
			output = workerOut + managerOut + executiveOut;
			JOptionPane.showMessageDialog(null, output);
		}
	}
}
