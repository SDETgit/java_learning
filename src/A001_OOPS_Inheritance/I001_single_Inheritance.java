package A001_OOPS_Inheritance;
class vehicle {
	
	public int a = 100;
	protected String brand = "Ford";
	
	public void honk() {
			System.out.println("Ford honk sound ");
	}
	
	public void intstance_variable() {
		System.out.println(a);
		a = 20;
		
		System.out.println(a);
	}
}

class car extends vehicle {
	String modelName  = "Mustang";
	
}
public class I001_single_Inheritance {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car myCar = new car();
		myCar.honk();  // inherited method
	    System.out.println(myCar.brand + " " + myCar.modelName);
	    myCar.intstance_variable();
	    
	    
		
		
		
	}}


