package assignments;

import java.util.ArrayList;

public class ArrayListAssignment4 {

	public static void main(String[] args) {
	//Write a Java program to update specific array element by given element.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(100);
		
		System.out.println(arr);
		arr.set(4, 800);
		System.out.println(arr);

	}

}
