package A009_Java_topics2;

//Special mechanism where a piece of code is running As soon as the main method is done and just before JVM shuts down 	
//Releasing resources (closing DB, files, network)
//Logging shutdown
//Saving application state
//Cleanup tasks
public class A001_Java_Shutdown_hook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(new Thread (() ->{
			 System.out.println("Shutdown hook executed: Cleaning up...");
		}));
		
		  System.out.println("Main application is running...");
	        
	        try {
	            Thread.sleep(3000); // Simulate some work
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main method completed.");
	      //Main application is running...
	      //Main method completed.
	      //Shutdown hook executed: Cleaning up...
	        
	        
	        
	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            System.out.println("Shutdown hook: Cleanup before JVM exits...");
	        }));

	        System.out.println("Press Ctrl+C to exit...");

	        // Keeps the app alive
	        try {
	            Thread.sleep(3000); // Simulate work
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.exit(0); // Graceful shutdown
	        
	      //Main application is running...
	      //Main method completed.
	      //Press Ctrl+C to exit...
	      //Shutdown hook: Cleanup before JVM exits...
	      //Shutdown hook executed: Cleaning up...

	}

}
