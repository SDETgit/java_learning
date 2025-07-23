package A009_Java_topics2;

//java.lang.runtime class allows our java programm to intereact with JVM controlling query and runtime 
//beahviour like memory, running external process or shutting down JVM


//| Method                         | Description                                |
//| ------------------------------ | ------------------------------------------ |
//| `exec(String command)`         | Runs an external OS command  opens notepad              |
//| `gc()`                         | Suggests the JVM to run garbage collection |
//| `freeMemory()`                 | Returns current free memory in bytes       |
//| `totalMemory()`                | Total memory in the JVM                    |
//| `maxMemory()`                  | Maximum memory JVM can use                 |
//| `addShutdownHook(Thread hook)` | Adds a thread to run on JVM shutdown       |
//| `exit(int status)`             | Terminates the JVM with exit code          |

public class A003_Java_Runtime_Class {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		    System.out.println("Free memory: " + rt.freeMemory());
	        System.out.println("Total memory: " + rt.totalMemory());
	        System.out.println("Max memory: " + rt.maxMemory());

	        // Suggest garbage collection
	        rt.gc();
	        System.out.println("After GC, Free memory: " + rt.freeMemory());
	      //Free memory: 132348936
	      //Total memory: 134217728
	      //Max memory: 2120220672
	      //After GC, Free memory: 7495376
	        
	        // Example 2: Running an External Command
	        try {
	            Process p = Runtime.getRuntime().exec("notepad"); // Opens Notepad in windows 
	            // For Mac/Linux: use "open -a TextEdit" or "gedit"
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        //Run time with Shutdown hook 
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            System.out.println("JVM shutting down. Cleaning up resources...");
	        }));

	        System.out.println("Application is running...");
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {}
	        System.out.println("Exiting now.");
	        System.exit(0);
	        
	      //Application is running...
	      //Exiting now.
	      //JVM shutting down. Cleaning up resources...
	}

}
