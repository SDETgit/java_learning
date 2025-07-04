package A001_OOPS_Inheritance;

interface  print {
	default void print() {
		int a ;
	};
}

interface show {
	void show() ;
	
	default void print() {
		int a ;
	};
}

class a implements print, show{

	@Override
	public void show() {
		System.out.println("Showing");
		
	}

	@Override
	public void print() {
		System.out.println("Printing");
		
	}
	
}

public class I004_Multiple_Inheritance {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a a1 = new a() ;
		
		a1.print();
		a1.show();
		
		
		
	}}


