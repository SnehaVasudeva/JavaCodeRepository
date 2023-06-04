package assignments;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int num = 35;
		if (num > 0) {
			System.out.println(num + " is a positive number");
		}

		else if (num < 0)
			System.out.println(num + " is a negative number");
		else if (num == 0)
			System.out.println("Enter any number other than 0");
	}

}
