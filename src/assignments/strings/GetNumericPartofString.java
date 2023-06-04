package assignments.strings;

public class GetNumericPartofString {

	public static void main(String[] args) {
		// get only numeric part from this String:
		
		String s="your transaction id is: 12345 and reference id is 34567";
 String ss=s.replaceAll("[^0-9]","");
 System.out.println(ss);


	}

}
