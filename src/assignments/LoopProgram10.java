package assignments;

public class LoopProgram10 {

	public static void main(String[] args) {
		//10.	Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		char ch='a';
		while(ch<='z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch +" ");
			}
			ch++;
		}
		System.out.println(" ");
		
		for(char c='a';c<='z';c++)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.print(c +" ");
			}
		}

	}

}
