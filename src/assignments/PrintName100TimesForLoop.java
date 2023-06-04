package assignments;

public class PrintName100TimesForLoop {

	public static void main(String[] args) {
		//1st approach
		String pName = "Sneha";
		for (int i = 1; i <= 10; i++) {
			System.out.println(pName);
		}
//2nd approach
		int i = 1;
		while (i <= 10) {
			System.out.println(pName);
			i++;
		}
//3rd approach
		int j = 1;
		while (true) {
			System.out.println(j + " " + pName);
			if (j == 100) {
				break;
			}
			j++;
		}

	}
}