package A008_Multithreading;

//Thread lifecycle 

//+-----------+
//|   New     |  --> Created using new Thread()
//+-----------+
//   |
//   | start()
//   v
//+-----------+
//| Runnable  |  --> Waiting for CPU
//+-----------+
//   |
//   | (CPU picks)
//   v
//+-----------+
//| Running   |  --> run() executing
//+-----------+
///   |   \
///    |    \
//Blocked|Waiting|Timed Waiting
//  \    |    /
//   \   v   /
//    +----------+
//    | Terminated|
//    +----------+

public class T004_Thread_lifecycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			System.out.println("Thread is running ");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println("Thread Completed ");
		});

		System.out.println("Thread state: " + t.getState()); // NEW

		t.start();
		System.out.println("Thread state after start: " + t.getState()); // RUNNABLE

		// Running --> run() executing
		// Thread is picked by CPU and executing run().
		// You can’t control this directly — JVM scheduler decides.
		Thread.sleep(1000);
		System.out.println("Thread state While Sleeping " + t.getState()); // TIMED_WAITING

		t.join();
		System.out.println("Thread state after finish: " + t.getState()); // TERMINATED

		// Thread state: NEW
		// Thread state after start: RUNNABLE
		// Thread is running
		// Thread state While Sleeping TIMED_WAITING
		// Thread Completed
		// Thread state after finish: TERMINATED

//+---------------------Waiting-------------------------+//
		Thread t1 = new Thread(() -> {
			System.out.println("Thread 1 running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 1 finished.");
		});

		t1.start();
		t1.join(); // main thread is in WAITING state until t1 finishes

		System.out.println("Main thread resumes.");

		// Thread 1 running...
		// Thread 1 finished.
		// Main thread resumes

//+-------------------Blocked--------------------------+//
		Object lock = new Object();
		Thread t3 = new Thread(() -> {
			synchronized (lock) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1 released lock.");
			}
		});

		Thread t4 = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Thread 2 acquired lock.");
			}
		});

		t3.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		t4.start(); // t4 will be BLOCKED until t3 releases lock
		// 🔒 BLOCKED = waiting to get a lock
		// Thread says: “I want to enter, but someone else has the key!”
		//
		// ⏳ WAITING = waiting for a signal (notify/join)
		// Thread says: “I’ll just sit here until someone tells me to wake up.”
	}

}
