package encapsulationassignment;

public class TestMain {

	public static void main(String[] args) {
		Person p = new Person();
	
		p.setName("Harry");
		p.setGender("Male");
		p.setAge(25);
		p.printInfo(p.getName(), p.getAge(), p.getGender());

	}

}
