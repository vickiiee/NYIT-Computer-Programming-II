package apr15;

//Vickie Wu
//Apr 15 2019

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoeAutomotive extends JFrame{

	private JRadioButton oil;
	private JRadioButton lube;
	private JRadioButton radiator;
	private JRadioButton trans;
	private JRadioButton inspection;
	private JRadioButton muffler;
	private JRadioButton tire;
	
	private JLabel spare;
	private JLabel hours;
	
	private JTextField inputParts;
	private JTextField inputHours;
	
	private JPanel panel;
	
	private JButton calc;
	
	private double total;
	
	
	public static void main(String[] args)
	   {
	      new JoeAutomotive();
	   }
	
	public JoeAutomotive() {
		total = 0;
		 // Set the window title.
	      setTitle("Joe's Automotive");

	      // Set the size of the window.
	      setSize(800, 250);

	      // Specify what happens when the close button is clicked.
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      // Build the panel and add it to the frame.
	      buildPanel();

	      // Add the panel to the frame's content pane.
	      add(panel);

	      // Display the window.
	      setVisible(true);
	}

	public void buildPanel() {
		
		//setLayout(new GridLayout(12,1));
		
	
		
		oil = new JRadioButton("Oil Change");
		lube = new JRadioButton("Lube Job");
		radiator = new JRadioButton("Radiator FLush");
		trans = new JRadioButton("Transmission FLush");
		inspection = new JRadioButton("Inspection");
		muffler = new JRadioButton("Muffler Replacement");
		tire = new JRadioButton("Tire Rotation");
		
		spare = new JLabel("Spare Parts:");
		hours = new JLabel("# of Hours:");
		
		inputParts = new JTextField(10);
		inputHours = new JTextField(10);
		
		calc = new JButton("Calculate");
		calc.addActionListener(new Total());

		panel = new JPanel();

	      // Add the label, text field, and button
	      // components to the panel.
	      panel.add(oil);
	      panel.add(lube);
	      panel.add(radiator);
	      panel.add(trans);
	      panel.add(inspection);
	      panel.add(muffler);
	      panel.add(tire);
	      
	      panel.add(spare);
	      panel.add(inputParts);
	      
	      panel.add(hours);
	      panel.add(inputHours);
	      
	      panel.add(calc);
		
	}
	
	private class Total implements ActionListener {

		private int hr;
		private int pt;

		@Override
		public void actionPerformed(ActionEvent arg0) {
		      
		      if(oil.isSelected()) {
		    	  total+=26;
		      }
		      if(lube.isSelected()) {
		    	  total+=18;
		      }
		      if(radiator.isSelected()) {
		    	  total+=30;
		      }
		      if(trans.isSelected()) {
		    	  total+=80;
		      }
		      if(inspection.isSelected()) {
		    	  total+=15;
		      }
		      if(muffler.isSelected()) {
		    	  total+=100;
		      }
		      if(tire.isSelected()) {
		    	  total+=20;
		      }
		      
		      if(!inputHours.getText().isEmpty()){
		    	   hr = Integer.parseInt(inputHours.getText());
		    	   total+= (hr*20);
		      }
		      if(!inputHours.getText().isEmpty()){
		    	  System.out.println(inputParts.getText());
		    	   pt = Integer.parseInt(inputParts.getText());
		    	   total+= pt;
		      }
		      
		      
		     // total+= (hr*20);
			JOptionPane.showMessageDialog(null, "Total: $" + total);
		}

	}

}
