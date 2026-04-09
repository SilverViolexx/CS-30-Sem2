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
		
		String action;
		Scanner input = new Scanner(System.in);
		
		do {
			UEmployee e = assignE();
			System.out.print("(C)ontinue Assigning, (V)iew Employees Or (E)nd Program: ");
			action = input.next();
		
			if (action.toLowerCase().equals("v") ) {
				e.toString();
			}
		} while (action.toLowerCase().equals("e") == false || action.toLowerCase().equals("v"));	
		
	}
	
	public static UEmployee assignE() {
		Scanner input = new Scanner(System.in);
		String fName, lName, title, dep, choice;
		double salary;	
	
			System.out.print("Employee First Name: ");
			fName = input.next();
			System.out.print("Employee Last Name: ");
			lName = input.next();
			System.out.print("Employee Salary: ");
			salary = Double.parseDouble(input.next());
		
			System.out.print("Is The Employee A (S)taff or (F)aculty: ");
			choice = input.next();
		
			if (choice.toLowerCase().equals("s")) {
				System.out.print("Employee Job Title: ");
				title = input.next();
				
				return (new Staff(fName, lName, salary, title));
			}
			else if(choice.toLowerCase().equals("f")) {
				System.out.print("Employee Department: ");
				dep = input.next();			
				
				return (new Faculty(fName, lName, salary, dep));
			}
		
		return null;	
	}	
}