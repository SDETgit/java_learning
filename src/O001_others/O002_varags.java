package O001_others;

public class O002_varags {
		
	 public static void foo(int ...arr)
	 {
		 int sum = 0;
		 for(int a: arr) {
			 sum+=a;
		 }
		 
		 System.out.println(sum);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			foo();
			foo(1,2);
			foo(1,2,3,4,5,6,7);
			foo(10010101,1,1,1,1,1);
			
			
			String a = "Hello ";
			
			a = a.concat(a);
			
			System.out.println(a);
	}

}
