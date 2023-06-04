package superthiskeyword;

public class SuperConcept {
	
	 public String name="Sneha";
	
	public int age;
	public String city;
	public SuperConcept() {
		System.out.println("superclass default constrctor");
	}
	
	public SuperConcept(String name, int age, String city) {
		this.name=name; 
		this.age = age;
		this.city = city;
	}

	public SuperConcept(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Super class " +name +" " +age );
	}
	
	public SuperConcept(String name) {
		this.name=name;
	}
	
	public final void addCalc(int a ,int b) {
		int c=a-b;
		System.out.println(c);
	}
	

}
