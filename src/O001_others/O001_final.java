package O001_others;

import java.util.ArrayList;
import java.util.List;

//final method cannot be ovveride 
class Parent {
    
	 final int  a = 10;
	public final void display() {
        System.out.println("Final method in Parent");
        
       
    }
}

class Child extends Parent {
   // public void display() { // Compilation Error: cannot override final method
	
	int a =2;
	
	void show() {
		System.out.println(a); 
	System.out.println(super.a); }
    }

//Final class cannot be ovveride 
final class FinalClass {
    // Class contents
}

//class SubClass extends FinalClass { // Compilation Error: cannot inherit from final class
    // Attempting to extend FinalClass
//}

//Final Method 
class Parent1 {
    public final void display() {
        System.out.println("Final method in Parent");
    }
}

//Final class 
final class FinalClass1 {
    // Class contents
	
	//Fianl parameter
	void display(final int number) {
	   // number = 10; // Compilation Error: cannot assign a value to final variable 'number'
	}

}

//class SubClass extends FinalClass1 { // Compilation Error: cannot inherit from final class
    // Attempting to extend FinalClass
//}

class Child1 extends Parent1 {
    //public void display() { // Compilation Error: cannot override final method
  //      System.out.println("Attempting to override");
    }


public class O001_final {
	//static and final 
	static final double PI = 3.14159;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static and Final 
		
		
		
		Child c = new Child() ;
		
		System.out.println(c.a);
		c.show();
		
		final int MAX_VALUE ;
		
		//System.out.println(MAX_VALUE);  //cannot print value without initializing it 
		MAX_VALUE = 200; // Compilation Error: cannot assign a value to final variable 'MAX_VALUE'
		
		
		
		  final List<String> list = new ArrayList<>();
		  list.add("Hello"); // Allowed
		  list.add("Hello"); // Allowed
		 // list = new ArrayList<>(); // Compilation Error: cannot assign a value to final variable 'list'

	}

}
