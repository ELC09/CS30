/*
 	 
Program: BreakAPlate.java      	Last Date of this Revision: October, 08, 2026
 
Purpose: An application that plays a carnival game called Break-A-Plate. This game will allow a player to try to break all 
			three plates. If all three plates are broken, a prize is awarded, otherwise, a consolation prize is awarded

 */

package Mastery; //tells Java which package this class belongs to

import java.awt.EventQueue; //import EventQueue so the GUI can run safely

import javax.swing.JFrame; //import JFrame to create the main window
import javax.swing.JPanel; //imports JPanel to create a section inside the window
import java.awt.BorderLayout; //imports BorderLayout for positioning the panel

import javax.swing.ImageIcon; //imports ImageIcon so images can be used
import javax.swing.JButton; //imports JButton so we can create a button
import javax.swing.JLabel; //imports JLabel to display images and text
import java.awt.event.ActionListener; //imports ActionListener to detect button clicks
import java.awt.event.ActionEvent; //imports ActionEvent for information about a button

public class BreakAPlate { //creates the BreakAPlate class for the game

	private JFrame frame; //creates a variable to store the main game window

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {  //the main method is where the program starts
		EventQueue.invokeLater(new Runnable() { //runs the GUI code safely on the event queue
			public void run() { //creates the code that will run when the program starts
				try {  //starts a section where Java looks for possible errors
					BreakAPlate window = new BreakAPlate();  //creates a new BreakAPlate game
					window.frame.setVisible(true); //makes the game window appear on the screen
				} catch (Exception e) { //runs if an error happens while starting the program
					e.printStackTrace(); //prints information about the error
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreakAPlate() { //creates the constructor for the BreakAPlate class
		initialize(); //calls the method that sets up the game window
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //creates a method that sets up the game's GUI
		
		frame = new JFrame(); //creates a new window for the game
		frame.setBounds(100, 100, 450, 300); //sets the window's position and size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the window closes

		
		JPanel panel = new JPanel();  //creates a panel to hold the game objects
		frame.getContentPane().add(panel, BorderLayout.CENTER); //adds the panel to the center of the window
		panel.setLayout(null); //allows objects to be placed using exact coordinates
		
		
		
		JLabel plates1 = new JLabel(""); //creates a label for displaying plate images
		plates1.setBounds(85, 11, 308, 79); //sets bounds for label
		panel.add(plates1); //adds the label to the panel
		
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif"); //loads the placeholder image
		ImageIcon pallbroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");//loads the image with all plates broken
		ImageIcon ptwobroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");//loads the image with two plates broken
		ImageIcon plates = new ImageIcon("../Chapter10/src/Mastery/plates.gif"); //loads the image with all plates still standing
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");//loads the sticker prize image
		ImageIcon tiger = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");//loads the tiger plush prize image
		
	
		JLabel prizes = new JLabel(""); //creates a label for displaying prizes or messages
		
		prizes.setBounds(159, 146, 134, 79); //sets the position and size of the prize label
		panel.add(prizes); //adds the prize label to the panel

		
		plates1.setIcon(plates); //displays the normal plates when the game starts
		
		
		JButton play = new JButton("Play"); //creates a button with the word Play on it
		play.addActionListener(new ActionListener()  //creates an action that happens when the button is clicked
		{
			public void actionPerformed(ActionEvent e)  //runs this method whenever the Play button is clicked
			{
				int newPlay = (int)(Math.random() * 3) + 1; //generates a random number between 1 and 3
				
				if (play.getText().equals("Play")) { //checks if the button still says Play
					play.setText("Play Again!");  //changes the button text to Play Again after the first click
				}
				
				prizes.setText(null); //removes any old text from the prize label

				
				if(newPlay == 1)  //checks if the random number is 1
				{
					plates1.setIcon(pallbroken); //shows the image where all the plates are broken
					prizes.setIcon(tiger); //gives the player the tiger plush prize
					
				}
				
				else if(newPlay == 2) //checks if the random number is 2
			
				{
					plates1.setIcon(ptwobroken);  //shows the image where two plates are broken
					
					prizes.setIcon(sticker); //gives the player the sticker prize
				}
				
				else if(newPlay == 3) //checks if the random number is 3
				{
					plates1.setIcon(plates); //shows the normal plates because the player lost
					prizes.setText("You lost! :)");  //displays a message telling the player they lost
					
					prizes.setIcon(null); //removes any prize image from the prize label
				}
				
			
			}});
		
		play.setBounds(146, 101, 125, 34); //sets the position and size of the Play button
		panel.add(play);
		
	
		
	} 
} 
