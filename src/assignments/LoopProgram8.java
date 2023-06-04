package assignments;

public class LoopProgram8 {

	public static void main(String[] args) {
		//Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one using while and for loop.
		System.out.println("ASCII values of A-Z are ");
		for(char ch='A';ch<='z';ch++)
		{
			System.out.println(ch +"=" +(byte)ch);
		}
		
		char ch2='a';
		System.out.println("ASCII values of a-z are ");
		while(ch2<='z')
		{
			System.out.println(ch2 +"=" +(byte)ch2);
			ch2++;
		}
		
		
		char ch3='0';
		System.out.println("ASCII values of 0-9 are ");
		while(ch3<='9')
		{
			System.out.println(ch3 +"=" +(byte)ch3);
			ch3++;
		}

	}

}
