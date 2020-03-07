import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPageObject extends SuperPageObject {

	protected CheckboxPageObject(WebDriver webDriverInstance) {
		super(webDriverInstance);
	}

	public CheckboxPageObject navigate(final String path) {
		final String url = new StringBuilder(domainName).append(path).toString();
		webDriver.navigate().to(url);
		return this;
	}
	
	public WebElement getCheckbox() {
		return webDriver.findElement(By.id("checkboxes"));
	}
	
}
