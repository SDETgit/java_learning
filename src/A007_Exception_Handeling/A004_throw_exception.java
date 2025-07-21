package A007_Exception_Handeling;

public class A004_throw_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age = 15;

	        if (age < 18) {
	            throw new ArithmeticException("You must be 18 or older to vote.");
	        } else {
	            System.out.println("You are eligible to vote.");
	        }
	        System.out.println("Throw exmaple");
	}

}
