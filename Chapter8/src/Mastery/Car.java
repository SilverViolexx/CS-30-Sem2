package Mastery;

public class Car extends Vehicle{
	private String colour;
	private int seat, wheel;
	
	//Constructor method
	public Car() {
		colour = "blank";
		seat = 0;
		wheel = 0;
	}
	
	//Overloading method
	public Car(String c, int s, int w) {
		colour = c;
		seat = s;
		wheel = w;
	}
	
	//Modifier method
	public void setColour(String c) {
		colour = c;
	}
	public void setSeat(int s) {
		seat = s;
	}
	public void setWheel(int w) {
		wheel = w;
	}

	//Access method
	public String getColour() {
		return(colour);
	}
	public int getSeat() {
		return(seat);
	}
	public int getWheel() {
		return(wheel);
	}

	@Override
	void hasWheels() {
		
		
	}

	@Override
	void hasSeats() {
		
		
	}

	@Override
	void hasColour() {
		
		
	}
	
	
	
}
