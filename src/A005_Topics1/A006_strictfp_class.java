package A005_Topics1;

public strictfp  class A006_strictfp_class {
	    static double a = 1e300;
	    static double b = 1e-300;
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 10e+100;
        double num2 = 6e+08;
        double result = num1 * num2;

        System.out.println("Result: " + result); //5.9999999999999995E109
        										 //5.9999999999999995E109
	
        System.out.println((a * b) * b); // May differ on old systems
        System.out.println(a * (b * b)); // May differ on old systems
        
        //1.0E-300
        //0.0
	//As many platforms already follow IEEE 754 standard strictly by default, there wont be 
        //much difference in results 
      //| Situation                            | Effect of `strictfp`                        |
      //| ------------------------------------ | ------------------------------------------- |
      //| Modern JVM on 64-bit Intel CPU       | Usually **no visible difference**           |
      //| Cross-platform scientific app        | ✅ Ensures **portable, predictable** results |
      //| Using old JVM / x87 math coprocessor | May see **differences without `strictfp`**  |

	}

}
