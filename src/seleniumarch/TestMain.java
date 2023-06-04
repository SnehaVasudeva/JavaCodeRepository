package seleniumarch;

public class TestMain {

	public static void main(String[] args) {
		WebDriver driver=null;
 driver=new ChromeDriver();
driver=new FirefoxDriver();
 driver=new EdgeDriver();

driver.getUrl("https://www.amazon.com");
driver.getTitle();
driver.findElement();
driver.enterUserName("test");
driver.sendKeys();
driver.click();
driver.close();


	}

}
