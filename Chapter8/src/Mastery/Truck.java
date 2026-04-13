package Mastery;

public class Truck extends Vehicle{
	private double towingCap, payload;

	//Constructor
	public Truck() {
		towingCap = 0;
		payload = 0;
	}
		
	//Overloading method
	public Truck(double t, double p) {
		towingCap = t;
		payload = p;
	}
		
	//Modifier method
	public void setDoor(double t) {
		towingCap = t;
	}
	public void setDriveSys(double p) {
		payload = p;
	}
		
	//Access method
	public double getTow() {
		return(towingCap);
	}
	public double getLoad() {
		return(payload);
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
