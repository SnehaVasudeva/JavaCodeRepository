package constructorsassignment;

public class Car {
	String make;
	String model;
	int year;

	public Car() {
		make = "Unknown";
		model = "Unknown";
		year = 0000;
	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.make + " " + c.model + " " + c.year);
		Car c1 = new Car("Maruti", "Wagon-R", 2013);
		System.out.println(c1.make + " " + c1.model + " " + c1.year);

		Car c2 = new Car("Tesla", "Model 3", 2019);
		System.out.println(c2.make + " " + c2.model + " " + c2.year);
	}

}
