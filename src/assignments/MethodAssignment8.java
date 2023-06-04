package assignments;

public class MethodAssignment8 {
public int factorial(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		
		 fact=fact*i;
		 
	}
	
return fact;
}
	public static void main(String[] args) {

		MethodAssignment8 obj=new MethodAssignment8();
		int num=2;
	int fact=obj.factorial(num);
	System.out.println("Factorial of " +num +" is " +fact);
	}

}
