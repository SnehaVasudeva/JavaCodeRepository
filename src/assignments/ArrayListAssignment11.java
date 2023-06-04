package assignments;

import java.util.ArrayList;

public class ArrayListAssignment11 {

	public static void main(String[] args) {
		// Write a Java program to print all the elements of an ArrayList using the position of the elements
		
		ArrayList<String> posName = new ArrayList<String>();
		posName.add("qa");
		posName.add("dev");
		posName.add("admin");
		posName.add("manager");
		posName.add("architect");
		
		System.out.println(posName);
		
		int j=posName.indexOf("admin");
		System.out.println(j);
		
		for(int i=0;i<posName.size();i++)
		{
			System.out.println(posName.get(i));
		}

	}

}
