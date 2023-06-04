package superthiskeyword;

public class ThisSuperMain {

	public static void main(String[] args) {
		ThisConstructor th = new ThisConstructor("Tom");
		th.getName();
		//System.out.println(th.name);
		System.out.println(th.age);
		System.out.println(th.city);
		th.addCalc(20, 10);
	}

}
