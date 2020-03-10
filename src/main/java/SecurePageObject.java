import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePageObject extends SuperPageObject{
	
	@FindBy(id="flash")
	private WebElement greenBox;
	
	SecurePageObject(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
		PageFactory.initElements(webDriver, this);
	}
	
	SecurePageObject(final WebDriver webDriverInstance) {
		super(webDriverInstance, null);
		PageFactory.initElements(webDriver, this);
	}
	
	public String getLogInConfirmationMessage() {
		return greenBox.getText();
	}

	public SuperPageObject navigate() {
		final String url = "http://the-internet.herokuapp.com/secure";
		webDriver.navigate().to(url);
		return this;
	}
	
}
