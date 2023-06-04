package assignments;

import java.util.ArrayList;

public class ArrayListAssignment7 {

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
        studentNames.add("Varun");
        studentNames.add("Reena");
        studentNames.add("Naveen");
        studentNames.add("Robin");
        studentNames.add("Peter");
System.out.println("Given ArrayList are " +studentNames);

        for(int i=0;i<studentNames.size()/2;i++)
        {
        	String temp;
        	temp=studentNames.get(i);
        	studentNames.set(i,studentNames.get(studentNames.size()-i-1));
        	studentNames.set(studentNames.size()-i-1,temp);
        }
        
        System.out.println("Reverse Array List are: " +studentNames);

	}

}
