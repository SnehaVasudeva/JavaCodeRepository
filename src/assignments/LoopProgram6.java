package assignments;

public class LoopProgram6 {

	public static void main(String[] args) {
	//print all odd and even numbers between 1 to 100
String evenNumList=" ";
String oddNumList=" ";
for(int i=1;i<=100;i++)
{
	if(i%2==0)
	{
		
		evenNumList=evenNumList+i+" ";
	}
	
	
	else
	{
		oddNumList=oddNumList+i+" ";
	}
	
}
System.out.println("Even numbers list are: " +evenNumList);
System.out.println("Odd numbers list are: " +oddNumList);
		
	}

}
