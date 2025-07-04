package A005_Topics1;

public class A011_Convert_int_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345678;
		
		//1st way
		String s = Integer.toString(num);
		
		System.out.println(s+" "+num);
		
		//2nd way 
		String s2 = String.valueOf(num);
		System.out.println(s2);
		
		//3rd method
		String s3 = "" +num;
		System.out.println(s3);
		
		//4th 
		
		String s4 = String.format("%d", num);
		System.out.println(s4);
		
		String s5 = new StringBuffer().append(num).toString();
		
		System.out.println(s5);
		
		String s6 = new StringBuilder().append(num).toString();
		
		System.out.println(s6);
		
		
		@SuppressWarnings("removal")
		String s7 = new Integer(num).toString();
		
		System.out.println(s7);
	}

}
