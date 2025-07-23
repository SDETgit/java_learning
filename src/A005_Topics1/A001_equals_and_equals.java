package A005_Topics1;

//== compares primitive data types and it only compares memory address
//equals() comapres content of object such as strings and custom objects 

public class A001_equals_and_equals {

	public static void main(String[] args) {
		// .equals wont work with primitive data types

		String a = "Hello";
		String b = new String("Hello");

		System.out.println(a == b);
		// false
		System.out.println(a.equals(b));
		// true
		int a1 = 10;

		int b1 = 10;
		System.out.println(a1 == b1);
		// true

//System.out.println(a1.equals(b1)); //Checked exception cannot use equals on primitive data types 
//System.out.println(a1.equals(b1)); //wont work with int 

	}

}
