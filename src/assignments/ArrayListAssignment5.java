package assignments;

import java.util.ArrayList;

public class ArrayListAssignment5 {

	public static void main(String[] args) {
		// Write a Java program to remove the third element from an array list. 
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(100);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);


	}

}
