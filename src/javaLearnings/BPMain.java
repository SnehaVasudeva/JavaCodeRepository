package javaLearnings;

public class BPMain {

	public static void main(String[] args) {
		BuilderPattern bp=new BuilderPattern("Chrome");
		bp.login("Sneha", "qwerty").searchProduct("MAC").addToCart("MAC").paymentMethod("353636373737737373", 180).logOut();

	}

}
