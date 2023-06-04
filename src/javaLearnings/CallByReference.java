package javaLearnings;
public  class CallByReference{
	
String name;
int age;
public void printMsg(int a) {
	System.out.println("Hello");
	a=20;
	System.out.println(a);
	
}
public void displayDetails(CallByReference s) {
name="Hasel";
age=35;
System.out.println(s.name +" " +s.age);

}

public static void  main(String[] args) {
	CallByReference sc=new CallByReference();
sc.printMsg(10);

sc.displayDetails(sc);
System.out.println(sc.name +" " +sc.age);
sc.name="Harry";
sc.age=36;
System.out.println(sc.name +" " +sc.age);
sc.displayDetails(sc);

}
}
