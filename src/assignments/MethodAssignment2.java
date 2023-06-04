package assignments;

public class MethodAssignment2 {

	public double product(double a,double b)
	{
		double prod=a*b;
		return prod;
	}
	public static void main(String[] args) {
		//Define a method that returns the product of two double numbers entered by user.
		
	MethodAssignment2 obj=new MethodAssignment2();
	double prod=obj.product(45.543, 78.4567);
	System.out.println("Product of 2 docuble numbers is " +prod);

	}

}
