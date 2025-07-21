package A005_Topics1;

//Constructor 
//1. Default constructor 
//2. No-args constructor 
//3. Parameterized constructor 

//Constructor overloading
//Access modifiers can be used 

class data {
	
}

class noargsconst{
	public noargsconst () {
		System.out.println("No args constructor");
	}
}


class paraconst {
	
	paraconst() {
		
	}
	String n ;
	
	public paraconst(String n) {
		this.n = n;
		
		System.out.println("Assigning parameterised constructor "+n);
	}
}

public class A003_contructor_in_java {

	public static void main(String[] args) {
		// 
		data d = new data() ; 
		//here in class there is no constructor there is defult constructor provided by java 
		
		noargsconst n = new noargsconst() ;
		
		paraconst p = new paraconst("Calling the ") ;
		
		//No args constructor
		//Assigning parameterised constructor Calling the 

	}

}
