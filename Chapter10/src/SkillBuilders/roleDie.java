package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class roleDie {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roleDie window = new roleDie();
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
	public roleDie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 433, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel dieFace = new JLabel("");
		dieFace.setBounds(94, 90, 164, 142);
		panel.add(dieFace);
		
		JLabel dieFace2 = new JLabel("");
		dieFace2.setBounds(253, 90, 164, 142);
		panel.add(dieFace2);
		
		JButton role = new JButton("Roll Die");
		role.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int newRoll, newRoll2;
				
				newRoll = (int)(6 * Math.random() + 1);
				
				if(newRoll == 1)
				{
					dieFace.setIcon(die1);
				}
				else if(newRoll == 2)
				{
					dieFace.setIcon(die2);
				}
				else if(newRoll == 3)
				{
					dieFace.setIcon(die3);
				}
				else if(newRoll == 4)
				{
					dieFace.setIcon(die4);
				}
				else if(newRoll == 5)
				{
					dieFace.setIcon(die5);
				}
				else if(newRoll == 6)
				{
					dieFace.setIcon(die6);
				}
				
				
				newRoll2 = (int)(6 * Math.random() + 1);
				
				if(newRoll2 == 1)
				{
					dieFace2.setIcon(die1);
				}
				else if(newRoll2 == 2)
				{
					dieFace2.setIcon(die2);
				}
				else if(newRoll2 == 3)
				{
					dieFace2.setIcon(die3);
				}
				else if(newRoll2 == 4)
				{
					dieFace2.setIcon(die4);
				}
				else if(newRoll2 == 5)
				{
					dieFace2.setIcon(die5);
				}
				else if(newRoll2 == 6)
				{
					dieFace2.setIcon(die6);
				}
				
				
				
				
				
				
				
			}
		});
		role.setFont(new Font("Tahoma", Font.PLAIN, 16));
		role.setBounds(135, 11, 141, 68);
		panel.add(role);
		
	
	}
}
