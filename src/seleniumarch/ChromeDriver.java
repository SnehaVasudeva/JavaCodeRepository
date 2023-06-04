package seleniumarch;

public class ChromeDriver implements WebDriver {
public void launchChrome() {
	System.out.println("LAUNCH chromeBROWSER");
}
	@Override
	public void getUrl(String url) {
		
		System.out.println("Url is" +url);
	}

	@Override
	public void getTitle() {
	System.out.println("title ");
	
	}

	@Override
	public void enterUserName(String un) {
	System.out.println("Enter username");
		
	}

	@Override
	public void sendKeys() {
System.out.println("Typing the username");
		
	}

	@Override
	public void click() {
		System.out.println("click the button");
		
	}

	@Override
	public void close() {
		
		System.out.println("close the browser");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome:Identifyingthe element");
		
	}

}
