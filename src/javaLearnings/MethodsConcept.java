package javaLearnings;

public class MethodsConcept {

	//no input no return
	public void myMethod() {
		System.out.println("Testing with no input and no return");
		int a=10;
		int b=20;
		int sum=a+b;
		//System.out.println(sum);
	}
	
	//no input but return
	
	public int methodWithReturn() {
		System.out.println("Testing with no inputs but returning");
		int a=20;
		int b=40;
		return a+b;
			
	}
	
	//with inputs and return
	public String methodWithInputAndReturn(String eName) {
		System.out.println("Testing with inputs and returning");
		if(eName.equalsIgnoreCase("sneha"))
		return eName;
		else
			return null;
	}
	//with inputs and no return
		public void methodWithInputNoReturn(char ch) {
			System.out.println("Testing with input and no return");
	
				System.out.println("ASCII Value of A " +(byte)ch);
			
			}
		
	
	public static void main(String[] args) {
		
MethodsConcept obj=new MethodsConcept();

obj.myMethod();

int addnum=obj.methodWithReturn();
System.out.println(addnum);
String name=obj.methodWithInputAndReturn("elsa");
System.out.println(name);
obj.methodWithInputNoReturn('A');

	}

}
