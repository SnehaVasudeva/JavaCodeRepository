package javaLearnings;

import java.util.ArrayList;

public class ArrayListGenericsTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(23);
		ar.add(55);
		ar.add(67);
		System.out.println(ar);
		System.out.println("Size of Integer ArrayList is " + ar.size());
		System.out.println(ar.get(0));
		// System.out.println(ar.get(3)); //IndexOutOfBoundException
		for (Integer i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Float> arr = new ArrayList<Float>();
		arr.add(34.45f);
		arr.add(30f);
		System.out.println(arr);
		System.out.println("Size of Float ArrayList is " + arr.size());
		System.out.println(arr.get(0));
		// System.out.println(arr.get(-1)); //IndexOutOfBoundException
		for (Float e : arr) {
			System.out.println(e);
		}

		ArrayList<Double> db = new ArrayList<Double>();
		db.add(34.56);
		db.add(20.0);
		System.out.println(db);
		System.out.println("Size of Double ArrayList is " + db.size());
		System.out.println(db.get(0));
		// System.out.println(arr.get(3));  //IndexOutOfBoundException

		ArrayList<String> st = new ArrayList<String>();
		st.add("QA");
		st.add("Developer");
		st.add("Admin");
		st.add("Architect");
		System.out.println(st);
		System.out.println("Size of String ArrayList is " + st.size());
		System.out.println(st.get(0));
		// System.out.println(arr.get(3));
		
		for(int i=0;i<st.size();i++)
		{
			if(st.get(i).equals("QA"))
			{
				System.out.println("Qa is for testing");
			}
		}

		ArrayList<Boolean> boo = new ArrayList<Boolean>();
		boo.add(true);
		boo.add(false);
		System.out.println(boo);
		System.out.println("Size of Boolean ArrayList is " + boo.size());
		System.out.println(boo.get(0));
		// System.out.println(arr.get(3)); //IndexOutOfBoundException
	}

}
