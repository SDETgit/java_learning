package A001_OOPS_Inheritance;




class m1 {
	protected void print () {
		System.out.println("Printing method from m1");
	}
}

class m2 extends m1 {
	@Override 
	public void print() {
		System.out.println("Overiding M1");
	}
}


public class I006_method_override {
		
	public static void main(String[] args) {
		
		m2 m2 = new m2();
		
		m2.print();
		
	}}


