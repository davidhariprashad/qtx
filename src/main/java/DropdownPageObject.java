import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPageObject extends SuperPageObject {
	
	public DropdownPageObject(WebDriver driverInstance) {
		super(driverInstance);
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

	protected DropdownPageObject navigate() {
		final String url = "http://the-internet.herokuapp.com/dropdown";
		webDriver.navigate().to(url);
		return this;
	}
	
}
