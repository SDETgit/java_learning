package A007_Exception_Handeling;

public class A003_nested_try_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Outer try block starts");

			try {
				int[] arr = new int[3];
				arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught inner exception: " + e);
			}

			int result = 10 / 0; // This will throw ArithmeticException

		} catch (ArithmeticException e) {
			System.out.println("Caught outer exception: " + e);
		}

		System.out.println("Program continues...");
	}

}
