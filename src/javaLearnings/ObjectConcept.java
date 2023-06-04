package javaLearnings;

import java.util.Arrays;

public class ObjectConcept {

	public static void main(String[] args) {
		Object emp[] = new Object[5];
		emp[0] = "Tom";
		emp[1] = 'A';
		emp[2] = true;
		emp[3] = 5000;
		emp[4] = 23.45;

		System.out.println("----Using Arrays class to print the values-------");
		System.out.println(Arrays.toString(emp));

		System.out.println("----Using for loop-------");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.println("----Using for each loop-------");
		for (Object e : emp) {
			System.out.println(e);

			System.out.println("----Using for each loop in a different way-------");
			Object obj1[] = new Object[] { "John", "Male", 5.7, 57.2 };
			for (Object f : obj1) {
				System.out.println(f);
			}
			
			int num[] = new int[] {1,2,3,4 };
			for (int f : num) {
				System.out.println(f);
			}

		}
	}

}
