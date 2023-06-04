package seleniumarch;

public interface WebDriver extends SearchContext {
	public void getUrl(String url);
	
	public void getTitle();
	public void enterUserName(String un);
	public void sendKeys();
	public void click();
	
	
	public void close();

}
