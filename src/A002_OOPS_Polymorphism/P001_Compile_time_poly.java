package A002_OOPS_Polymorphism;

class Multiplier {
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    
    int multiply (int a , int b , int c) {
    	return a*b*c;
    }
}
public class P001_Compile_time_poly {

	public static void main(String[] args) {
		
		Multiplier m = new Multiplier();
		
		System.out.println(m.multiply(2.1, 2.4));  //Here double method is called 
		System.out.println(m.multiply(96, 63));      // here int method is called 
		System.out.println(m.multiply(96, 63,1));
	}

}
