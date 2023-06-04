package superthiskeyword;

public abstract class AbstractClassConcept {
	
	public String studentName;
	public int age;
	public AbstractClassConcept(String studentName, int age) {
	
		this.studentName = studentName;
		this.age = age;
		System.out.println(studentName +age);
	}	
	
	public abstract void printNames(String name,int age);

}
