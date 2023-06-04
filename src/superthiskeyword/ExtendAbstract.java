package superthiskeyword;

public class ExtendAbstract extends AbstractClassConcept {
	public String studentName;
	public int age;

	public ExtendAbstract(String studentName, int age) {
		super("Saniha", 5);
		this.studentName = studentName;
		this.age = age;
	}

	@Override
	public void printNames(String studentName, int age) {

		System.out.println(studentName + age);
	}

}
