import org.openqa.selenium.WebDriver;

public abstract class SuperPageObject {

	protected WebDriver webDriver;
	protected String domainName;
	
	protected SuperPageObject(final WebDriver webDriverInstance, final String domainNameInstance) {
		webDriver = webDriverInstance;
		domainName = domainNameInstance;
	}
	
}
