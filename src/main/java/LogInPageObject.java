import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject extends SuperPageObject {

	public LogInPageObject(WebDriver webDriverInstance) {
		super(webDriverInstance);
	}

	public LogInPageObject navigate() {
		final String url = "http://the-internet.herokuapp.com/login";
		webDriver.navigate().to(url);
		return this;
	}
	
	public LogInPageObject logIn(String username, String password) {
		final WebElement userNameTextBox = webDriver.findElement(By.id("username"));
		final WebElement passwordTextBox = webDriver.findElement(By.id("password"));
		final WebElement submitBox = webDriver.findElement(By.tagName("button"));
		userNameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		submitBox.click();
		return this;
	}

}
