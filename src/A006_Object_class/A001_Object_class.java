package A006_Object_class;
//Shallow Cloning – copies object and references (not the referenced objects)

//Deep Cloning – copies object and all referenced objects recursively

//Shallow cloning 
class Person implements Cloneable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//Deep cloning 
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int roll;
    Address address;

    Student(int roll, Address address) {
        this.roll = roll;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Address newAddress = new Address(this.address.city); // deep copy
        return new Student(this.roll, newAddress);
    }
}

public class A001_Object_class {
	
	 int id;
	    String name;

	    A001_Object_class(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Overriding toString()
	    public String toString() {
	        return id + " - " + name;
	    }

	    // Overriding equals()
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        A001_Object_class other = (A001_Object_class) obj;
	        return id == other.id && name.equals(other.name);
	    }

	    // Overriding hashCode()
	    public int hashCode() {
	        return id * 31 + name.hashCode();
	    }

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A001_Object_class obj1 = new A001_Object_class(1, "John");
		A001_Object_class obj2 = new A001_Object_class(1, "John");

	        System.out.println(obj1.toString());         // Output: 1 - John
	        System.out.println(obj1.equals(obj2));       // Output: true
	        System.out.println(obj1.hashCode());         // Output: unique int
	        
	        //SHallow cloning 
	        Person p1 = new Person(101, "Alice");
	        Person p2 = (Person) p1.clone();

	        System.out.println(p1.id + " " + p1.name);
	        System.out.println(p2.id + " " + p2.name);
	        //101 Alice
	        //101 Alice
	        
	        //Deep cloning 
	        Student s1 = new Student(1, new Address("Delhi"));
	        Student s2 = (Student) s1.clone();

	        s2.address.city = "Mumbai";

	        System.out.println(s1.address.city);  // Delhi
	        System.out.println(s2.address.city);  // Mumbai
	}

}
