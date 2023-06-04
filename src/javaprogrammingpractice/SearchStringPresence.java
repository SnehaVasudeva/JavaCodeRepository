package javaprogrammingpractice;



public class SearchStringPresence {

	public static void main(String[] args) {
		String a[]= {"scott","john","mary","David"};
		boolean flag=false;
	
		String searchString="Mary";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase(searchString))
			{
				System.out.println(a[i]);
				flag=true;
				break;
			}
		}
	
		
		if(flag)
			{
			System.out.println("Search element is found ");
			}
		else
			System.out.println("Search element is not found");
	


		}
	}


