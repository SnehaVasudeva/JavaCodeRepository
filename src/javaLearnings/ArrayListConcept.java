package javaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("Sneha");
		arr.add(100);
		arr.add(23.55f);
		arr.add(400);
		arr.add(true);
		arr.add('A');

		// To print the values together
		System.out.println(arr);

		// When you want to add the value in a specific position
		arr.add(2, "Hello");
		System.out.println(arr);

		// Update the value for a specific index
		arr.set(0, "Saniha");

		// To find the size of the array
		System.out.println(arr.size());

		// To print the value for the specific position
		System.out.println(arr.get(1));

		// Remove a value from particular index
		arr.remove(2);
		System.out.println(arr);

		// IOB-IndexOutOfBoundsException displayed if the index is out of range(index <
		// 0 || index > size())
		System.out.println(arr.get(2));
		//System.out.println(arr.get(-1));

		// To print all values using for loop
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		// to print all values using for each loop
		for (Object e : arr) {
			System.out.println(e);
		}

		// Removes all elements from the list
	//arr.remove(0);
	//arr.remove(arr);
		ArrayList<Object> c=new ArrayList<Object>(Arrays.asList("Saniha",100,'A'));
		List sub=c.subList(0, 1);
		System.out.println(sub);
		System.out.println("----");
arr.removeAll(c);
		System.out.println(arr);
		arr.remove(true);
		//arr.remove(Integer.valueOf(400));
		System.out.println(arr);
	}

}
