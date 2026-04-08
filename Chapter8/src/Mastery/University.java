/*
Program: CounterVowels.java          Last Date of this Revision: March 17, 2026

Purpose: Create a CountVowels application that count the number of vowels 
in a text file. The application should prompt the user for the file name.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

import java.util.Scanner;

public class University {

	public static void main (String[] args) {
		
		/*
		//Create objects
		Faculty person1 = new Faculty("Ava", "A", 20, "Art");
		Staff person2 = new Staff("Bob", "B", 15, "Teacher");
		
		//Display object information
		System.out.println(person1.toString());
		System.out.println("\n" + person2.toString());
		*/
	}
	
	public static UEmployee assignE() {
		Scanner input = new Scanner(System.in);
		String fName, lName, title, dep;
		double salary;
		
		System.out.println("Employee First Name: ");
		fName = input.next();
		System.out.println("Employee Last Name: ");
		lName = input.next();
		System.out.println("Employee Salary: ");
		salary = Double.parseDouble(input.next());
		
		System.out.println("Is The Employee A Staff: ");
		fName = input.next();
		
	}
	
	
}