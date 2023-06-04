package javaLearnings;

import java.util.Arrays;

public class ReverseNumbersForLoop {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=23;
		arr[1]=34;
		arr[2]=45;
		arr[3]=50;
		arr[4]=60;
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		int ar[]=new int[3];
		System.out.println(ar[0]);
		ar[0]=100;
		System.out.println(ar[0]);
System.out.println("----Updation check-------");
		int a[]= {10,20,30,40,50,60};
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[5]);
		System.out.println(Arrays.toString(a));
		//System.out.println(a[6]);  //ArrayIndexOutofBoundsException
		a[3]=200;
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));
		//a[7]=300;          ////ArrayIndexOutofBoundsException
		//System.out.println(a[7]);
		System.out.println("----foreach-------");
		int p[]= {10,20,30,40};
		int count = 0;
		for (int e : p) {
		       System.out.println("The value at index[" + count + "]" + "=" + e);
		       count++;
		}      
		     int an[]= {10,20,30,40};
		     for(int i=0;i<=3;i++) {
		    	 System.out.println("Value of index a["+ i+ "]" +"=" +an[i]);
		     }
			
			
		   }

	}


