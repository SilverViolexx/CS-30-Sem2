/*
Program: TestVehicle.java          Last Date of this Revision: April 20, 2026

Create a Vehicle class that is an abstract class defining the general details and actions associated with 
a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and 
Minivan classes should include additional members specific to the type of vehicle being represented. 
Create client code to test the classes.

Author: Amanda Ly
School: CHHS
Course: Computer Programming 30

*/
package Mastery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestVehicle {

	public static void main (String[] args) {
		//Initialize variables
		String action, view;
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> carList = new ArrayList<>();
		ArrayList<Vehicle> truckList = new ArrayList<>();
		ArrayList<Vehicle> vanList = new ArrayList<>();
		String[] actionList = {"a", "v", "q"};
		String prompt = "(A)dd Vehicle || (V)iew Catalogue || (Q)uit";		
		
		//Display program name
		System.out.println("VEHICLE CATALOGUE");
		
		//do-while loop
		do {
				
			System.out.println("\n" + prompt);
			action = input.nextLine();
		
			//Checks if user wants to view employees
			if (action.equalsIgnoreCase("a")) {
				Vehicle obj = assignV();

				if (obj.vehicleType().equals("Car")) {
					carList.add(obj);
				}
				else if (obj.vehicleType().equals("Truck")) {
					truckList.add(obj);
				}
				else if (obj.vehicleType().equals("Minivan")) {
					vanList.add(obj);
				}
			}
			
			else if (action.equalsIgnoreCase("v") ) {
				System.out.println("View: (C)ars || (T)rucks || (M)inivan");
				view = input.nextLine();
				//Displays information of each object in arraylist
				if (view.equalsIgnoreCase("c")) {	
					if(carList.isEmpty()) {
						System.out.println("Car Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < carList.size(); i++) {							
							System.out.println(carList.get(i) + "\n"); 
						}					
					}
					
				}
				else if (view.equalsIgnoreCase("t")) {				
					if(truckList.isEmpty()) {
						System.out.println("Truck Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < truckList.size(); i++) {
							System.out.println(truckList.get(i) + "\n"); 						
						}						
					}
				}
				else if (view.equalsIgnoreCase("m")) {	
					if(vanList.isEmpty()) {
						System.out.println("Minivan Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < vanList.size(); i++) {
							System.out.println(vanList.get(i) + "\n"); 
						}						
					}
				}
				else {
					System.out.println("Invalid option.");
				}

			}

			while (!Arrays.asList(actionList).contains(action)) {
				System.out.println("Invalid option.");
				System.out.println("HELLO");
				break;
			}
		} while (!action.equalsIgnoreCase("q"));		
	}
	
	
	public static Vehicle assignV() {
		
		//Initialize variables
		String action, type, make, colour, transmission, door;
		int seatNum;
		double cargoV, ctyEcon, hwyEcon, towCap;
		String[] typeList = {"c", "t", "m"};
		Scanner input = new Scanner(System.in);	
		String typePrompt = "Type Of Vehicle: (C)ar || (T)ruck || (M)inivan";
			
		System.out.print("Make & Model Of Vehicle: ");
		make = input.nextLine();
		
		System.out.print("Colour Of Vehicle: ");
		colour = input.nextLine();
		
		System.out.print("Seat Capacity: ");
		seatNum = input.nextInt();
		input.nextLine();
		
		System.out.print("Cargo Volume(m²): ");
		cargoV = input.nextDouble();
		input.nextLine();
		
		System.out.print("City Fuel Economy(km/L): ");
		ctyEcon = input.nextDouble();
		input.nextLine();
		
		System.out.print("Highway Fuel Economy(km/L): ");
		hwyEcon = input.nextDouble();
		input.nextLine();		
		
		System.out.println(typePrompt);
		type = input.nextLine();
		type = type.toLowerCase();
		
		while(!Arrays.asList(typeList).contains(type)) {
			System.out.println("Invalid option.");

			System.out.println(typePrompt);
			type = input.nextLine();
		}
		
		if (type.equalsIgnoreCase("c")) {		
			System.out.print("Transmission Type(Auto/Manual): ");
			transmission = input.nextLine();
			//Returns object with data inputted
			return (new Car(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, transmission));
		}
		else if (type.equalsIgnoreCase("t")) {		
			System.out.print("Towing Capacity(kg): ");
			towCap = input.nextDouble();
			//Returns object with data inputted
			return (new Truck(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, towCap));
		}
		else if (type.equalsIgnoreCase("m")) {		
			System.out.print("Sliding Door(yes/no): ");
			door = input.next();
			//Returns object with data inputted
			return (new Minivan(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, door));
		}
		
		return null;		
	}
	
}
