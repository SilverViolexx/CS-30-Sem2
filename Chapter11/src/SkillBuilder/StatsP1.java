package SkillBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StatsP1 {

	public static void main(String[] arg) {
		File grades = new File("test1.dat"); 
		FileReader reads;
		BufferedReader readFile;
		String eachLine;
		
		ArrayList<Double> score = new ArrayList<Double>();
		int counter = 0;
		double avgScore = 0;
		
		try {
			reads = new FileReader(grades);
			readFile = new BufferedReader(reads);
			
			while ((eachLine = readFile.readLine()) != null) {
				if (counter % 2 == 0) {
					
				}
				if (counter % 2 == 1) {
					score.add(Double.parseDouble(eachLine));
				}
				avgScore += Double.parseDouble(eachLine);
			}
			
			System.out.println("Lowest score: " + );
		}
		catch (FileNotFoundException e){
			System.out.println("File doesn't exist or couldn't be found.");
			System.err.println("FileNotFOundException: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Problem reading file.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		
		
		
	}
}
