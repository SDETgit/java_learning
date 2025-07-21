package A007_Exception_Handeling;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Checked exceptions are exceptions that are checked at compile time by compiler red lines 
//If your code can throw a checked exception, the compiler forces you to either:
//Handle it using a try-catch block, or
//Declare it using the throws keyword.

//thows will throw the excpetion but will not handle it 
//while try catch handles the exception while letting know which excpetion is there and runs the next lines of code
//| Exception Class          | Description                         |
//| ------------------------ | ----------------------------------- |
//| `IOException`            | I/O failures (files, streams, etc.) |
//| `SQLException`           | Database access errors              |
//| `ClassNotFoundException` | Class loading issues                |
//| `FileNotFoundException`  | File not found                      |
//| `InterruptedException`   | Thread interruption                 |

public class A001_Checked_exception {

	public static void main(String[] args) throws  FileNotFoundException{
		// TODO Auto-generated method stub
		  
		FileReader fr1 = new FileReader("file.txt");  //handeling via throws
		try {
		  FileReader fr = new FileReader("file.txt");  //henadeling via try catch 
		}
		catch (FileNotFoundException e){
			System.out.println("File not found exception");
		}
		
		 
		 System.out.println("Code after try catch ");
	}
	
//Exception in thread "main" java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
//	at java.base/java.io.FileInputStream.open0(Native Method)
//	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
//	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
//	at java.base/java.io.FileReader.<init>(FileReader.java:60)
//	at A007_Exception_Handeling.A001_Checked_exception.main(A001_Checked_exception.java:26)


}
