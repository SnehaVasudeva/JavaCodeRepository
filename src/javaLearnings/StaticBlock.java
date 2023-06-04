package javaLearnings;

public class StaticBlock {

	

	public static void main(String[] args) {

		System.out.println("Enter user name and password");
	}

	static {
		System.out.println("Open browser");
	}

	static {
		System.out.println("Open URL");
	}
}
