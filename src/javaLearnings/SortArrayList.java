package javaLearnings;

import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
arr.add(100);
arr.add(20);
arr.add(109);
arr.add(560);
arr.add(36);
arr.add(44);

System.out.println("Numbers before sorting : " +arr);

for(int i=0;i<arr.size()-1;i++) {
	for(int j=i+1;j<arr.size();j++)
	{
		if((arr.get(i))>(arr.get(j)))
		{
			int temp;
			temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);	
		}
	}
	 

	
	
}
System.out.println("After sorting " +arr);
	}

}
