package SkillBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class StatsP2 {

	public static void main (String[] args) {
		
		File dataF;
		FileReader reads;
		BufferedReader readFile;
		FileWriter writes;
		BufferedWriter writeF;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		Scanner input = new Scanner(System.in);
		int numStudent, numScore = 0; 
		double scoreValue, average;
		double lowScore = 100;
		double highScore = 0;
		double totalScore = 0;
		String fileN, studentN, score;
		
		System.out.print("Enter File Name: ");
		fileN = input.nextLine();		

		System.out.print("Number Of Students: ");
		numStudent = input.nextInt();
			
		try {
			dataF = new File(fileN);
			writes = new FileWriter(dataF);
			writeF = new BufferedWriter(writes);
			
			for (int i = 0; i < numStudent; i ++) {
				System.out.print("Student Name: ");
				studentN = input.nextLine();
				
				System.out.print("Grade: ");
				score = input.nextLine();
				
				writeF.write(studentN);
				writeF.newLine();
				writeF.write(score);
				writeF.newLine();
				
			}
			
			writeF.close();
			writes.close();
		
			System.out.println("Data Written Into File.");
		}											
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		//Read data from file
		try {
			dataF = new File(fileN);
			reads = new FileReader(dataF);
			readFile = new BufferedReader(reads);
			
			while ((studentN = readFile.readLine()) != null) {
				score = readFile.readLine();
				System.out.println(studentN + " " + score);
				
				numScore += 1;
				
				scoreValue = Double.parseDouble(score);
				totalScore += scoreValue;
				
				if (scoreValue < lowScore) {
					lowScore = scoreValue;
				}
				if (scoreValue > highScore) {
					highScore = scoreValue;
				}
				
			}
			average = totalScore / numScore;
			
			System.out.print("Low Score: " + percent.format(lowScore / 100) + "\n"
					+ "High Score: " + percent.format(highScore / 100) + "\n"
					+ "Average Score: " + percent.format(average / 100));
			
			readFile.close();
			reads.close();
		}
		catch (FileNotFoundException e){
			System.out.println("File doesn't exist.");
			System.err.println("FileNotFOundException: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
	
		
	}
	
}
