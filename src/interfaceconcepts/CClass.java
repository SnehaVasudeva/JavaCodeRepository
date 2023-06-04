package interfaceconcepts;

import javaLearnings.BClass;

public class CClass {

	public static void main(String[] args) {

String s="Welcome To Jave";
System.out.println(s.indexOf("e"));
int i=s.indexOf("e", s.indexOf("e")+1);
System.out.println(s.indexOf("e", i+1));

System.out.println(s.indexOf("To"));
System.out.println(s.indexOf("Testing"));
	}

}
