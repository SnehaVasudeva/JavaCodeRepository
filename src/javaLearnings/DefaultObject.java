package javaLearnings;

public class DefaultObject {
String name;
int age;
char gender;
float salary;
boolean eligible;
String dob;
	public static void main(String[] args) {
		
	DefaultObject obj=new DefaultObject();
	System.out.println(obj.name);    //null
	System.out.println(obj.age);     //0
	System.out.println(obj.gender);  //For type char, the default value is the null character, that is, '\u0000'.
	System.out.println(obj.salary);  //0.0
	System.out.println(obj.eligible);  //false
	System.out.println(obj.dob);   //null
		

	}

}
