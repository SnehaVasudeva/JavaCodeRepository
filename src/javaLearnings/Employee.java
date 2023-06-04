package javaLearnings;

public class Employee {

	String name;
	int age;
	String city;

	public static void main(String[] args) {
		Employee u1 = new Employee();
		u1.name = "Jim";
		u1.city = "Paris";
		u1.age = 30;

		System.out.println(u1.name + " " + u1.city + " " + u1.age);

		Employee u2 = new Employee();
		u2.name = "Mary";
		u2.city = "Tampa";
		u2.age = 25;

		System.out.println(u2.name + " " + u2.city + " " + u2.age);

		Employee u3 = new Employee();
		u3.name = "Gary";
		u3.city = "Berlin";
		u3.age = 40;

		System.out.println(u3.name + " " + u3.city + " " + u3.age);

		Employee u4 = new Employee();
		u4.name = "George";
		u4.city = "Stockholm";
		u4.age = 20;

		System.out.println(u4.name + " " + u4.city + " " + u4.age);
		System.out.println("------------");
		u1 = u2;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u3.age);
		System.out.println(u4.name + " " + u4.city + " " + u4.age);
		System.out.println("------------");
		u2 = u3;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u3.age);
		System.out.println(u4.name + " " + u4.city + " " + u4.age);
		System.out.println("------------");
		u3 = u4;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u3.age);
		System.out.println(u4.name + " " + u4.city + " " + u4.age);
		System.out.println("------------");
		u4 = u1;
		System.out.println(u1.name + " " + u1.city + " " + u1.age);
		System.out.println(u2.name + " " + u2.city + " " + u2.age);
		System.out.println(u3.name + " " + u3.city + " " + u3.age);
		System.out.println(u4.name + " " + u4.city + " " + u4.age);

	}
}
