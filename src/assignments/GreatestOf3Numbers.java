package assignments;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 98;
		int num3 = 87;

		if ((num1 > num2) && (num1 > num3))
			System.out.println("The greatest: " + num1);
		else if (num2 > num3)
			System.out.println("The greatest: " + num2);
		else
			System.out.println("The greatest: " + num3);

		if (num1 > num2) {
			if (num1 > num3)
				System.out.println("The greatest: " + num1);
		} else if (num2 > num3)
			System.out.println("The greatest: " + num2);
		else
			System.out.println("The greatest: " + num3);

		}

	}


