package assignments.strings;

public class FindingOccuranceOfChar {

	public static void main(String[] args) {
		// Write a program to get the 3rd  “ e “ of the string .
		
		String s= "Welcome to Naveen Automation Labs !";

		int occ=s.indexOf('e')+1;
		System.out.println(s.indexOf('e', s.indexOf('e',occ)+1));

	}

}
