package A008_Multithreading;
//🔹 start() method
//Defined in Thread class.
//Starts a new thread of execution.
//Internally calls the run() method on a new call stack.
//✅ Multithreading happens here.
public class T006_run_vs_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start() 
		Thread t = new Thread(() ->{
			System.out.println("Inside run : "+Thread.currentThread().getName());
		});
		
		t.start();
		
		System.out.println("Main Thread : "+Thread.currentThread().getName());
		
		//Inside run : Thread-0
		//Main Thread : main
		
		// run() method
		//If you call run() directly, it runs like a normal method.
		//No new thread is created.
		//🚫 No multithreading happens.
		
		Thread t1 = new Thread(() -> {
			System.out.println("Inside thread t1 "+Thread.currentThread().getName());
		});
		
		t1.run(); //Runs method only no multhreading 
		
		System.out.println("Main thread t1 "+Thread.currentThread().getName());
		
		//Inside thread t1 main
		//Main thread t1 main
	}

}
