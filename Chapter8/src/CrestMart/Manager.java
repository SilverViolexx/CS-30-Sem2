package CrestMart;

public class Manager extends Employee{
	private double yearlySalary;
	
	//Constructor
	public Manager(String f, String l, double y) {
		super(f, l);
		yearlySalary = y;
	}
	
	@Override
	double pay(double period) {
		return yearlySalary;
	}
	
}
