import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPageObject extends SuperPageObject {
	
	public DropdownPageObject(final WebDriver driverInstance, final String domainNameInstance) {
		super(driverInstance, domainNameInstance);
	}
	
	public DropdownPageObject setDropdownList(final String value) {
		getDropdown().selectByVisibleText(value);
		return this;
	}
	
	public String getDropdownListValue() {
		return getDropdown().getFirstSelectedOption().getText(); 
	}
	
	public Select getDropdown() {
		return new Select(webDriver.findElement(By.id("dropdown")));
	}

	protected DropdownPageObject navigate(final String path) {
		final String url = new StringBuilder(domainName).append(path).toString();
		webDriver.navigate().to(url);
		return this;
	}
	
}
