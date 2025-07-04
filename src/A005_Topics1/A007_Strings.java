package A005_Topics1;

import java.util.Arrays;

//Sequecne of characters used to represent text java.lang package 
//immutable in nature cannot be changed once created 

public class A007_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String s2 = new String ("Hello");
		
		//methods 
		
		System.out.println(s.length()); //5
		System.out.println(s.charAt(2)); //l
		System.out.println(s.substring(1));//ello
		System.out.println(s.substring(0,2));//He
		System.out.println(s.toLowerCase());//hello
		System.out.println(s.toUpperCase());//HELLO
		
		System.out.println(s.equals(s2)); //true
		System.out.println(s.equalsIgnoreCase(s2)); //true
		System.out.println(s.contains("llo")); 	//true
		System.out.println(s.replace("l","pp")); //heppppo
		
		String s3 = " This text contains spaces "; 
		System.out.println(s3.trim()); //This text contains spaces
		
		String s4 = "This/ text/ is/ comma/ separated ";
		
		String[] a = s4.replace(" ","").split("/");
		
		System.out.println(Arrays.toString(a)); //[This, text, is, comma, separated]
		
		String g = "Hello ".concat(" World");
		
		System.out.println(g.concat(" ").concat(s)); //Hello  World Hello
		
		
		// ==========<< isEmpty() and isBlank() >>============

		System.out.println(s.isBlank());//false //String is empty or only whitespace
		System.out.println(s.isEmpty());//false //String has zero length
		
		String e1 = "";
		String e2 = "   ";

		System.out.println(e1.isEmpty()); // true
		System.out.println(e2.isEmpty()); // false
		
		String b1 = "";
		String b2 = "   ";
		String b3 = "\n\t";

		System.out.println(b1.isBlank()); // true
		System.out.println(b2.isBlank()); // true
		System.out.println(b3.isBlank()); // true

		// ==========<< startsWith(String prefix) and endsWith(String suffix) >>============
		
		String w = "This is a text";
		
		System.out.println(w.startsWith("Th"));
		System.out.println(w.endsWith("t"));
		
		// ==========<< replace(CharSequence target, CharSequence replacement) >>============
		// ==========<< replaceAll(String regex, String replacement) >>============
		String re = "apple apple apple";
		String result = re.replace("apple", "banana");
		System.out.println(result); // banana banana banana
		
		String re1 = "apple123apple456";
		String result2 = re1.replaceAll("\\d+", "-");
		System.out.println(result2); // apple-apple-
		
		//| Feature         | `replace()` | `replaceAll()`                        |
		//| --------------- | ----------- | ------------------------------------- |
		//| Accepts Regex   | ❌ No        | ✅ Yes                                 |
		//| Literal Replace | ✅ Yes       | ❌ Must escape special characters      |
		//| Performance     | 🚀 Faster    | 🐢 Slower (uses regex engine)         |
		//| Exception Risk  | 🚫 Low       | ⚠️ Can throw `PatternSyntaxException` |

		String d = "1 + 1 = 2";

		// Using replace — works fine
		System.out.println(d.replace("+", "plus")); // 1 plus 1 = 2

		// Using replaceAll — throws exception if "+" isn't escaped (because + is regex)
		//System.out.println(d.replaceAll("+", "plus")); // ❌ PatternSyntaxException
		System.out.println(d.replaceAll("\\+", "plus")); // ✅ 1 plus 1 = 2
		
		//==========<< indexOf(String str), lastIndexOf(String str) >>============
		
		String i = "This is a text ";
		
		System.out.println(i.indexOf('t'));
		System.out.println(i.lastIndexOf('t'));
		
		//==========<< matches(String regex) >>============
		
		    String str1 = "hello123";
	        String str2 = "12345";
	        String str3 = "HELLO";
	        
	        // Check if str1 contains only letters and numbers
	        System.out.println(str1.matches("[a-zA-Z0-9]+"));  // true

	        // Check if str2 contains only digits
	        System.out.println(str2.matches("\\d+"));          // true

	        // Check if str3 contains only uppercase letters
	        System.out.println(str3.matches("[A-Z]+"));        // true

	        // Check if str1 is exactly "hello"
	        System.out.println(str1.matches("hello"));         // false

	      //==========<< toCharArray() >>============
	        String arr ="To char array";
	        
	        char[] ch = arr.toCharArray();
	        
	        System.out.println(Arrays.toString(ch)); //[T, o,  , c, h, a, r,  , a, r, r, a, y]
	        
	        //==========<< split() >>============
	        
	        String [] arr2= arr.split(" ");
	        System.out.println(Arrays.toString(arr2)); //[To, char, array]
	        
	        String arr3 = "To, char, array";
	        
	        String [] arr4 = arr3.split(", ");
	        
	        System.out.println(Arrays.toString(arr4)); //[To, char, array]ddddd
	}

}
