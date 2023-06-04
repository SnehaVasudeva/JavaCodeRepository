package javaLearnings;

public class BuilderPattern {
	
	public BuilderPattern(String browser) {
		System.out.println("Launch browser" +browser);
	}
	public BuilderPattern login(String uname,String upwd) {
		System.out.println("Login with username and password" +uname +" "+upwd);
		return this;
	}
	
	public BuilderPattern searchProduct(String prod) {
		System.out.println("Searching the product");
		return this;
	}
	public BuilderPattern addToCart(String prod) {
		System.out.println("product added to cart");
		return this;
	}
	
	public BuilderPattern paymentMethod(String cc,int cvv) {
		System.out.println("Payment done with credit card" +cc +cvv);
		return this;
	}
	public BuilderPattern logOut()
	{
		System.out.println("Logged out successfully");
		return this;
	}

}
