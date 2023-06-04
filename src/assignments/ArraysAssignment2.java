package assignments;

import java.util.Arrays;

public class ArraysAssignment2 {

	public static void main(String[] args) {
		//Write a program to create a static Array, having following cricket data:
        //--name, age, team name, DOB, gender, Strike Rate
      //  --Try to create multiple Object Arrays for different players 
        //--Try to print all the values of each player on the console
	
		Object cData1[]= new Object[6];
		cData1[0]="Rohit";
		cData1[1]=36;
		cData1[2]="MI";
		cData1[3]="05-01-1988";
		cData1[4]='M';
		cData1[5]=85.5f;
		
		System.out.println(Arrays.toString(cData1));
		
		Object cData2[]= new Object[6];
		cData2[0]="Virat";
		cData2[1]=35;
		cData2[2]="RCB";
		cData2[3]="01-01-1987";
		cData2[4]='M';
		cData2[5]=95.5f;
		
		System.out.println(Arrays.toString(cData2));
		
		Object cData3[]= new Object[6];
		cData3[0]="Hardik";
		cData3[1]=32;
		cData3[2]="GL";
		cData3[3]="01-05-1990";
		cData3[4]='M';
		cData3[5]=90.5f;
		
		System.out.println(Arrays.toString(cData3));
	
	}

}
