import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPageObject extends SuperPageObject {

	protected CheckBoxPageObject(WebDriver webDriverInstance) {
		super(webDriverInstance);
	}

	protected CheckBoxPageObject navigate(final String path) {
		final String url = new StringBuilder(domainName).append(path).toString();
		webDriver.navigate().to(url);
		return this;
	}
	
	public WebElement getCheckbox() {
		return webDriver.findElement(By.id("checkboxes"));
	}
	
}
