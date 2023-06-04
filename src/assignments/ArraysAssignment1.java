package assignments;

import java.util.Arrays;

public class ArraysAssignment1 {

	public static void main(String[] args) {
		int p[] = {1,4,5,2,3,22,31, 2}; 
		//--Need to remove 22 from the p[] array.
		//--output should be: [1, 4, 5, 2, 3, 31, 2]


int new_p[]=new int[p.length-1];
int j=22;

 for(int i=0,k=0;i<p.length;i++)
 {
	if(p[i]!=j)
	{
		new_p[k]=p[i];
		k++;
	}
	
	
 }
 System.out.println("Before deletion: " +Arrays.toString(p));
 System.out.println("After Deletion: " +Arrays.toString(new_p));
 
 System.out.println("-------foreach------------");
 int q[] = {1,4,5,2,3,22,31, 2}; 
 int newq[]= new int[q.length-1];
 
 int count=0;
 for(int e:q) {
	 if(!(e==22))
	 {
		 newq[count]=e;
		 count++;
	 }
 }
 System.out.println("Before deletion: " +Arrays.toString(q));
 System.out.println("After Deletion: " +Arrays.toString(newq));
 
	}

}
