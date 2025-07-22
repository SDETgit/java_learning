package A008_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//A Thread Pool is a collection of pre-created worker threads that are ready to execute tasks. 
//Instead of creating a new thread every time you want to perform a task, 
//you reuse existing threads from the pool.
//Imagine a restaurant kitchen:
//You have 5 chefs (threads).
//Customers (tasks) place orders.
//You don’t hire a new chef for every order.
//The same chefs handle new orders as they become free.
//This is what a thread pool does — it reuses a fixed number of threads to execute many tasks.
public class T008_thread_pool_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService pool = Executors.newFixedThreadPool(2); // Only 2 threads

// 3 simple tasks
		pool.execute(() -> System.out.println("Task 1 by " + Thread.currentThread().getName()));
		pool.execute(() -> System.out.println("Task 2 by " + Thread.currentThread().getName()));
		pool.execute(() -> System.out.println("Task 3 by " + Thread.currentThread().getName()));

		pool.shutdown();

// ✅ Create a thread pool with 2 threads
		ExecutorService pool1 = Executors.newFixedThreadPool(2);

// ✅ Convert thread logic into Runnable tasks
		Runnable task1 = new Runnable() {
			public void run() {
				System.out.println("New thread t");
			}
		};

		Runnable task2 = new Runnable() {
			public void run() {
				System.out.println("New thread t2");
			}
		};

// ✅ Submit tasks to thread pool
		pool1.execute(task1);
		pool1.execute(task2);

// ✅ Always shutdown the pool when done
		pool.shutdown();
		// Task 2 by pool-1-thread-2
		// Task 3 by pool-1-thread-2
		// Task 1 by pool-1-thread-1
		// New thread t
		// New thread t2
// 🔹 Create a thread pool2 with 2 fixed threads
		ExecutorService pool2 = Executors.newFixedThreadPool(2);

// 🔹 Submit multiple tasks to the thread pool2
		for (int i = 1; i <= 5; i++) {
			final int taskId = i;

			// Using Runnable Lambda for simplicity
			pool2.execute(() -> {
				System.out.println("Task " + taskId + " is running by " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000); // Simulate some work
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Task " + taskId + " was interrupted.");
				}
			});
		}

// 🔹 Shutdown the thread pool2 gracefully
		pool2.shutdown();

		try {
			// 🔹 Wait for all tasks to finish or timeout after 10 seconds
			if (!pool2.awaitTermination(10, TimeUnit.SECONDS)) {
				pool2.shutdownNow(); // Force shutdown if tasks not finished
			}
		} catch (InterruptedException e) {
			pool2.shutdownNow();
		}

		System.out.println("All tasks submitted.");
		//Task 2 is running by pool-3-thread-2
		//Task 1 is running by pool-3-thread-1
		//Task 3 is running by pool-3-thread-2
		//Task 4 is running by pool-3-thread-1
		//Task 5 is running by pool-3-thread-1
		//All tasks submitted.

	}

}
