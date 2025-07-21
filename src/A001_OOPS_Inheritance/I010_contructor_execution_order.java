package A001_OOPS_Inheritance;
class A2 {
	A2() {
	System.out.println("A's constructor ");	
	}
}


class B extends A2 {
	B() {
		System.out.println("B's contructor ");
	}
}

class C extends B {
	
	C() {
		System.out.println("C's Constructor");
	}
}
public class I010_contructor_execution_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C() ;
		
		//A's constructor 
		//B's contructor 
		//C's Constructor

	}

}
