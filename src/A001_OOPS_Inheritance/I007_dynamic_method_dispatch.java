package A001_OOPS_Inheritance;




class Parent1 {
	final int a = 20;

	protected void print () {
		
		System.out.println("Printing method from m1");
	}
}

class Child1 extends Parent1 {
	
	int a = 30;
	@Override 
	public void print() {
		System.out.println("Overiding M1");
	}
}


public class I007_dynamic_method_dispatch {
		
	public static void main(String[] args) {
		
		Parent1 m2 = new Child1();  //upcasting 
		
		m2.print();
		System.out.println(m2.a);
		animal a = new cat();
		cat  c = (cat) a ;  //down casting
		
		c.sound();
		
		
	}}


