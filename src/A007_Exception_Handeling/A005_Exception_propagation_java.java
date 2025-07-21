package A007_Exception_Handeling;

//When a method thorws a excpetion and doesn't handle it 

public class A005_Exception_propagation_java {
	  static void method1() {
	        method2();
	    }

	    static void method2() {
	        int result = 10 / 0; // ArithmeticException occurs here
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//++++++++++++++++++++++++When not handelled+++++++++++++++++++// 
//		method1();
//        System.out.println("End of main");
        
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//    	at A007_Exception_Handeling.A005_Exception_propagation_java.method2(A005_Exception_propagation_java.java:9)
//    	at A007_Exception_Handeling.A005_Exception_propagation_java.method1(A005_Exception_propagation_java.java:5)
//    	at A007_Exception_Handeling.A005_Exception_propagation_java.main(A005_Exception_propagation_java.java:13)

//+++++++++++++++++++++++++When handelled+++++++++++++++++++//		
		
		
		try {
	            method1();
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception in main: " + e);
	        }
		   
		   //Caught exception in main: java.lang.ArithmeticException: / by zero

	}

}
