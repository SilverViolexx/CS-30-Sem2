package Mastery;

public class Car extends Vehicle{
	private String type, colour;

	//Constructor
	public Car() {
		type = "none";
		colour = "blank";
	}
		
	//Overloading method
	public Car(String t, String c) {
		type = t;
		colour = c;
	}
		
	//Modifier method
	public void setMake(String t) {
		type = t;
	}
	public void setColour(String c) {
		colour = c;
	}
		
	//Access method
	public String getType() {
		return(type);
	}
		public String getColour() {
		return(colour);
	}
		
	public String toString() {
		return("Make & Model: " + type + "\n" 
				+ "Colour: " + colour);
	}

	//Abstract method
	public String vehicleType(String type) {
		return(type);
	}
	public String vehicleColour(String make) {
		return(make);
	}
	
	
	
}
