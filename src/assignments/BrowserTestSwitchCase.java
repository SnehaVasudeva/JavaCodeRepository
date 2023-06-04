package assignments;

public class BrowserTestSwitchCase {

	public static void main(String[] args) {
		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;

		default:
			System.out.println("Please pass the right browser name");
			break;
		}

	}

}
