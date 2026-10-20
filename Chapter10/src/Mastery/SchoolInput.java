/*
 
Program: SchoolInput.java      	Last Date of this Revision: October, 08, 2026
 
Purpose: An application that creates a GUI where the user can use text fields and combo-boxes to enter 
			information about themselves such as school, name, grade. And the prints out a summarized
		 	version of info inputed and spits out an image associated with their inputed school.
		 	
*/

package Mastery; //defines the package that this class belongs to

import java.awt.EventQueue; //imports EventQueue to safely run the GUI

import javax.swing.JFrame; //imports JFrame to create the main window
import javax.swing.JPanel; //imports JPanel to hold GUI components
import java.awt.BorderLayout; //imports BorderLayout for arranging components
import javax.swing.JTextField; //imports JTextField for text input
import javax.swing.JComboBox; //imports JComboBox for drop-down menus
import javax.swing.JLabel; //imports JLabel for displaying text and images
import javax.swing.DefaultComboBoxModel; //imports the model used to store combo box choices
import javax.swing.ImageIcon; //imports ImageIcon so images can be displayed
import javax.swing.JButton; //imports JButton to create a click-able button
import java.awt.event.ActionListener; //imports ActionListener for button events
import java.awt.event.ActionEvent; //imports ActionEvent for event information
import java.awt.event.KeyAdapter; //imports KeyAdapter to detect keyboard input
import java.awt.event.KeyEvent; //imports KeyEvent for keyboard events
import java.awt.Font; //imports Font to change the appearance of text

public class SchoolInput { //creates the SchoolInput class

