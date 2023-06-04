package assignments;

public class MethodAssignment3 {
	static double PI = Math.PI;

	public void circleAreaCirc(double radius) {
		double area = PI * radius * radius;
		double circumference = 2 * PI * radius;
		System.out.println("Area of a circle " + area);
		System.out.println("Circumference of a circle " + circumference);

	}

	public static void main(String[] args) {

		MethodAssignment3 obj = new MethodAssignment3();
		obj.circleAreaCirc(3);

	}

}
