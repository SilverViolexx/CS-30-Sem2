package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {

	public static void main (String[] args) {
		//Initialize variables
		String action;
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> carList = new ArrayList<>();
		ArrayList<Vehicle> truckList = new ArrayList<>();
		ArrayList<Vehicle> vanList = new ArrayList<>();
		String prompt = "(A)dd Vehicle || (V)iew Catalogue || (Q)uit";		
		
		do {
			carList.add(assignV());
			
			System.out.print("\n" + prompt);
			action = input.next();
		
			//Checks if user wants to view employees
			if (action.equalsIgnoreCase("v") ) {
				//Displays information of each object in arraylist
				for (int i = 0; i < carList.size(); i++) {
					if(carList.get(i) == null) {
						System.out.println("Car Information Missing." + "\n");
					}
					else{
						System.out.println(carList.get(i)); 
					}
				}
				
				System.out.print("\n" + prompt);
				action = input.next();
			}
			while (!action.equalsIgnoreCase("v") && !action.equalsIgnoreCase("a") && !action.equalsIgnoreCase("q")) {
				System.out.print("Invalid option." + "\n" + prompt);
				action = input.next();
			}
		} while (!action.equalsIgnoreCase("q"));		
	}
	
	
	public static Vehicle assignV() {
		
		//Initialize variables
		String action, type, make, model, colour, transmission;
		Scanner input = new Scanner(System.in);	
		String typePrompt = "Type Of Vehicle: (C)ar || (T)ruck || (V)an";
		String makePrompt = "Make Of Vehicle: ";
		String modelPrompt = "Model Of Vehicle: ";
		String cPrompt = "Colour Of Vehicle: ";
		
		System.out.println("VEHICLE CATALOGUE");
		
		
			
		System.out.print(makePrompt);
		make = input.next();
		System.out.print(modelPrompt);
		model = input.next();
		System.out.print(cPrompt);
		colour = input.next();
			
		System.out.println(typePrompt);
		type = input.next();
			
		if (type.equals("c")) {		
			System.out.print("Transmission Type: ");
			transmission = input.next();
			//Returns object with data inputted
			return (new Car(make, model, colour, transmission));
		}
			
	
		
		
		
		return null;		
	}
}
