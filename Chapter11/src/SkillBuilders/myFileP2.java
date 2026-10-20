package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myFileP2 {

	public static void main(String[] args)
	{
	
		//Do not use scanner to access files 
				File textFile;
				String response;
				Scanner input = new Scanner(System.in);
				
				//create a file
				textFile = new File("C:\\Users\\49109507\\git\\CS30\\Chapter11\\src\\SkillBuilders\\zzz.txd");
				
				//check if file exists 
				if(textFile.exists())
				{
					System.out.println("zzz.txd exists");
				}
				else
				{
					try {
							textFile.createNewFile();
							System.out.println("zzz.txd file created");
						}
						catch(IOException e) 
						{
							System.out.println("File could not be created.");
							System.err.println("IOException: " + e.getMessage());
						}
				}

				//delete if user chooses to delete the file
				System.out.println("Would you like to (K)eep or (D)elete the file?");
				response = input.next();
				
				if (response.equalsIgnoreCase("D"))
				{
					//delete file
					if(textFile.delete())
					{
						System.out.println("File has been deleted");
					}
					
				}
				else
				{
					System.out.println("File is kept");
				}
	}
}