package assignments;

public class MethodAssignment5 {
	
	public boolean oddEvenNum(int a) {
		boolean flag=true;
		if(a%2==0)
		{
			System.out.println("It is an even number");
		}
		
		else
			{
			System.out.println("It is an odd number");
			flag=false;
			}
		return flag;
	}

	public static void main(String[] args) {
		// Define a program to find out whether a given number is even or odd - return true/false.
		
		MethodAssignment5 obj= new MethodAssignment5();
		boolean b=obj.oddEvenNum(501);
		System.out.println(b);

	}

}
