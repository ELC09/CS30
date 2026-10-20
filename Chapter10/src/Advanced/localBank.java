package Advanced;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class localBank {

	private JFrame frame;
	private JTextField accountNum;
	private JTextField amount;
	private JTextField fName;
	private JTextField lName;
	private JTextField bBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					localBank window = new localBank();
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
	public localBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox deposit = new JComboBox();
		deposit.setBounds(34, 43, 405, 22);
		panel.add(deposit);
		
		accountNum = new JTextField();
		accountNum.setBounds(30, 120, 350, 22);
		panel.add(accountNum);
		accountNum.setColumns(10);
		
		amount = new JTextField();
		amount.setBounds(30, 172, 350, 22);
		panel.add(amount);
		amount.setColumns(10);
		
		fName = new JTextField();
		fName.setBounds(34, 223, 405, 20);
		panel.add(fName);
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.setBounds(34, 329, 405, 20);
		panel.add(lName);
		lName.setColumns(10);
		
		bBalance = new JTextField();
		bBalance.setBounds(34, 383, 405, 20);
		panel.add(bBalance);
		bBalance.setColumns(10);
		
		JLabel select = new JLabel("Select an action:");
		select.setFont(new Font("Tahoma", Font.PLAIN, 15));
		select.setBounds(35, 26, 162, 14);
		panel.add(select);
		
		JLabel instruct = new JLabel("Complete the information in RED");
		instruct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		instruct.setBounds(30, 76, 245, 14);
		panel.add(instruct);
		
		JLabel Account = new JLabel("Account number:");
		Account.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Account.setBounds(30, 101, 177, 14);
		panel.add(Account);
		
		JLabel Amount = new JLabel("Amount of deposit/withdrawl:");
		Amount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Amount.setBounds(30, 153, 205, 14);
		panel.add(Amount);
		
		JLabel FName = new JLabel("First Name:");
		FName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FName.setBounds(30, 205, 105, 14);
		panel.add(FName);
		
		JLabel LName = new JLabel("Last Name:");
		LName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LName.setBounds(30, 254, 105, 14);
		panel.add(LName);
		
		JLabel BBalance = new JLabel("Beginning Balance:");
		BBalance.setBounds(34, 368, 163, 14);
		panel.add(BBalance);
		
		JLabel accountInfo = new JLabel("Account Info Displayed Here");
		accountInfo.setBounds(34, 421, 245, 14);
		panel.add(accountInfo);
		
		JButton btnProcessTransaction = new JButton("Process Transaction");
		btnProcessTransaction.setBounds(30, 438, 228, 23);
		panel.add(btnProcessTransaction);
	}
}
