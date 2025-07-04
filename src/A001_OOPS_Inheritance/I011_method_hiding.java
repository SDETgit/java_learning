package A001_OOPS_Inheritance;


//With static method dynamic dispatch wont work as parent method will be called in upcasting 
//Normally child method is called , here also ovveride is not showing as method is static
class h {
	static void m () {
		System.out.println("Static method parent ");
	}
	
}

class child_h extends h {
	static void m() {
		System.out.println("Static mehthod child ");
	}
}

public class I011_method_hiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		h h1 = new child_h () ;
		
		h1.m();
		

	}

}
