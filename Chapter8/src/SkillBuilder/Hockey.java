package SkillBuilder;

public class Hockey {
	
	public static void main (String[] args) {
		
		Puck stdPuck = new Puck(4); //weight = 4
		Puck ythPuck = new Puck(5.5);
		
		System.out.println("The Puck Has A Radius Of " + stdPuck.getRadius() + "." + "\n"
				+ "The Puck Has A Weight Of " + stdPuck.getWeight() + "\n"
				+ stdPuck.getDivision());
		
		System.out.println("The Puck Has A Radius Of " + ythPuck.getRadius() + "." + "\n"
				+ "The Puck Has A Weight Of " + ythPuck.getWeight() + "\n"
				+ ythPuck.getDivision());
	}

}
