package A003_OOPS_Abstraction;
abstract class Vehicle {  //Can have abstract methods and normal methods and variables 
	
	//Abstract methods needs to be implemented in child class or where it is implemented
    abstract void start();
    void stop() { System.out.println("Vehicle stopped"); }
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

	}

}
