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
		String[] viewList = {"c", "t", "m"};
		String prompt = "(A)dd Vehicle || (V)iew Catalogue || (Q)uit";		
		
		System.out.println("VEHICLE CATALOGUE");
		
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
					if(carList.isEmpty() == true) {
						System.out.println("Car Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < carList.size(); i++) {
							if(carList.get(i) == null) {
								System.out.println("Car Information Missing." + "\n");
							}
							else{
								System.out.println(carList.get(i) + "\n"); 
							}
						}					
					}
				}
				else if (view.equalsIgnoreCase("t")) {				
					if(truckList.isEmpty()  == true) {
						System.out.println("Truck Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < truckList.size(); i++) {
							if(truckList.get(i) == null) {
								System.out.println("Truck Information Missing." + "\n");
							}
							else{
								System.out.println(truckList.get(i) + "\n"); 
							}
						}						
					}
				}
				else if (view.equalsIgnoreCase("m")) {	
					if(vanList.isEmpty()  == true) {
						System.out.println("Minivan Catalogue Is Empty");
					}
					else {
						for (int i = 0; i < vanList.size(); i++) {
							if(vanList.get(i) == null) {
								System.out.println("Minivan Information Missing." + "\n");
							}
							else{
								System.out.println(vanList.get(i) + "\n"); 
							}
						}						
					}
				}
				/*
				System.out.println(prompt);
				action = input.nextLine();
				*/
			}
			
			while (!Arrays.asList(actionList).contains(action)) { //|| !Arrays.asList(viewList).contains(view)
				System.out.println("Invalid option.");
				break;
				//action = input.nextLine();
			}
		} while (!action.equalsIgnoreCase("q"));		
	}
	
	
	public static Vehicle assignV() {
		
		//Initialize variables
		String action, type, make, colour, transmission, door;
		int seatNum;
		double cargoV, ctyEcon, hwyEcon, towCap;
		Scanner input = new Scanner(System.in);	
		String typePrompt = "Type Of Vehicle: (C)ar || (T)ruck || (M)inivan";
		
		
		
			
		System.out.print("Make & Model Of Vehicle: ");
		make = input.nextLine();
		System.out.print("Colour Of Vehicle: ");
		colour = input.nextLine();
		System.out.print("Seat Capacity: ");
		seatNum = input.nextInt();
		System.out.print("Cargo Volume(m²): ");
		cargoV = input.nextDouble();
		System.out.print("City Fuel Economy(km/L): ");
		ctyEcon = input.nextDouble();
		System.out.print("Highway Fuel Economy(km/L): ");
		hwyEcon = input.nextDouble();
		
		//input.nextLine(); 
		
			
		System.out.println(typePrompt);
		type = input.next();
			
		if (type.equalsIgnoreCase("c")) {		
			System.out.print("Transmission Type: ");
			input.nextLine(); 
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
