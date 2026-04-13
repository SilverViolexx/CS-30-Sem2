package Mastery;

public class Car extends Vehicle{
	private String type , colour;
	
	//Constructor
	public Car() {
		door = 0;
		driveSys = "none";
	}
	
	//Overloading method
	public Car(int d, String sys) {
		door = d;
		driveSys = sys;
	}
	
	//Modifier method
	public void setDoor(int d) {
		door = d;
	}
	public void setDriveSys(String sys) {
		driveSys = sys;
	}
	
	//Access method
	public int getDoor() {
		return(door);
	}
	public String getDriveSys() {
		return(driveSys);
	}

	//Abstract method
	public String vehicleMake(String make) {
		return(make);
	}
	
	
	
}
