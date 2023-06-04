package javaLearnings;

  public abstract class BClass {
	int a = 101;

	public int addNum(int a, int b) {
		return a + b;
	}

	public static int printNum() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println("Printing BClass");
		BClass bobj = new BClass();
		int x = bobj.addNum(10, 20);
		System.out.println("Sum " + x);

		int z = BClass.printNum();
		System.out.println("Printing number" + z);
//System.out.println(BClass.a);
		System.out.println(bobj.a);
	}
	
	

}
