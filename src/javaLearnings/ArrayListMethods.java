package javaLearnings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>(Arrays.asList("Tom","Tim","Helen"));
		System.out.println(arr.size());  //3
		System.out.println(arr);  //[Tom, Tim, Helen]
		arr.add("Leela"); 
		System.out.println(arr);   //[Tom, Tim, Helen, Leela]
		System.out.println(arr.size());  //4
		
		arr.add(3, "Hana");
		System.out.println(arr);   //[Tom, Tim, Helen, Hana, Leela]
		System.out.println(arr.size());  //5
		
		arr.add(5, "Haniya");
		System.out.println(arr);  //[Tom, Tim, Helen, Hana, Leela, Haniya]
		System.out.println(arr.size());  //6
		
		//arr.add(7, "Mona");     //IndexOutOfBoundException
		//System.out.println(arr);
		
		
		List<Integer> ar=Arrays.asList(10,20,30,40);
		System.out.println(ar);
		
		List<String> st=Arrays.asList("A","B","C");
		System.out.println(st);
		
		ArrayList<Integer> lNum=new ArrayList<Integer>();
		lNum.add(100);
		lNum.add(10);
		lNum.add(30);
		lNum.add(90);
		System.out.println(lNum);
		Collections.sort(lNum);
		System.out.println(lNum);
		Collections.reverse(lNum);
		System.out.println(lNum);
		
		
		ArrayList<String> cName=new ArrayList<String>(Collections.nCopies(4, "Hello"));
		System.out.println(cName);
		
		ArrayList<Integer> cNum=new ArrayList<Integer>(Collections.nCopies(4, 200));
		System.out.println(cNum);
		
		
		//Sort the static array 
		int a[]=new int[]{10,100,20,40,60};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
	
	}
}

