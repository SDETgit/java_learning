package A008_Multithreading;
//| Method                      | Description                                                                                     |
//| --------------------------- | ----------------------------------------------------------------------------------------------- |
//| `start()`                   | Starts a new thread by calling its `run()` method internally.                                   |
//| `run()`                     | Contains the code that the thread will execute. Usually overridden.                             |
//| `sleep(ms)`                 | Pauses the current thread for a specified time in milliseconds.                                 |
//| `join()`                    | Waits for a thread to die (complete execution).                                                 |
//| `isAlive()`                 | Returns `true` if the thread is still running.                                                  |
//| `getName()`                 | Returns the name of the thread.                                                                 |
//| `setName(String name)`      | Sets a name for the thread.                                                                     |
//| `getId()`                   | Returns the thread's ID.                                                                        |
//| `getPriority()`             | Returns the priority of the thread.                                                             |
//| `setPriority(int priority)` | Sets the thread’s priority (1 to 10).                                                           |
//| `currentThread()`           | Returns a reference to the currently executing thread.                                          |
//| `yield()`                   | Hints to the thread scheduler to pause and allow other threads of the same priority to execute. |
//| `interrupt()`               | Interrupts the thread if it is in sleep or waiting state.                                       |
//| `isInterrupted()`           | Checks if the thread has been interrupted.                                                      |

class MyThread2 extends Thread {
	public void run() {
		System.out.println("Run method is executed by thread: " + Thread.currentThread().getName());
	}
}

public class T002_01_Thread_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Runnable task = ()-> {
				System.out.println("thread is running");
			};
			//thread is running

//| `start()`                   | Starts a new thread by calling its `run()` method internally.    
			new Thread(task).start();

//| `run()`                     | Contains the code that the thread will execute. Usually overridden.   
			MyThread2 t = new MyThread2() ; 
			System.out.println("Thread ID: " + t.getId()+" ");
			//Thread ID: 21 
			t.run(); //via start() method run() method is automatically called
			//if we call directly run there will be  No multithreading, runs sequentially
			
			
			//Run method is executed by thread: main
//| `sleep(ms)`                 | Pauses the current thread for a specified time in milliseconds.
			Thread.sleep(2000);
			System.out.println("Current thread slept 2 seconds");
			//Current thread slept 2 seconds
			
//| `join()`                    | Waits for a thread to die which calls the current thread here main thread  (complete execution).  
//It does not pause other threads, like t2			
			Thread t1 = new Thread(() -> {
	            try { Thread.sleep(1000); } catch (Exception e) {}
	            System.out.println("Thread 1 done.");
	        });

	        Thread t2 = new Thread(() -> {
	            try { Thread.sleep(500); } catch (Exception e) {}
	            System.out.println("Thread 2 done.");
	        });
	        System.out.println("Thread ID: " + t.getId()+" "+t2.getId());
	        
	        //Thread ID: 21 23
	        t1.start();
	        t2.start();
	        Thread t3 = Thread.currentThread();
	        System.out.println("Current thread name: " + t3.getName());
	        //Current thread name: main
	        t1.join();  // Main thread waits for t1 to finish
	        Thread t4 = Thread.currentThread();
	        System.out.println("Current thread name: " + t4.getName());
	       //Current thread name: main
	        t2.join();  // Then waits for t2
	        System.out.println("Main thread done.");
	        
	      //output 
	      //thread is running
	      //Run method is executed by thread: main
	      //Current thread slept 2 seconds
	      //Thread 2 done.
	      //Thread 1 done.
	      //Main thread done.
	        //Explanation
	        //join() blocks the thread that calls it — in this case, main.
            //It does not pause other threads, like t2.

//| `isAlive()`                 | Returns `true` if the thread is still running.	        
	        Thread t5 = new Thread(() -> {
	            try { Thread.sleep(1000); } catch (InterruptedException e) {}
	        });
	        t5.start();

	        System.out.println("Is thread alive? " + t5.isAlive());  // true
	        t5.join();
	        System.out.println("Is thread alive after join? " + t5.isAlive());  // false
	       //Is thread alive? true
	       //Is thread alive after join? false
	        
//| `getName()`                 | Returns the name of the thread.     
	        System.out.println("Thread name is before renaming :-" +t.getName()); 
	        t.setName("Worker-Thread");
	        //| `setName(String name)`      | Sets a name for the thread.                                                                     |
	       System.out.println("Thread name is :-" +t.getName()); 
	       
	       //Thread name is before renaming :-Thread-1
	       //Thread name is :-Worker-Thread
//| `getId()`                   | Returns the thread's ID.     
	       System.out.println("Thread ID: " + t.getId()+" "+t2.getId()+" "+t5.getId());
	       //Thread ID: 21 23 24
//| `getPriority()`             | Returns the priority of the thread.  
//by default it is 5 and priority ranges from 0 to 10 	       
	       System.out.println("getPriority()"+" "+t.getPriority()+" "+t2.getPriority()+" "+t5.getPriority());
	       //getPriority() 5 5 5
	       
//| `setPriority(int priority)` | Sets the thread’s priority (1 to 10).       
	       t.setPriority(Thread.MAX_PRIORITY);  // 10
	       t2.setPriority(3);  // 10
	       t5.setPriority(9);
	       System.out.println("getPriority()"+" "+t.getPriority()+" "+t2.getPriority()+" "+t5.getPriority());
	       //getPriority() 10 3 9
//| `currentThread()`           | Returns a reference to the currently executing thread. 
	       Thread t6 = Thread.currentThread();
	        System.out.println("Current thread name: " + t6.getName());
	        //Current thread name: main
//| `yield()`                   | Hints to the thread scheduler to pause and allow other threads of the same priority to execute. |
	        
	        Thread t7 = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                System.out.println("Thread 1 - " + i);
	                Thread.yield();
	            }
	        });

	        Thread t8 = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                System.out.println("Thread 2 - " + i);
	            }
	        });

	        t7.start();
	        t8.start();
	        t7.join();
	        t8.join();
	        
	      //Thread 1 - 0
	      //Thread 2 - 0
	      //Thread 2 - 1
	      //Thread 2 - 2
	      //Thread 1 - 1
	      //Thread 1 - 2
//| `interrupt()`               | Interrupts the thread if it is in sleep or waiting state. 
	        System.out.println("Is thread interrupted "+t.isInterrupted());
	        t.interrupt();  // Interrupts the thread
	       
//| `isInterrupted()`           | Checks if the thread has been interrupted.  
	        System.out.println("Is thread interrupted "+t.isInterrupted());
	        //Is thread interrupted false
	        //Is thread interrupted true
	        interrupted():
	        suspend(): resume():stop():isDaemon():setDaemon
	}

}
