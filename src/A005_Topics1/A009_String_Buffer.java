package A005_Topics1;

//StringBuffer is mutable thrread safe (synchronized )
//Allows to modify content without creating new objects 

public class A009_String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer() ;  // Empty buffer with default capacity (16)
		StringBuffer sb1 = new StringBuffer(50) ;  // Capacity 50
		StringBuffer sb2 = new StringBuffer("Hello"); // Initialized with "Hello"
		StringBuffer sb3 = new StringBuffer("This is a sequence"); 
		
		sb.append("Hello"); 
		System.out.println(sb); //Hello
		//sb.replace(0, 4, "Hi"); //Hio
		sb.replace(0, 0, "Hi");   //HiHello
		
		System.out.println(sb);
		
		//sb.setLength(2); //Hi
		//sb.setLength(0);  //Empty
		//System.out.println(sb);
		
		sb.insert(6, false);
		
		System.out.println(sb);
		
		sb.delete(3, 6);
		
		System.out.println(sb);
		
		sb.deleteCharAt(5);
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(3));
		
		sb.setCharAt(3, '4');
		
		System.out.println(sb);
		
	
		
	}

}
