package assignments;

public class LoopProgram9 {

	public static void main(String[] args) {
		//Print the following series: 
		//1.0	2.0 3.0  ...... 10.0 
		//0	9 18 27 36 …99

for(float i=1.0f;i<=10.0f;i++)
{
	System.out.print(i +" ");
}

System.out.println("");

for(byte i=0;i<=100;i++)
{
	if(i%9==0)
	{
		System.out.print(i +" ");
	}
}
	}

}
