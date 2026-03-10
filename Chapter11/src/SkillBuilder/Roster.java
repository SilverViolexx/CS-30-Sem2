package SkillBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Roster {

	public static void main (String[] args) {
						
		Scanner input = new Scanner(System.in);
		
		File FileN;
		FileReader reads;
		BufferedReader readF;
		FileWriter writes;
		BufferedWriter writeF;
		
		String studentF, firstN, lastN;
		int numStu;
		
		//Object
		StudentFile action = new StudentFile();
		
		System.out.println("Name This File: ");
		studentF = input.next();
		
		FileN = new File(studentF);
		
		System.out.println("Number Of Students: ");
		numStu = input.nextInt();
		
		//Write objects
		try {
			//Use both to write raw data to a file
			FileOutputStream out = new FileOutputStream(FileN);
			ObjectOutputStream writeN = new ObjectOutputStream(out);
			
			for (int i = 0; i < numStu; i ++) {
				System.out.println("First Name: ");
				firstN = input.next();
				
				System.out.print("Last Name: ");
				lastN = input.next();
				
				writeN.writeObject(new StudentFile(firstN, lastN));
			}
			writeN.close();
			System.out.println("Data has been written.");
			
			//Read objects
			FileOutputStream in = new FileOutputStream(FileN);
			ObjectOutputStream readN = new ObjectOutputStream(in);
			
			for (int p = 0; p < numStu; p ++) {
				System.out.println(action.getNames());
			}
			
			readN.close();
			
			
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
