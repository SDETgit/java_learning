package A004_OOPS_Encapsulation;

class person {
	private String name ;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
		this.name = name;}
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;}
	}
	 
	
}

public class E001_getters_setters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new person() ;
		
		p.setAge(10);
		System.out.println(p.getAge());
		p.setName("");
		System.out.println(p.getName());
		
		//10
		//null
	}

}
