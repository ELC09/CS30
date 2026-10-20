package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;

public class semesterAvg {

	private JFrame frame;
	private JLabel display;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semesterAvg window = new semesterAvg();
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
	public semesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		gr1 = new JTextField();
		gr1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(gr1.getText().equals("Enter the first grade: "))
				{
					gr1.setText("");
				}
			}
		});
		gr1.setText("Enter the first grade: ");
		gr1.setBounds(22, 11, 144, 67);
		frame.getContentPane().add(gr1);
		gr1.setColumns(10);
		
		gr2 = new JTextField();
		gr2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(gr2.getText().equals("Enter the second grade: "))
				{
					gr2.setText("");
				}
			}
		});
		gr2.setText("Enter the second grade: ");
		gr2.setColumns(10);
		gr2.setBounds(22, 89, 144, 67);
		frame.getContentPane().add(gr2);
		
		gr3 = new JTextField();
		gr3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(gr3.getText().equals("Enter the third grade: "))
				{
					gr3.setText("");
				}
			}
		});
		gr3.setText("Enter the third grade: ");
		gr3.setColumns(10);
		gr3.setBounds(22, 168, 144, 67);
		frame.getContentPane().add(gr3);
		
		
		
		JLabel display2 = new JLabel("");
		display2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		display2.setBounds(22, 269, 241, 59);
		frame.getContentPane().add(display2);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fGr = gr1.getText();
				String sGr = gr2.getText();
				String tGr = gr3.getText();
				
				double FGr = Double.parseDouble(fGr);
				double SGr = Double.parseDouble(sGr);
				double TGr = Double.parseDouble(tGr);
				
				double avgGrade = (FGr + SGr + TGr)/3;
				
				DecimalFormat dc = new DecimalFormat("0.0");
			
				
				
				display2.setText("Your semester average is: " + dc.format(avgGrade));
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(208, 11, 112, 224);
		frame.getContentPane().add(btnNewButton);
		
		
	}
	 public void actionPerformed(ActionEvent event) {
		 String eventName = event.getActionCommand();
		 
		 if (eventName.equals("Average")) {
		 double avgGrade;
		 String g1 = gr1.getText();
		 String g2 = gr2.getText();
		 String g3 = gr3.getText();
		 
		 avgGrade = (Double.parseDouble(g1) + Double.parseDouble(g2)
		 + Double.parseDouble(g3))/3;
		 display.setText(Double.toString(avgGrade));
		 }
}
	 private static void runGUI() {
		 JFrame.setDefaultLookAndFeelDecorated(true);
		 
		 semesterAvg myGrades = new semesterAvg();
		 
	 }
}
