package SkillBuilder;

//parent class - other classes inherit properties from this
//class has to be abstract to have abstract methods
abstract class TestAbstract {

	//children that inherit has wheels but don't know specifics - ie. # of wheels, colour
	//
	abstract void hasWheels();
}
