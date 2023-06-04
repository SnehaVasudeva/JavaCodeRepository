package assignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignment8 {

	public static void main(String[] args) {
		// 8. Write a Java program to extract a portion of an array list.
		ArrayList<String> posName = new ArrayList<String>();
		posName.add("qa");
		posName.add("dev");
		posName.add("admin");
		posName.add("manager");
		posName.add("architect");
		System.out.println(posName);
//Method 1
		for (int i = 0; i < posName.size(); i++) {
			System.out.println(posName.get(i));
			if (posName.get(i).equals("admin")) {
				break;
			}
		}
		
//Method 2
		List<String> subListN=posName.subList(0, 3);
		
		System.out.println(subListN);
		
	}

}
