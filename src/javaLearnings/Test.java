package javaLearnings;

public class Test extends Object {
	
	public void finalize() {
		System.out.println("Ready for garbage collection");
	}

	public static void main(String[] args) {
		
		//Test ob=new Test();
		//ob=null;
		
		TestGC gc=new TestGC();
		gc=null;
		System.gc();
		System.out.println("End of program");

	}

}
