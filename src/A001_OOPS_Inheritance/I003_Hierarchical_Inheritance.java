package A001_OOPS_Inheritance;

class animal {
	public void sound() {
		 System.out.println("Animal sound");
	}
}

class dog extends animal{
	@Override
	 public void sound() {
		 System.out.println("Bow Bow");
	 }
	
}

class cat extends animal {
	@Override 
	public void  sound() {
		System.out.println("Meeo Meeo");
	}
}

public class I003_Hierarchical_Inheritance {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		
		d.sound();
		
		cat c = new cat();
		c.sound();
		
		animal a = new animal();
		
		a.sound();
		
		animal a1 = new dog();
		
		a1.sound();
		
		//Bow Bow
		//Meeo Meeo
		//Animal sound
		//Bow Bow

		
		
	}}


