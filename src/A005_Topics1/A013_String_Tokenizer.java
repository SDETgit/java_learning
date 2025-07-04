package A005_Topics1;

import java.util.StringTokenizer;

//StringTokenizer is a legacy class used to split a string into tokens based on delimiters

public class A013_String_Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is fun";
		StringTokenizer st = new StringTokenizer(str);
		StringTokenizer st1 = new StringTokenizer(str," ");
		StringTokenizer st2 = new StringTokenizer(str," ", true); //will print the delimiter if true
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		//Output 
		//Java
		//is
		//fun
		
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextElement());
		}
		
				//Output 
				//Java
				//is
				//fun
		
		
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextElement());
		}
		//output 
		//Java
		// 
		//is
		// 
		//fun
		
		
	}
	
	

}
