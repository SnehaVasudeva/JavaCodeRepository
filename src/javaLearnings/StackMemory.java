package javaLearnings;

public class StackMemory {

	public static void s1() {
		System.out.println("This is a static method 1");
		s2();
	}
public static void s2() {
	System.out.println("This is a static method 2");
		s3();
	}
public static void s3() {
	System.out.println("This is a static method 3");
	StackMemory sm=new StackMemory();
	sm.m1();
	sm.a;
}

public void m1() {
	System.out.println("This is a regular method 1");
	int a=10;
	m2();
}

public void m2() {
	System.out.println("This is a regular method 2");
	m3();
}

public void m3() {
	System.out.println("This is a regular method 3");
	StackMemory.s1();
	
}
	public static void main(String[] args) {
		StackMemory obj=new StackMemory();
		obj.m1();
		obj.m2();
		obj.m3();
		StackMemory.s1();
		StackMemory.s2();
		StackMemory.s3();


	}

}
