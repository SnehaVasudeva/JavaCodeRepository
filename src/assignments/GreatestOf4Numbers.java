package assignments;

public class GreatestOf4Numbers {

	public static void main(String[] args) {
		int num1 = 105;
		int num2 = 178;
		int num3 = 70;
		int num4 = 98;

		if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println(num1 + " is the greatest number");
		}

		else if (num2 > num3 && num2 > num4)
			System.out.println(num2 + " is the greatest number");

		else if (num3 > num4)
			System.out.println(num3 + " is the greatest number");

		else
			System.out.println(num4 + " is the greatest number");

	}

}
