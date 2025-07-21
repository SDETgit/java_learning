package A003_OOPS_Abstraction;
interface Drivable {
    void drive();
    static void service() {
        System.out.println("Servicing vehicle");}
    
    default void start() {
        System.out.println("Vehicle is starting");
        
        
} } 
class Bike implements Drivable {

	@Override
	public void drive() {
		
		System.out.println("Bike pedaling"); 
	}
	  public void start() {
	        System.out.println("Vehicle is starting bike");
   
}
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("Servicing vehicle bike");
	}
}

 interface shape{
	//implicitly it is public static and Final 
	 final static public String lable = "Shape";
	void draw() ;
	double getArea() ;
}
 
 class circle implements shape {

	 double radius ;
	 
	 void radius (double r) {
		 radius = r;
	 }
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	 
 }

public class A002_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike() ;
		
		b.drive();
		b.service();
		b.start();
		
		circle c = new circle() ;
		
		c.draw();
		c.radius(1);
		
		System.out.println(c.getArea());
		//Bike pedaling
		//Servicing vehicle bike
		//Vehicle is starting bike
		//Drawing circle
		//3.141592653589793

	}

}
