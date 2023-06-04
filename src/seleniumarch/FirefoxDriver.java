package seleniumarch;

public class FirefoxDriver implements WebDriver {
	public void launchFirefox() {
		System.out.println("LAUNCH firefoxBROWSER");
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
			System.out.println("FF:Identifyingthe element");
			
		}

	}
