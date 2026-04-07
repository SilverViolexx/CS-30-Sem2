package Mastery;

public class UEmployee {
	private String eName;
	private double salary;
	
	//Constructor method
	public UEmployee() {
		eName = "default";
		salary = 0;
	}
	
	//Overloading method
	public UEmployee(String e, double s) {
		eName = e;
		salary = s;
	}
	
	//Modifier method
	public void setName(String n) {
		eName = n;
	}
	public void setSalary(String s) {
		salary = s;
	}
	
	//Access method
	public String getName() {
		return(eName);
	}
	public double getSalary() {
		return(salary);
	}
	
	//Return employee information
	public String eInfo
	
}
