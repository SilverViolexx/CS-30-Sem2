package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {

	public static void main (String[] args) {
		//Initialize variables
		String action, view;
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> carList = new ArrayList<>();
		ArrayList<Vehicle> truckList = new ArrayList<>();
		ArrayList<Vehicle> vanList = new ArrayList<>();
		String prompt = "(A)dd Vehicle || (V)iew Catalogue || (Q)uit";		
		
		System.out.println("VEHICLE CATALOGUE");
		
		do {
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
			
			
			System.out.println("\n" + prompt);
			action = input.nextLine();
		
			//Checks if user wants to view employees
			if (action.equalsIgnoreCase("v") ) {
				System.out.println("View: (C)ars || (T)rucks || (M)inivan");
				view = input.nextLine();
				//Displays information of each object in arraylist
				if (view.equalsIgnoreCase("c")) {
					for (int i = 0; i < carList.size(); i++) {
						if(carList.get(i) == null) {
							System.out.println("Car Information Missing." + "\n");
						}
						else{
							System.out.println(carList.get(i) + "\n"); 
						}
					}
				}
				else if (view.equalsIgnoreCase("t")) {
					for (int i = 0; i < truckList.size(); i++) {
						if(truckList.get(i) == null) {
							System.out.println("Truck Information Missing." + "\n");
						}
						else{
							System.out.println(truckList.get(i) + "\n"); 
						}
					}
				}
				else if (view.equalsIgnoreCase("m")) {
					for (int i = 0; i < vanList.size(); i++) {
						if(vanList.get(i) == null) {
							System.out.println("Truck Information Missing." + "\n");
						}
						else{
							System.out.println(vanList.get(i) + "\n"); 
						}
					}
				}
				System.out.println(prompt);
				action = input.nextLine();
			}
			
			while (!action.equalsIgnoreCase("v") && !action.equalsIgnoreCase("a") && !action.equalsIgnoreCase("q")) {
				System.out.print("Invalid option." + "\n" + prompt);
				action = input.nextLine();
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
		
			
		System.out.println(typePrompt);
		type = input.next();
			
		if (type.equals("c")) {		
			System.out.print("Transmission Type: ");
			transmission = input.nextLine();
			//Returns object with data inputted
			return (new Car(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, transmission));
		}
		else if (type.equals("t")) {		
			System.out.print("Towing Capacity(kg): ");
			towCap = input.nextDouble();
			//Returns object with data inputted
			return (new Truck(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, towCap));
		}
		else if (type.equals("m")) {		
			System.out.print("Sliding Door(yes/no): ");
			door = input.nextLine();
			//Returns object with data inputted
			return (new Minivan(seatNum, cargoV, ctyEcon, hwyEcon, make, colour, door));
		}
		
		return null;		
	}
}
