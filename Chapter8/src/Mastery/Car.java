package Mastery;

public class Car extends Vehicle{
	private String model, colour, transmission;

	//Constructor
	public Car() {
		transmission = "none";
	}
		
	//Overloading method
	public Car(String b, String md, String c, String t) {
		super(b);
		model = md;
		colour = c;
		transmission = t;
	}
		
	//Modifier method
	public void setModel(String md) {
		model = md;
	}
	public void setColour(String c) {
		colour = c;
	}	
	public void setDrive(String t) {
		transmission = t;
	}
		
	//Access method
	public String getTran() {
		return(transmission);
	}
	public String getModel() {
		return(model);
	}
		public String getColour() {
		return(colour);
	}
		
	public String toString() {
		return(super.toString() + "\n"
				+ "Model: " + " " + model + "\n" 
				+ "Colour: " + colour + "\n"
				+ "Transmission Type: " + transmission);
	}

	//Abstract method
	String vehicleType() {
		return("Car");
	}
	String vehicleModel() {
		return(model);
	}
	String vehicleColour() {
		return(colour);
	}
	
	
	
}
