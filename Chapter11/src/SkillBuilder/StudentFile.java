package SkillBuilder;

import java.io.Serializable;

public class StudentFile implements Serializable{
	private String fName, lName;
	
	//Constructor
	public void student (String firstN, String lastN) {
		fName = firstN;
		lName = lastN;
	}
	
	//Creates String representing students' name
	public String getNames() {
		String stuName;
		
		stuName = fName + " " + lName;
		return stuName;
	}
	
}
