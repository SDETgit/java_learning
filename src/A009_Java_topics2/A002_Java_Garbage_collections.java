package A009_Java_topics2;

//Garbage Collection (GC) is the process by which Java automatically deallocates memory by 

//destroying objects that are no longer in use, so you don't have to manually free() memory
//This prevents memory leaks and OutOfMemoryError
//🧠 Why Is It Needed?
//Java creates many objects at runtime (e.g., new Student()).
//When an object is no longer reachable (i.e., no reference is pointing to it), 
//it becomes eligible for garbage collection.

//When Does GC Happen?
//Automatically by JVM when:
//Memory is low
//CPU is idle
//You call System.gc() (only a suggestion, JVM may ignore)

//Eligibility for GC (How JVM knows to collect?)
//An object is eligible for GC if:
//It's not reachable from any live thread or static reference.
//All references to it are gone or set to null.
public class A002_Java_Garbage_collections {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collected for object");}
	
	// finalize() is called before object is garbage collected (deprecated in Java 9+).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		s = null; // "Hello" is now eligible for GC
		// Suggest JVM to run GC
		System.gc();

		System.out.println("Main finished");
	}

}
