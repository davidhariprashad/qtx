import org.openqa.selenium.WebDriver;

public abstract class SuperPageObject {

	protected WebDriver webDriver;
	final protected String domainName = "http://the-internet.herokuapp.com/";
	
	protected SuperPageObject(final WebDriver webDriverInstance) {
		webDriver = webDriverInstance;
		
	}
	
}
