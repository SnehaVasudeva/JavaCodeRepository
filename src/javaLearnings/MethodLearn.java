package javaLearnings;

public class MethodLearn {
	public boolean launchBrowser(String browser)
	{
		System.out.println("Browser name " +browser);
		boolean flag=true;
		if(browser.trim().equalsIgnoreCase("Chrome"))
		{
			System.out.println("Chrome Browser is launched");
		}
		
		else if(browser.trim().equalsIgnoreCase("firefox"))
		{
			System.out.println("Firefox Browser is launched");
		}
		else if(browser.trim().equalsIgnoreCase("Edge"))
		{
			System.out.println("edge Browser is launched");
		}
		
		else
		{
			System.out.println("Please pass the right browser");
			flag=false;
	}
		return flag;
	}
	
	public void testing() {
		System.out.println("Print testing");
		return;
	}

	public static void main(String[] args) {

MethodLearn obj=new MethodLearn();
boolean value=obj.launchBrowser("FIREFOX ");
if(value)
{
	System.out.println("Enter the url");
}
else
{
	System.out.println("Do not enter url");
}
	}

}
