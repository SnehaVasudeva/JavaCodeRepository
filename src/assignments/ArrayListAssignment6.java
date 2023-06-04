package assignments;

import java.util.ArrayList;

public class ArrayListAssignment6 {

	public static void main(String[] args) {
		// Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(100);
		System.out.println(arr);
		int ele=700;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)==ele)
			{
				System.out.println("Element found");
				break;
			}
		}
		System.out.println("Element not found");

	}

}
