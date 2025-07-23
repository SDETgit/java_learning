package A003_OOPS_Abstraction;

//Abstraction is the process of hiding internal implementation details
//and showing only essential features to the user.

abstract class Vehicle { // Can have abstract methods and normal methods and variables

	// Abstract methods needs to be implemented in child class or where it is
	// implemented
	abstract void start(); // can have abstract and non abstract methods

	void stop() {
		System.out.println("Vehicle stopped");
	}
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Vehicle started ");

	}

}

public class A001_Abstract_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car() ;
		c.start();
		c.stop();
		
		//Vehicle started 
		//Vehicle stopped

	}

}
