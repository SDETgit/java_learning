package A007_Exception_Handeling;

public class T005_rethrowing_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				int a = 10/0;
			}
			catch (ArithmeticException e) {
				System.out.println("Here Arithmetic exception got converted to NullPointerException ");
				throw new NullPointerException();
				//Here Arithmetic exception got converted to NullPointerException 
				//Exception in thread "main" java.lang.NullPointerException
//					at A007_Exception_Handeling.T005_rethrowing_exception.main(T005_rethrowing_exception.java:12)

			}
	}

}
