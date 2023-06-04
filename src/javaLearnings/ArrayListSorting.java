package javaLearnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(40, 10, 30, 25, 90, 80, 14));

		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++)
				if (arr.get(i) > arr.get(j)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);

				}

		}
		System.out.println(arr);

		for (int j = 0; j < arr.size() / 2; j++) {
			int temp = arr.get(j);
			arr.set(j, arr.get(arr.size() - j - 1));
			arr.set(arr.size() - j - 1, temp);
		}
		System.out.println(arr);

	}

}
