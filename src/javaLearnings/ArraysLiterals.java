package javaLearnings;

import java.util.Arrays;

public class ArraysLiterals {

	public static void main(String[] args) {
	
		int arr[]= {23,45,56,78};
		//To print the length of the array
		System.out.println(arr.length);
		//Using Arrays class to print the values
		System.out.println(Arrays.toString(arr));
		//Using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Float and double can hold the integer value but an integer cannot hold the float or double value.
		float f[]= {23,45.56f,56.34f,10.12f};
		System.out.println(Arrays.toString(f));
		
		double d[]= {12.5,34.22,56.5668899,67.899900000};
		System.out.println(Arrays.toString(d));
		
		char c[]= {'a','s','d','f'};
		System.out.println(Arrays.toString(c));
		
		boolean b[]= {true,false};
		System.out.println(Arrays.toString(b));

	}

}
