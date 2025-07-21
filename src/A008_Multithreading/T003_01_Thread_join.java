package A008_Multithreading;

public class T003_01_Thread_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(() ->{
			for(int i=0;i<10;i++) { 
			System.out.println("Thread using lambda is running via thread class ..."+i);
			}});
		
		Thread countingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Counting: " + i);
                try {
                    Thread.sleep(500); // 0.5 second delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
		t2.start();
        countingThread.start(); // start the thread

        try {
            countingThread.join(); // main thread waits for countingThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {
        	
        	 System.out.println("Main thread finished after counting thread.1");
             System.out.println("Main thread finished after counting thread.2 ");
             
           //Counting: 1
           //Thread using lambda is running via thread class ...0
           //Thread using lambda is running via thread class ...1
           //Thread using lambda is running via thread class ...2
           //Thread using lambda is running via thread class ...3
           //Thread using lambda is running via thread class ...4
           //Thread using lambda is running via thread class ...5
           //Thread using lambda is running via thread class ...6
           //Thread using lambda is running via thread class ...7
           //Thread using lambda is running via thread class ...8
           //Thread using lambda is running via thread class ...9
           //Counting: 2
           //Counting: 3
           //Counting: 4
           //Counting: 5
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 
           //Main thread finished after counting thread.1
           //Main thread finished after counting thread.2 

        }
       
	}

}
