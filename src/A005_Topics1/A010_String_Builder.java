package A005_Topics1;

//String builder are immutable, but not synchronized means not thread safe
//performance is faster than String buffer
//Allows to modify content without creating new objects
//Ideal for single-threaded applications

//| Feature     | String                      | StringBuffer          | StringBuilder       |
//| ----------- | --------------------------- | --------------------- | ------------------- |
//| Mutable     | ❌ No                       | ✅ Yes                | ✅ Yes               |
//| Thread-Safe | ✅ Yes                      | ✅ Yes                | ❌ No                |
//| Performance | Slow (new object each time) | Slower (synchronized) | Fastest (no sync)   |
//| Use Case    | Constant string             | Multithreaded ops     | Single-threaded ops |


public class A010_String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder() ;
		StringBuilder sb2 = new StringBuilder(5) ;
		StringBuilder sb3 = new StringBuilder("Hello") ;
		StringBuilder sb4 = new StringBuilder("This is char sequence") ;
		
		System.out.println(sb2.capacity()+" "+sb2.length()); //5 0
		
		sb2.append("123456789");
		System.out.println(sb2.capacity()+" "+sb2.length()); //12 9  //capacity modifies itself 
		
		sb2.insert(0, false);
		
		System.out.println(sb2); //false123456789
		
		sb2.repeat(sb4, 5);
		System.out.println(sb2); //false123456789This is char sequenceThis is char sequenceThis is char sequenceThis is char sequenceThis is char sequence
		
		sb2.delete(10, 1000);
		System.out.println(sb2);// false12345
		
		sb2.reverse();
		
		System.out.println(sb2); //54321eslaf
		
		System.out.println(sb2.compareTo(sb4)); //-31
		
		System.out.println(sb2.substring(2)); //321eslaf
		
		System.out.println(sb2.substring(0, 3)); //543
		
		System.out.println(sb2.indexOf("1")); //4
		
		System.out.println(sb2.lastIndexOf("a")); //8
	}

}
