package assignments;

import java.util.ArrayList;

public class ArrayListAssignment2 {

	public static void main(String[] args) {
		// Write a Java program to insert an element into the array list at the first
		// and last positions.*/
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(100);
		arr.add(101);
		arr.add(102);
		arr.add(103);
		System.out.println(arr);
		System.out.println(arr.size());

		arr.add(0, 99);
		arr.add(arr.size(), 104);
		System.out.println(arr);
		System.out.println(arr.size());

	}

}
