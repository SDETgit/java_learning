package A005_Topics1;

//A Singleton class in Java is a class that allows only one object 
//(instance) to be created throughout the application’s lifetime.

class singleton {
	private static singleton instance;

	// private constructor prevents instantiation from other classes
	private singleton() {
	}

	public static singleton getInstance() {
		if (instance == null) {
			instance = new singleton(); // lazy instanctiation
		}

		return instance;
	}

	// Thread safe
	public static singleton getInstanceThreaSafe() {
		if (instance == null) {
			synchronized (singleton.class) {
				if (instance == null) {
					instance = new singleton();
				}
			}
		}
		return instance;
	}
}

public class A004_singleton_design_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
