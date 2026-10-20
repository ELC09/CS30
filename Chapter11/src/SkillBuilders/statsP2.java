package SkillBuilders;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class statsP2 {

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		
		FileWriter out;
		BufferedWriter writeFile;
		
		Scanner input = new Scanner(System.in);
		
		String fileName;
		String stuName, score;
		
		int numStu;
		int numScores = 0;
		
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;

		//write data to a file
		
		System.out.println("Enter file name: ");
		fileName = input.next();
				
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		try
		{
			dataFile = new File(fileName);
			
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i=0; i < numStu; i++)
			{
				System.out.println("Enter student name: ");
				stuName = input.next(); 
				
				System.out.println("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
				
				
			} //end for loop 
			
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
			
			
		} //closes try
		
		catch(IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		try
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((stuName = readFile.readLine())!= null)
			{
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				
				numScores += 1;
				
				scoreValue = Double.parseDouble(score);
				
				totalScores += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
				
				
			}//end of while loop
		
			avgScore = totalScores / numScores;
			System.out.println("Low Score = " + percent.format(lowScore/100));
			System.out.println("High Score = " + percent.format(highScore/100));
			System.out.println("Average Score = " + percent.format(avgScore/100));
			
			readFile.close();
			in.close();
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
