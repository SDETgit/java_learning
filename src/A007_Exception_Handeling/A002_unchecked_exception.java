package A007_Exception_Handeling;

//Can be handelled by try catch only 

public class A002_unchecked_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            int a = 10 / 0;  // ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!"+" "+e);
	        } finally {
	            System.out.println("This will always execute.");
	        }
		 
		    String name = null;
		    try {
	        System.out.println(name.length());  // Throws NullPointerException
		    }
		    catch (NullPointerException e) {
		    	System.out.println("We have caught the exception"+e);
		    }
		    
		    
		    int[] arr = {1, 2, 3};
	        
		    try {
		    System.out.println(arr[5]);  // Throws ArrayIndexOutOfBoundsException
		    }
		    catch (ArrayIndexOutOfBoundsException e) {
		    	System.out.println("Exception has been caught "+e);
		    }
	        
	        
	}

}
