package assignments;

public class IfElsePractice {

	public static void main(String[] args) {

//		int marks = 81;
//
//		if (marks <= 100) {
//			System.out.println("Calculating the grade based on marks");
//			if (marks >= 90) {
//				System.out.println("You got GradeA");
//			     if (marks == 100) {
//				    System.out.println("You got full scholarship");
//			     }
//				 else
//				    	System.out.println("You are not eligible for 100% scholarship ");
//			}
//			else
//				if(marks>=80)
//				{
//					System.out.println("You got Grade B");
//				}
//			}
//		else
//		System.out.println("Please pass  valid marks");		
//		}

		
		String browser="opera";
		if(browser.equals("Chrome"))
		{
			System.out.println("Launch Chrome browser");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch firefox");
		}
		else if(browser.equals("edge"))
		{
			System.out.println("Launch edge browser");
		}
		
		else
			System.out.println("Enter the valid browser");
	}
}

