package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class myFileP1 {

	public static void main(String[] args)
	{
		//Do not use scanner to access files 
		File textFile;
		String fileName;
		Scanner input = new Scanner(System.in);
		
		//obtain file name from user
		System.out.println("Enter file name: ");
		
		//store file name in file name
		fileName = input.next();
		
		//determine if file exists or not
		textFile = new File(fileName);
		
		if(textFile.exists()) //returns true or false
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does NOT exist.");
		}
		
		
		
		
	}

}
