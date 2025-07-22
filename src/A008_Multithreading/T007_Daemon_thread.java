package A008_Multithreading;

//A daemon thread is a low-priority thread that runs in the background to perform supportive 
//tasks for normal (user) threads.
//🔄 It dies automatically when all user (non-daemon) threads finish execution.
//Runs behind main logic (e.g., garbage collection, monitoring).
//Set before .start()	Must be set as daemon before calling start().
//Calling setDaemon(true) after start() throws:
//❌ IllegalThreadStateException
public class T007_Daemon_thread {
	public static void main(String[] args) {
		Runnable task = () -> {
			while (true) {
				System.out.println("Daemon thread is running...");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		};

		Thread t = new Thread(task);
		t.setDaemon(true); // ✅ Set before start
		t.start();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println("Main thread finished.");
		// Daemon thread is running...
		// Daemon thread is running...
		// Daemon thread is running...
		// Daemon thread is running...
		// Main thread finished.

	}

}
