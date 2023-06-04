package assignments;

public class BrowserTestIfElese {

	public static void main(String[] args) {
		String browser = "IE";
		if (browser == "chrome") // 
		{
			System.out.println("Launch Chrome browser");
		} else if (browser == "IE") {
			System.out.println("Launch Internet Explorer browser");
		}

		else if (browser == "safari") {
			System.out.println("Launch safari browser");
		}

		else if (browser == "firefox") {
			System.out.println("Launch firefox browser");
		}

		else
			System.out.println("Please pass the right browser name");
	}

}
