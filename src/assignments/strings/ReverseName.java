package assignments.strings;

import javaLearnings.MyException;

public class ReverseName {
	
	public static String revName(String sName) {
		String rev="";
		
		if(sName==null) {
			throw new MyException("Cannot pass null");
		}
		
		if(sName.length()==1) {
			return sName;
		}
		
		if(sName.length()==0) {
			System.out.println("String is empty");
		}
		for(int i=sName.length()-1;i>=0;i--) {
			
		char temp=sName.charAt(i);
		rev=rev+temp;
	
		}
		return rev;
		
	}

	public static void main(String[] args) {

		String r=revName("Sneha");
		
		System.out.println("Reverse String is " +r);
		System.out.println(revName("A"));
		System.out.println(revName(""));
		System.out.println(revName(null));

	}

}
