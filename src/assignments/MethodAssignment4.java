package assignments;

public class MethodAssignment4 {
	
	public void maxNum(int a,int b,int c) {
		if(a>b && a>c)
		{
		System.out.println("Maximum number is :" +a);
		}
		else if(b>c) {
			System.out.println("Maximum number is :" +b);
		}
		
		else
			System.out.println("Maximum number is :" +c);
	}
	
public void minNum(int a,int b,int c) {
	if(a<b && a<c)
	{
	System.out.println("Minimum number is :" +a);
	}
	else if(b<c) {
		System.out.println("Minimum number is :" +b);
	}
	
	else
		System.out.println("Minimum number is :" +c);
		
	}

	public static void main(String[] args) {
		// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		
MethodAssignment4 obj= new MethodAssignment4();
int a=10;
int b=500;
int c=100;
obj.maxNum(a, b, c);
obj.minNum(a,b,c);


	}

}
