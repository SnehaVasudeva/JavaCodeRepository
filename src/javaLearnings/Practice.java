package javaLearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

	ArrayList<String> ar=new ArrayList<String>(Arrays.asList("Brown"));

		ar.add("Orange");
		ar.add("blue");
	int s=ar.indexOf("Orange");
	System.out.println(s);
		List<String> sub=ar.subList(0, 1);
		System.out.println(sub);
//	ar.add("red");
//		ar.add("blue");
//		ar.add("Black");
//		ar.add("White");
//		System.out.println(ar);
//		for(int i=0;i<ar.size();i++)
//		{
//			System.out.println(ar.get(i));
//		}
//		
//		ar.set(1, "Green");
//					
//		System.out.println(ar);
//		
//		ar.remove(3);
//		System.out.println(ar);
//		ar.remove("Black");
//		System.out.println(ar);
//		ar.remove(String.valueOf("Green"));
//		System.out.println(ar);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(500);
		System.out.println(arr);
		int temp;
		
		for(int i=0;i<arr.size()/2;i++)
		{
			temp=arr.get(i);
			arr.set(i, arr.get(arr.size()-i-1));
			arr.set(arr.size()-i-1, temp);
			
		}
		System.out.println(arr);


	}

}
