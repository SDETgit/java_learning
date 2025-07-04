package A001_OOPS_Inheritance;

class parent {
	 public void displayParent() {
		 System.out.println("Parent class");
	 }
}

interface father {
	public void show();
}

interface mother {
	public void print() ;
}


 class child extends parent implements father, mother {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Mother and father are present ");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing them");
	}
	
	
	public void displaychild() {
		System.out.println("Child display");
	}
	
}

public class I005_Hybrid_Inheritance {
		
	public static void main(String[] args) {
		
		child c = new child () ;
		c.displayParent();
		c.displaychild();
		c.show();
		c.print();
		
		
	}}


