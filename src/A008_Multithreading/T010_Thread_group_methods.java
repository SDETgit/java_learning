package A008_Multithreading;

//A Thread Group in Java is a way to group multiple threads together under one umbrella so you can manage them collectively.
//Think of it like a WhatsApp group for threads — instead of messaging each thread individually, you can manage them as a team!
public class T010_Thread_group_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup group = new ThreadGroup("MyGroup");

		Thread t1 = new Thread(group, () -> {
			System.out.println("Thread 1 running ");
		});

		Thread t2 = new Thread(group, () -> {

			System.out.println("Thread 2 running");
		});

		t1.start();
		t2.start();

		// Info about the group
		System.out.println("Active Threads in Group: " + group.activeCount());
		System.out.println("Group Name: " + group.getName());

		// Thread 1 running
		// Thread 2 running
		// Active Threads in Group: 2
		// Group Name: MyGroup

		// Methods
		// 1. group.interrupt(); // Interrupt all threads in the group
		group.interrupt();

		// 2. activeCount() //number of threads in a group
		System.out.println("Active threads: " + group.activeCount()); // Should print 2

		// 3. enumerate() – List all threads in a group
		Thread[] threads = new Thread[group.activeCount()];
		group.enumerate(threads);

		System.out.println("Threads in group:");
		for (Thread t : threads) {
			if (t != null)
				System.out.println(t.getName());
			

		}
		// 4. getName() and getParent()
		ThreadGroup parent = new ThreadGroup("ParentGroup");
		ThreadGroup child = new ThreadGroup(parent, "ChildGroup");

		System.out.println("Child Group Name: " + child.getName());
		System.out.println("Parent Group Name: " + child.getParent().getName());
		//Thread 2 running
		//Thread 1 running 
		//Active Threads in Group: 2
		//Group Name: MyGroup
		//Active threads: 0
		//Threads in group:
		//Child Group Name: ChildGroup
		//Parent Group Name: ParentGroup

	}
}
