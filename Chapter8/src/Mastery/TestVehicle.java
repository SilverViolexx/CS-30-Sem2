package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {

	public static void main (String[] args) {
		assignV().toString();
	}
	
	
	public static Vehicle assignV() {
		
		//Initialize variables
		String action, brand, model, colour, transmission;
		Scanner input = new Scanner(System.in);
		ArrayList<UEmployee> list = new ArrayList<>();
		String prompt = "Type Of Vehicle: (C)ar, (T)ruck, (V)an";

		System.out.print(prompt);
		action = input.nextLine();
		action.toLowerCase();
		
		System.out.print("Brand Of Vehicle: ");
		brand = input.next();
		System.out.print("Model Of Vehicle: ");
		model = input.next();
		System.out.print("Colour Of Vehicle: ");
		colour = input.next();
		
		if (action.equals("c")) {		
			System.out.print("Transmission Type: ");
			transmission = input.next();
			//Returns object with data inputted
			return (new Car(brand, model, colour, transmission));
		}
		return null;
		
		
	}
}
