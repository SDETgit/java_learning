package A001_OOPS_Inheritance;

class a1 {
	
	
	String name = "A1 string";
	
	void makesound() {
		System.out.println("A1 sound ");
	}
}

class b1 extends a1 {
	
	String name = "B1 String";
	
	@Override
	void makesound() {
		super.makesound();
		System.out.println("b11 sound ");
	}
	void displayName() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	
}

//Constructor 
class box {
	private double width , heigth, depth;
	
	box(double w,double h,double d) {
		width = w;
		heigth =h;
		depth =d;
		
	}
}

class boxweight extends box {
	double mass;  //Due to inheritance no need to again define the defined variables 
	
	boxweight(double w, double h, double d, double m) { 
		super(w, h, d);
		// TODO Auto-generated constructor stub
		mass =m;
	}
	
}



public class I009_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Accesing variable from parent class having same name in both class
		b1 b = new b1();
		b.displayName();
		
		System.out.println(b.name);
		System.out.println(b.name);
		
		
		//accessing methods 
		b.makesound();

	}

}
