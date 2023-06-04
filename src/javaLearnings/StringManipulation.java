package javaLearnings;

public class StringManipulation {

	public static void main(String[] args) {
		String s="Welcome to Java tutorial";
		System.out.println(s.substring(s.indexOf("Java")));
		System.out.println(s.substring(s.indexOf("Java")+4).trim());
		
		System.out.println(s.substring(s.indexOf("Java")+4, s.length()).trim());
	}

}
