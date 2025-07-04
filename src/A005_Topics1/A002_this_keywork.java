package A005_Topics1;

//Helps to distinguish between local and instance variable 

class person {
	
	String name ; 
	
	person(String name )
	{
		this.name = name;
	}
}

//Helps to set values in constructor 

class rectangle {
	int x,y,w,h;
	
	rectangle() { this(0,0,1,1);	}
	
	rectangle(int w,int h) {this(0,0,w,h);}
	
	rectangle(int x,int y,int w,int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
}

public class A002_this_keywork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle p = new rectangle() ;
		
		rectangle p1 = new rectangle(2,3) ;
		
		rectangle p2 = new rectangle(2,3,5,6) ;
		
		System.out.println(p.x+" "+p.y+" "+p.w+" "+p.h);
		
		System.out.println(p1.x+" "+p1.y+" "+p1.w+" "+p1.h);
		
		System.out.println(p2.x+" "+p2.y+" "+p2.w+" "+p2.h);
		
		
		person p3 = new person("Irfan");
		
		System.out.println(p3.name);
	}

}
