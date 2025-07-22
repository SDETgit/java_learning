package A008_Multithreading;
//🔴 Rule:
//Once a thread has been started, you cannot call .start() on it again — doing so will throw a:
//
//✅ IllegalThreadStateException
//If you need to run the same code again, you must create a new Thread object with the same Runnable.
public class T005_can_start_thread_twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(() -> {
			System.out.println("Thread T1 : ");
		});
		
		t.start();
		t.start();
		//Thread T1 : 
		//Exception in thread "main" java.lang.IllegalThreadStateException
//			at java.base/java.lang.Thread.start(Thread.java:1525)
//			at A008_Multithreading.T005_can_start_thread_twice.main(T005_can_start_thread_twice.java:12)

	}

}
