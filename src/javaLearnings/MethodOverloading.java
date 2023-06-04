package javaLearnings;

public class MethodOverloading {
	
	public void testMethod() {
		System.out.println("Testing1");
	}
	
	
	public void testMethod(int a) {
		System.out.println(a);
		
	}
	
	public void testMethod(int b, int c) {
		System.out.println(b+c);
	}
	
	public void testMethod(int g,int f) {
		System.out.println("testing2");
	}

	public static void main(String[] args) {



	}

}
