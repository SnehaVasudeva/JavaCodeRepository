package assignments;


public class MethodAssignment1 {

	public int operationNum(int a, int b,String operation) {
	
		int res = 0;

		switch (operation) {
		case "add":
			res = a + b;
			System.out.println("Addition of 2 numbers: " + res);
			break;

		case "subtract":
			res = a - b;
			System.out.println("Subtraction of 2 numbers: " + res);
			break;

		case "multiply":
			res = a * b;
			System.out.println("Multiplication of 2 numbers: " + res);

			break;

		case "division":
			res = a / b;
			System.out.println("Division of 2 numbers: " + res);
			break;

		default:
			System.out.println("Enter a valid operator");
			break;
		}
		return res;
	}

	public static void main(String[] args) {

		MethodAssignment1 obj = new MethodAssignment1();
		String operation = "division";
		int a=40;
		int b=20;

		obj.operationNum(40, 4,operation);

	}

}
