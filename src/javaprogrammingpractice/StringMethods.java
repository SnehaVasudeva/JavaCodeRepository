package javaprogrammingpractice;

public class StringMethods {

	public static void main(String[] args) {
	//concat() Method
		String s1="Learn";
		String s3="Java";
		String s2=new String("Selenium");
		
		
		String s=s1.concat(s2).concat(s3);
		System.out.println(s);
		
		//length() metod
		
		String s4="Welcome To Sweden";
		System.out.println(s4.length());  //including the spaces 17
		
		//substring() method
		
		String st="OrangeMango";
		System.out.println(st.substring(2));
		System.out.println(st.substring(6,11));
		
		//toUpperCase() method
		
		String st1="Gardening";
		System.out.println(st1.toUpperCase());
		
		//toLowerCase method
		
		String st2="ORANGE";
		System.out.println(st2.toLowerCase());
		

	}

}
