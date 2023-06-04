package assignments;

import java.util.ArrayList;

public class ArrayListAssignment9 {

	public static void main(String[] args) {
		// Write a Java program to empty an array list.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(100);
		System.out.println(arr);
		arr.removeAll(arr);
		System.out.println(arr);

	}

}
