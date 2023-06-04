package javaprogrammingpractice;

public class Swap2Strings {

	public static void main(String[] args) {
		String s1= "Hello";
		String s2="World";
		System.out.println("Before swapping " +s1 +" "+s2);
		String temp="";
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping " +s1 +" "+s2);

	}

}
