/*
Program: University.java          Last Date of this Revision: April 9, 2026

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary. 
The UEmployee class should contain member methods for returning the employee name and salary.
Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include 
members for storing and returning the department name. The Staff class should include members for 
storing and returning the job title.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 30
 
*/
package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

	public static void main (String[] args) {
		//Initialize variables
		String action;
		Scanner input = new Scanner(System.in);
		ArrayList<UEmployee> list = new ArrayList<>();
		String prompt = "(C)ontinue Assigning || (V)iew Employees || (E)nd Program: ";
		
		//Continues looping code until "e" is entered
		do {
			list.add(assignE());
			
			System.out.print("\n" + prompt);
			action = input.next();
		
			//Checks if user wants to view employees
			if (action.toLowerCase().equals("v") ) {
				//Displays information of each object in arraylist
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
				
				System.out.print("\n" + prompt);
				action = input.next();
			}
		} while (!action.toLowerCase().equals("e"));			
	}
	
	public static UEmployee assignE() {
		//Initialize variables
		String fName, lName, title, dep, choice;
		double salary;	
		Scanner input = new Scanner(System.in);
		
			//Prompt user to input data
			System.out.print("Employee First Name: ");
			fName = input.next();
			System.out.print("Employee Last Name: ");
			lName = input.next();
			System.out.print("Employee Salary: ");
			salary = Double.parseDouble(input.next());
		
			System.out.print("Is The Employee A (S)taff or (F)aculty: ");
			choice = input.next();
		
			//Checks if employee is staff or faculty
			if (choice.toLowerCase().equals("s")) {
				System.out.print("Employee Job Title: ");
				title = input.next();
				
				//Returns object with data inputted
				return (new Staff(fName, lName, salary, title));
			}
			else if(choice.toLowerCase().equals("f")) {
				System.out.print("Employee Department: ");
				dep = input.next();			
				
				//Returns object with data inputted
				return (new Faculty(fName, lName, salary, dep));
			}
		
		return null;	
	}	
}