package javaLearnings;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
//		//Arrays using new keyword
//		
//		int arr[]=new int[4];
//		
//		//array can be also be declared in the below way
//		float []arr1=new float[4];
//		
//		//length of an array will be n ie 4 and LI will be 0 and HI=n-1=3
//		arr[0]=12;
//		arr[1]=13;
//		arr[2]=38;
//		arr[3]=15;
//		//arr[4]=20; //At run time gives the error "ArrayIndexOutofBoundException"
//		arr1[0]=13.1f;
//		arr1[1]=14;
//		arr1[3]=16;
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		
//		boolean b[]=new boolean[2];
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		
//		String s[]=new String[4];
//		s[0]="ABC";
//		s[1]="DEF";
//		s[3]="GHJ";
//		System.out.println(s[2]);
//		System.out.println(Arrays.toString(s));
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		//System.out.println(arr[4]);
//		
//		System.out.println(arr.length);
//		//Using Arrays class to print the numbers
//		System.out.println(Arrays.toString(arr));
//		
//		//Using for loop
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(arr[i]);
//		}

		String browser[] = { "Chrome", "Firefox", "IE", "Edge", "Safari" };
		for (int k = 0; k < browser.length; k++) {
			System.out.println(browser[k]);
			switch (browser[k]) {
			case "Chrome":
				System.out.println("Chrome browser is from Google company");
				break;
			case "Firefox":
				System.out.println("Firefox browser is from Mozilla company");
				break;
			case "IE":
				System.out.println("IE browser is from Microsoft company and it is deprecated");
				break;
			case "Edge":
				System.out.println("Edge browser is from Microsoft company");
				break;
			case "Safari":
				System.out.println("Safari browser is from Apple company");
				break;
			default:
				break;

			}
		}

	}

}
