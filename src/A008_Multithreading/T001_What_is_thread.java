package A008_Multithreading;

//In Java, a thread is a lightweight subprocess — it’s the smallest unit of execution in a program.
//Threads cna be created via 4 types via 
//via Thread class 
class MyThread extends Thread {
	@Override
	public void run() 
	{
		System.out.println("Thread is running via Thread class ");
	}
}

//via Runnable interface (preffered as we can do inheritance here via Thread class not possible)
 
class MyRunnable implements Runnable {
	@Override 
	public void run() {
		System.out.println("Thread is running via Runnable class ");
	}
}

 

public class T001_What_is_thread {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();  //starts the thread internally calls run() 
		
		Thread t1 = new Thread(new MyRunnable());
		t1.start();

		
		
//Via Lambda Expression via Thread class 
		Thread t3 = new Thread(() -> {
			 System.out.println("Thread using lambda is running via thread class ...");
			 
			 try {
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e)
			 {
				 e.printStackTrace();
			 }
	            System.out.println("Thread finished.");

		});
		
		t3.start();
		
//Lambda expression Via runnable interface so clean and small syntax 
		Runnable task1 = () -> {
			System.out.println("Task 1 is running via Lambda via runnable interface...");
		};
		
		Runnable task2 = () -> {
			System.out.println("Task 2 is running via Lambda via runnable interface...");
		};
		
		new Thread(task1).start();
		new Thread(task2).start();
//
		Thread t5 = new Thread("NewThread5") {
			public void run() {
				System.out.println("New expression to Createthread ");
			}
		};
		t5.start();
	}

}
