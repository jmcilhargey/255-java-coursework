import javax.swing.*;
import java.util.*;

public class TestStringTokenizer {

	public static void main(String[] args) {
		String input, token;
		
		double d;
		input = JOptionPane.showInputDialog("Enter data separated by a comma and space");
		
		StringTokenizer inputString = new StringTokenizer(input, ", ", false);
		while (inputString.hasMoreTokens()) {
			token = inputString.nextToken();
			
			JOptionPane.showMessageDialog(null, token);
			d = Double.parseDouble(token);
		}
		
	}

}
