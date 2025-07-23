package A001_OOPS_Inheritance;

public class I008_upcasting_downcasting {

	public static void main(String[] args) {
	
		Parent1 m2 = new Child1(); // upcasting

		m2.print();

		animal a = new cat();
		cat c = (cat) a; // down casting

		c.sound();

		// Overiding M1
		// Meeo Meeo
	}

}
