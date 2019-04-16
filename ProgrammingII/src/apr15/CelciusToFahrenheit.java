package apr15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//VIckie WU
//April 15 2019

public class CelciusToFahrenheit extends JFrame {

	public CelciusToFahrenheit() {
		setTitle("Celcius to Fahrenheit");
		setSize(500,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField tf;
	private JButton calcButton;
	

	private Double degree;

	private JTextField p;
	

	public static void main (String[] args) {
		
		new CelciusToFahrenheit();

		
		
	}

	private void buildPanel() {
		messageLabel = new JLabel("Celcius: Enter a degree");
		tf = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalculateButton());
		
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(tf);

		panel.add(calcButton);
	}
	
	private class CalculateButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(tf.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number!");
			}else {
				degree = Double.parseDouble(tf.getText());
			}
			
			//F = 9/5 c +32
			degree = degree*9/5+32;
			//Works: 100C --> 212F
			/*
			 * 20C --> 68F
			 */
			JOptionPane.showMessageDialog(null, "Fahrenheit: " + degree);
		}

	}
}

