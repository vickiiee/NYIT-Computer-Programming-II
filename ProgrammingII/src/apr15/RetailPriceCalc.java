package apr15;

//Vicke Wu
//Apr15

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RetailPriceCalc extends JFrame{

	private JPanel panel;
	private JLabel messageLabel;
	private JTextField tf;
	private JButton calcButton;
	
	private int price;
	private Double markup;
	private JLabel percent;
	private JTextField p;
	
	public RetailPriceCalc() {
		setTitle("Retail Price Calculator");
		setSize(500,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}

	public static void main (String[] args) {
		
		new RetailPriceCalc();
		
		String name1;
	      String name2;

	      name1 = "Robb";
	      name2 = "Harry";

	      System.out.printf("%-8s/\n", name1);
	      System.out.printf("%-8s/\n", name2);
		
		
	}

	private void buildPanel() {
		messageLabel = new JLabel("Wholesale Price:");
		tf = new JTextField(10);
		
		 percent = new JLabel("Markup Percentage:");
		 p = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalculateButton());
		
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(tf);
		
		panel.add(percent);
		panel.add(p);
		panel.add(calcButton);
	}
	
	private class CalculateButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String h =tf.getText();
			price = Integer.parseInt(h);
			
			String s = p.getText();
			markup = Double.parseDouble(s);
			System.out.print(price+"\n");
			System.out.print(markup+"\n");
			
			Double total = price+price*(markup/100);
			System.out.print(total);
			JOptionPane.showMessageDialog(null, "Retail Price: $" + total);
		}

	}

	public JTextField getTf() {
		return tf;
	}

	public void setTf(JTextField tf) {
		this.tf = tf;
	}

	public JTextField getP() {
		return p;
	}

	public void setP(JTextField p) {
		this.p = p;
	}
}
