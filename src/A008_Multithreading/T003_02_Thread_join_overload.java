package A008_Multithreading;
//Thread class provides three overloaded join() methods to allow one thread to wait for another to finish
//| Method                | Use Case                                                  |
//| --------------------- | --------------------------------------------------------- |
//| `join()`              | Wait until thread completes (synchronously)               |
//| `join(millis)`        | Wait with timeout, useful when thread might hang or delay |
//| `join(millis, nanos)` | Precise timeout control, rarely needed in most cases      |

public class T003_02_Thread_join_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//| `join()`              | Wait until thread completes (synchronously)               |
			Thread t1 = new Thread(() -> {
				for(int i=0;i<3;i++) {
					System.out.println("Thread t1 : "+i);
				}
			});
			
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main thread after t1 is done.");
			
			//Without Join 
			//Main thread after t1 is done.
			//Thread t1 : 0
			//Thread t1 : 1
			//Thread t1 : 2
			
			//With join 
			//Thread t1 : 0
			//Thread t1 : 1
			//Thread t1 : 2
			//Main thread after t1 is done.
			
			//| `join(millis)`        | Wait with timeout, useful when thread might hang or delay |
			Thread t2 = new Thread(() ->{
				for(int i=0;i<3;i++)
				{
					System.out.println("Thread t2: "+i);
				}
			});
			
			t2.start();
			try {
				t2.join(1000);
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Main thread resumes after 1 sec or when t2 finishes.");

			//Thread t2: 0 
			//Thread t2: 1
			//Thread t2: 2
			//Main thread resumes after 1 sec or when t2 finishes. //Here main output came after 1.5 seconds delay 
			
			//| `join(millis, nanos)` | Precise timeout control, rarely needed in most cases      |
			Thread t3 = new Thread(() -> {
			    for (int i = 1; i <= 5; i++) {
			        System.out.println("Thread t3: " + i);
			        try { Thread.sleep(400); } catch (Exception e) {}
			    }
			});

			t3.start();
			try {
				t3.join(1000, 500000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // Wait for 1 sec + 0.5 ms

			System.out.println("Main thread resumes after time limit or t3 finishes.");
			
			//Thread t3: 1
			//Thread t3: 2
			//Thread t3: 3
			//Main thread resumes after time limit or t3 finishes.
			//Thread t3: 4
			//Thread t3: 5
	}

}
