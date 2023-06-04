package constructorsassignment;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee emp = new Employee(1, "Sneha", 11.5);
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.salary);
		emp.setSalary(emp.salary + emp.salary * 0.1);
		System.out.println("New Salary for " + emp.name + " is " + emp.salary);

	}

}
