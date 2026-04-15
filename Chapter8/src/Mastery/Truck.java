package Mastery;

public class Truck extends Vehicle{
	private double towingCap;

	//Constructor
	public Truck() {
		towingCap = 0;
	}
		
	//Overloading method
	public Truck(double t) {
		towingCap = t;
	}
		
	//Modifier method
	public void setDoor(double t) {
		towingCap = t;
	}
		
	//Access method
	public double getTow() {
		return(towingCap);
	}

	//Abstract method
	
}