	private JFrame frame; //stores the main window of the program
	private JTextField fName; //stores the first name text field
	private JTextField lName; //stores the last name text field

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //main method where the program starts
		EventQueue.invokeLater(new Runnable() { //runs the GUI safely using the EventQueue
			public void run() { //contains the code that starts the window
				try { //attempts to run the application
					SchoolInput window = new SchoolInput(); //creates a SchoolInput object
					window.frame.setVisible(true); //makes the application window visible
				} catch (Exception e) { //runs if an error occurs
					e.printStackTrace(); //prints the error information
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SchoolInput() { //constructor for the SchoolInput class
		initialize(); //calls the method that creates the GUI
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //creates and sets up all GUI components
		frame = new JFrame(); //creates the main application window
		frame.setBounds(100, 100, 662, 551); //sets window bounds
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window is closed
		
		JPanel panel = new JPanel(); //creates a panel to hold the GUI components
		frame.getContentPane().add(panel, BorderLayout.CENTER); //adds the panel to the center of the window
		panel.setLayout(null); //allows components to be positioned manually
		
		ImageIcon aberhart = new ImageIcon("../Chapter10/src/Mastery/Aberhart.jpg"); //loads aberhart logo
		ImageIcon crescent = new ImageIcon("../Chapter10/src/Mastery/crescent.jpg");  //loads crescent logo
		ImageIcon fowler = new ImageIcon("../Chapter10/src/Mastery/fowler.png");  //loads fowler logo
		ImageIcon memorial = new ImageIcon("../Chapter10/src/Mastery/memorial.png"); //loads central logo
		ImageIcon northtrail = new ImageIcon("../Chapter10/src/Mastery/north trail.png"); //loads north trail logo
		ImageIcon pearson = new ImageIcon("../Chapter10/src/Mastery/pearson.png"); //loads pearson logo
		ImageIcon western = new ImageIcon("../Chapter10/src/Mastery/Western.png"); //loads western logo
			
		fName = new JTextField(); //creates the text field for the user's first name
		fName.addKeyListener(new KeyAdapter() {  //adds a keyboard listener to the first name field
			@Override
			public void keyTyped(KeyEvent e) { //runs whenever the user types a key
				if(fName.getText().equals("First name: ")) //checks if the default text is still there
				{
					fName.setText(""); //removes the default text when the user starts typing
				}
			}
		});
		
	
		if(fName.getText().equals("First name: ")) //checks if the first name field contains the placeholder
		{
			fName.setText("First name "); //changes the text if the condition is true
		}
			
		fName.setText("First name: "); //sets the starting text in the first name field
		fName.setColumns(10); //sets the preferred number of columns for the text field
		fName.setBounds(44, 43, 173, 34); //sets bounds for text field
		panel.add(fName); //adds the first name field to the panel
			
			
		lName = new JTextField(); //creates the text field for the user's last name
		lName.addKeyListener(new KeyAdapter() { //adds a keyboard listener to the last name field
			@Override
			public void keyTyped(KeyEvent e) { //runs whenever the user types a key
				if (lName.getText().equals("Last name: ")) //checks if the default text is still there
				{
					lName.setText(""); //removes the default text when the user starts typing
				}
			}
		});
		
		if(lName.getText().equals("Last name: ")) //checks if the last name field contains the placeholder
		{
			lName.setText("Last name "); //changes the text if the condition is true
		}
		
		lName.setText("Last name: "); //sets the starting text in the last name field
		lName.setColumns(10); //sets the preferred number of columns for the text field
		lName.setBounds(281, 43, 180, 34); //sets bounds for text field
		panel.add(lName); //adds the last name field to the panel
		
		
		JComboBox Grade = new JComboBox(); //creates a drop-down menu for choosing a grade
		Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade:" , "10" , "11" , "12"})); //adds grades 10,11,12 to the menu
		Grade.setBounds(44, 105, 173, 34); //sets the bounds for menu
		panel.add(Grade); //adds the grade menu to the panel
		
	
		
		JComboBox School = new JComboBox(); //creates a drop-down menu for choosing a school
		School.setModel(new DefaultComboBoxModel(new String[] {"Click on your school:" , "Crescent Heights" , "James Fowler" , 
				"Aberhart" , "Western" , "Lester B. Pearson" , "North Trail" , "Central Memorial"})); //adds a list of schools to the menu including default option
		School.setBounds(281, 105, 180, 34); //sets the bounds for menu
		panel.add(School); //adds the school menu to the panel
		
	
		
		JLabel output = new JLabel(""); //creates an empty label for displaying the user's info
		output.setFont(new Font("Tahoma", Font.PLAIN, 14)); //sets the font and size of output text
		output.setBounds(20, 169, 433, 90); //sets bounds for output label
		panel.add(output); //adds the output label to the panel
		
		JLabel logo = new JLabel(""); //creates a empty label that will display a school logo
		logo.setBounds(130, 249, 373, 240); //sets bounds for label
		panel.add(logo); //adds the logo label to the panel
		
		JButton submit = new JButton("Submit!"); //creates the submit button
		submit.addActionListener(new ActionListener() { //adds an event listener to the submit button
			public void actionPerformed(ActionEvent e) { //runs when the submit button is clicked
				
				String fN = fName.getText(); //gets the first name entered by the user
				String lN = lName.getText(); //gets the last name entered by the user
				String grade = String.valueOf(Grade.getSelectedItem()); //gets the grade selected by the user
				String school = String.valueOf(School.getSelectedItem()); //gets the school selected by the user
				
				output.setText(fN + " " + lN + " is in grade: " + grade + " and goes to " + school + " high school."  ); //displays the user's name, grade, and school in the output label
			
				//creates a if-statment to check which school was picked and what logo goes along with that school
				
				if(school.equals("Crescent Heights")) //checks if Crescent Heights was selected
				{
					logo.setIcon(crescent); //displays the crescent logo
				}
				if(school.equals("James Fowler")) //checks if Fowler was selected
				{
					logo.setIcon(fowler); //displays the fowler logo
				}
				if(school.equals("Aberhart")) //checks if aberhart was selected
				{
					logo.setIcon(aberhart); //displays the aberhart logo
				}
				if(school.equals("Western")) //checks if western was selected
				{
					logo.setIcon(western); //displays the western logo
				}
				if(school.equals("Lester B. Pearson")) //checks if pearson was selected
				{
					logo.setIcon(pearson); //displays the pearson logo
				}
				if(school.equals("North Trail")) //checks if north trail was selected
				{
					logo.setIcon(northtrail); //displays the north trail logo
				}
				if(school.equals("Central Memorial")) //checks if central memorial was selected
				{
					logo.setIcon(memorial); //displays the central logo
				}
				
			}
		});
		submit.setBounds(506, 31, 106, 183); //sets the bounds of the submit button
		panel.add(submit); //adds the submit button to the panel
	}
}
