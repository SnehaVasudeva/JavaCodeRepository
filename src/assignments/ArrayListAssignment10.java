package assignments;

import java.util.ArrayList;

public class ArrayListAssignment10 {

	public static void main(String[] args) {
		// 10.	Write a Java program to trim the virtual capacity of an array list the current list size.
		ArrayList<String> st=new ArrayList<String>();
		st.add("A");
		st.add("B");
		st.add("C");
		System.out.println(st);
		System.out.println(st.size());
		st.trimToSize();
		System.out.println(st);

	}

}
