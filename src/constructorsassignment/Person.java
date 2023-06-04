package constructorsassignment;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
		Person per1 = new Person("Harry", 35, 'M', 6.1);
		System.out.println(per1.name + " " + per1.age + " " + per1.gender + " " + per1.height);
		Person per2 = new Person("Mary", 25, 'F', 5.6);
		System.out.println(per2.name + " " + per2.age + " " + per2.gender + " " + per2.height);

	}
}