import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPageObject extends SuperPageObject {

	public InputsPageObject(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public InputsPageObject navigate(final String subdirectory) {
		webDriver.navigate().to(new StringBuilder(domainName).append(subdirectory).toString());
		return this;
	}

	public WebElement getInputBox() {
		return webDriver.findElement(By.cssSelector("#content > div > div > div > input[type=number]"));
	}
	
}
