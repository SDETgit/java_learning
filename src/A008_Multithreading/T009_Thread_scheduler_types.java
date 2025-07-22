package A008_Multithreading;
//In Java, the Thread Scheduler is a part of the Java Virtual Machine (JVM) that determines 
//which thread to run at a given time when multiple threads are in the Runnable state. While 
//Java itself doesn't give direct control over the thread scheduler,
//understanding its types and behavior helps in writing more efficient multi-threaded programs

//🔹 What is a Thread Scheduler?
//It decides which thread from the Runnable pool will get CPU time.
//It is OS-dependent (platform-specific).
//It uses various scheduling algorithms, often non-deterministic

//While Java doesn’t let you choose a scheduler, underlying OS-level schedulers typically use these strategies.
//| Scheduler Type                     | Description                                                                          |
//| ---------------------------------- | ------------------------------------------------------------------------------------ |
//| **First-Come-First-Served (FCFS)** | Threads are scheduled in the order they arrive.                                      |
//| **Time-Slicing (Round Robin)**     | Each thread gets a fixed time slice (quantum) to run, then it’s moved back to queue. |
//| **Priority-Based Scheduling**      | Higher priority threads get preference over lower priority ones.                     |
//| **Preemptive Scheduling**          | A higher priority thread can preempt a lower one at any time.                        |
//| **Multilevel Queue Scheduling**    | Threads are divided into different queues based on type/priority.                    |

public class T009_Thread_scheduler_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable task = () -> {
	            for (int i = 0; i < 3; i++) {
	                System.out.println(Thread.currentThread().getName());
	            }
	        };

	        Thread t1 = new Thread(task);
	        Thread t2 = new Thread(task);

	        t1.setPriority(Thread.MIN_PRIORITY);
	        t2.setPriority(Thread.MAX_PRIORITY);

	        t1.start();
	        t2.start();
	      //Thread-1
	      //Thread-1
	      //Thread-1
	      //Thread-0
	      //Thread-0
	      //Thread-0

	}

}
