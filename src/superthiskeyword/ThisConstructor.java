package superthiskeyword;

public class ThisConstructor extends SuperConcept{
	
	private String name="Saniha";
	 public void getName() {
		 System.out.println(super.name);
	 }
	int age;
	String city;
	public ThisConstructor(String name, int age, String city) {
		super();
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public ThisConstructor(String name, int age) {
		
	}

	public ThisConstructor(String name) {
this("Harry", 30,"LA");
		this.name = name;
	
	}
	


}
