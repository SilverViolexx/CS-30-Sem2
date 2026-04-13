package Mastery;

public class Minivan extends Vehicle{
	private int seat;
	private double cargo;
	
	//Constructor
	public Minivan() {
		seat = 0;
		cargo = 0;
	}
		
	//Overloading method
	public Minivan(int s, double c) {
		seat = s;
		cargo = c;
	}
		
	//Modifier method
	public void setDoor(int s) {
		seat = s;
	}
	public void setDriveSys(double c) {
		cargo = c;
	}
		
	//Access method
	public double getSeat() {
		return(seat);
	}
	public double getCargo() {
		return(cargo);
	}

	//Abstract method
	String vehicleMake(String vmk) {
		return(vmk);
	}
	String vehicleModel(String vmd) {
		return(vmd);
	}
	String vehicleColour(String vc) {
		return(vc);
	}
}
