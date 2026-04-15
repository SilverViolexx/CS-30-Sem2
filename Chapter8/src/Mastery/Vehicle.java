package Mastery;

//Class should be inherited
abstract class Vehicle {
	private String brand;
	
	//Constructor
	public Vehicle() {
		brand = "none";
	}
			
	//Overloading method
	public Vehicle(String b) {
		brand = b;
	}
			
	//Modifier method
	public void setBrand(String b) {
		brand = b;
	}
			
	//Access method
	public String getBrand() {
		return(brand);
	}
	
	public String toString() {
		return("Make: " + brand);
	}
	
	//Abstract method
	abstract String vehicleType();
	
	abstract String vehicleModel();
	
	abstract String vehicleColour();
	
	
}
