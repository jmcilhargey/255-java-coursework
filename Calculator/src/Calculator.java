import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Calculator() {
		
		JPanel keys = new JPanel();
		keys.setLayout(new GridLayout(3, 4));
		
		for (int i = 1; i <= 9; i++) {
			keys.add(new JButton(Integer.toString(i)));
		}
		keys.add(new JButton("0"));
		
		JPanel display = new JPanel(new BorderLayout());
		display.add(new JTextField("Results"), BorderLayout.NORTH);
		display.add(keys, BorderLayout.CENTER);
	}
	
	public static void main (String [] args) {
			
			Calculator frame = new Calculator();
			frame.setTitle("Calculator");
			frame.setSize(350, 500);
			
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
					
	}
}