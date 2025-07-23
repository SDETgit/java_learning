package O001_others;

import A005_Topics1.A005_access_modifiers;

public class O003_access_modifier_support extends A005_access_modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O003_access_modifier_support p = new O003_access_modifier_support() ;
		
		p.startengine();
	//	p.startengine2();  protected wont be visible //here O003_access_modifier_support is not a sub class 
	//	p.startengine3();  default wont be visible  
	//	p.startengine4();  private wont be visible
		
	//when making it a sub class 
		
		p.startengine2();  
	  //p.startengine3();  
	  //p.startengine4(); 
			
		 Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	            System.out.println("Shutdown hook: Cleanup before JVM exits...");
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {}
	        }));

	        System.out.println("App running. Press Ctrl+C to exit.");

	        // Keeps app running to test Ctrl+C
	        try {
	            Thread.sleep(60000);  // 1 minute
	        } catch (InterruptedException e) {}
	}

}
