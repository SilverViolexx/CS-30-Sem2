package Mastery;

public class Staff extends UEmployee{
	private String title;
	
	public Staff() {
		super();
		title = "No title";
	}
	
	//Overloading method
	public Staff(String f, String l, double s, String t) {
		super(f, l , s);
		title = t;
	}
	
	//Modifier method
	public void setJob(String t) {
		title = t;
	}
	
	//Accessor method
	public String getJob() {
		return(title);
	}
	
	//Return employee job
	public String toString() {
		return("Empolyee Name: " + super.getFName() + " " + super.getLName() + "\n"
				+ "Salary Amount: $" + super.getSalary() + "\n"
				+ "Job Title: " + title + "\n");
	}
	
}
