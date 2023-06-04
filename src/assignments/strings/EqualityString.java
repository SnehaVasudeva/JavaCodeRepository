package assignments.strings;

public class EqualityString {

	public static void main(String[] args) {
		// Write a program to check two different strings equality.
		
		String s1= "Hello";
		String s2="World";
		
		System.out.println(s1.equals(s2));
		String s3=new String("Hello");
		String s4=new String("World");
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s5="Welcome";
		String s6="Welcome";
		
		System.out.println(s5==s6);
		
		String s7=new String("Selenium");
		String s8=new String("Selenium");
		System.out.println(s7==s8);  //Using ==operator shows as false
		System.out.println(s7.equals(s8));

	}

}
