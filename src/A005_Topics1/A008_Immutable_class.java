package A005_Topics1;
///An immutable class in Java is a class whose objects cannot be modified after creation.
//✅ Key Characteristics of an Immutable Class
//1. Class is marked as final (to prevent subclassing).
//2. All fields are private and final.
//3. No setter methods.
//4. Defensive copies are made for mutable objects (like arrays or collections).
//5. All initialization is done via constructor.

public final class A008_Immutable_class {
	 private final String name; 
	 private final int age; 
	 
	 public A008_Immutable_class (String name, int age) {
		 this.name= name;
		 this.age = age;
	 }
	 
	 //There are no setters 
	 public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A008_Immutable_class p = new A008_Immutable_class("Ram",30);
		
		System.out.println(p.name+" "+p.age);
	}

}
