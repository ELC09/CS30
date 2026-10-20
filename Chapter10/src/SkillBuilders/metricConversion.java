package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class metricConversion {

	private JFrame frame;
	private JTextField tF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricConversion window = new metricConversion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Panel = new JPanel();
		Panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(Panel);
		Panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(102, 11, 210, 62);
		Panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Click on your conversion type: " , "1 inch = 2.54 cm" , "1 foot = 0.3048 m" , "1 gallon = 4.5461" , "1 pound = 0.4536kg"}));
		
		JLabel display = new JLabel("");
		display.setFont(new Font("Tahoma", Font.PLAIN, 16));
		display.setBounds(55, 167, 312, 72);
		Panel.add(display);
		
		tF = new JTextField();
		tF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(tF.getText().equals("Enter your number here: "))
				{
					tF.setText(null);
				}
			}
		});
		tF.setText("Enter your number here: ");
		tF.setBounds(102, 95, 166, 61);
		Panel.add(tF);
		tF.setColumns(10);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(comboBox.getSelectedItem().equals("1 inch = 2.54 cm"))
				{
					String n = tF.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 2.54;
					
					display.setText(Num + " inches converted to cm is: " + answer + " cm");
				}
				
				if(comboBox.getSelectedItem().equals("1 foot = 0.3048 m"))
					{
						String n1 = tF.getText();
						double Num1 = Double.parseDouble(n1);
						double answer1 = Num1 * 0.3048;
						
						display.setText(Num1 + " feet converted to meters is: " + answer1 + " m");
					}
					
				if(comboBox.getSelectedItem().equals("1 gallon = 4.5461"))
					{
						String n2 = tF.getText();
						double Num2 = Double.parseDouble(n2);
						double answer2 = Num2 * 0.3048;
						
						display.setText(Num2 + " gallons converted to litres is: " + answer2 + " l");
					}
					
				if(comboBox.getSelectedItem().equals("1 pound = 0.4536kg"))
					{
						String n3 = tF.getText();
						double Num3 = Double.parseDouble(n3);
						double answer3 = Num3 * 0.4536;
						
						display.setText(Num3 + " pounds converted to kilogram is: " + answer3 + " kg");
					}
					
				
				
	}
		
});
}
	}
		
