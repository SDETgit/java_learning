package A008_Multithreading;
//| Constructor                                   | Description                     |
//| --------------------------------------------- | ------------------------------- |
//| `Thread()`                                    | Default thread                  |
//| `Thread(Runnable)`                            | Thread with task                |
//| `Thread(String)`                              | Thread with custom name         |
//| `Thread(Runnable, String)`                    | Task + name                     |
//| `Thread(ThreadGroup, Runnable)`               | Group + task                    |
//| `Thread(ThreadGroup, String)`                 | Group + name                    |
//| `Thread(ThreadGroup, Runnable, String)`       | Group + task + name             |
//| `Thread(ThreadGroup, Runnable, String, long)` | Group + task + name + stackSize |

public class T002_02_Thread_constructor {

	public static void main(String[] args) {
		//| Constructor                                   | Description                     |
		//| --------------------------------------------- | ------------------------------- |
		//| `Thread()`                                    | Default thread                  |
		Thread t = new Thread()  {
		    public void run() {
		        System.out.println("Thread using default constructor");
		    }
		};
		
		t.start();
		
			//Thread using default constructor
		
		//| `Thread(Runnable)`                            | Thread with task                |
		Runnable  task = ()-> {
			System.out.println("Thread via runnable interface");
		};
		
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println(t1.getName());
			//Thread-1
			//Thread via runnable interface
		
		//| `Thread(String)`                              | Thread with custom name         |
		
		Thread t2 = new Thread("MyThread")  {
			public void run() {
			System.out.println("Thread name: "+getName());}
		};
		
		t2.start();
			//Thread name: MyThread
		//| `Thread(Runnable, String)`                    | Task + name                     |
			Runnable task2 = () ->{
				System.out.println("Thread running via ruunbale task2");
			};
			
			Thread t3 = new Thread(task2,"WorkerThread");
			t3.start();
			try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t3.getName());
			
			//Thread running via ruunbale task2
			//WorkerThread
		//| `Thread(ThreadGroup, Runnable)`               | Group + task                    |
			ThreadGroup group3 = new ThreadGroup("Group3");
			Runnable task3 = () -> {
				System.out.println("Thread via task3 via runnable and  Threadgroup ");
			};
			
			Thread t4  = new Thread(group3,task3);
			t4.start();
			//Thread via task3 via runnable and  Threadgroup 
		//| `Thread(ThreadGroup, String)`                 | Group + name                    |
			ThreadGroup group4 = new ThreadGroup("Group4");
			Thread t5 = new Thread (group4,"Thread4") {
				
			};
		//| `Thread(ThreadGroup, Runnable, String)`       | Group + task + name             |
			ThreadGroup group5 = new ThreadGroup("MyGroup");
			Runnable task5 = () -> System.out.println("Group + Runnable + Name");
			Thread t6 = new Thread(group5, task5, "ComboThread");
			t6.start();
			//Group + Runnable + Name
		//| `Thread(ThreadGroup, Runnable, String, long)` | Group + task + name + stackSize |
			ThreadGroup group = new ThreadGroup("MyGroup");
			Runnable task7 = () -> System.out.println("Thread with stack size");
			Thread t7 = new Thread(group, task7, "StackThread", 1024);
			t7.start();
			//Thread with stack size
			
			//the stackSize parameter is a suggestion to the JVM 
			//for how much memory (in bytes) should be allocated to the call stack of that thread.
	}

}
