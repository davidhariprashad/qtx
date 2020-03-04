import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheInternet extends TestSuperClass {

	@BeforeTest
	public void beforeTest() {
		manager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = manager.getDriver();
		String url = "http://the-internet.herokuapp.com/dropdown";
		driver.navigate().to(url);
	}

	@AfterTest
	public void afterTest() {
		manager.quitDriver();
	}


	/*
	 * As a user,
	 * I want to log in
	 * so users can do stuff
	 */
	public void canLogIn() {
		
		String userName = new String("tomsmith");
		String password = new String("SuperSecretPassword!");
		String expectedGreenBoxText = new String("You logged into a secure area!\n×");

		WebElement userNameTextBox = driver.findElement(By.id("username"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement submitBox = driver.findElement(By.tagName("button"));
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		submitBox.click();

		WebElement greenBox = driver.findElement(By.id("flash"));
		String actualGreenBoxText = greenBox.getText();
		Assert.assertEquals(actualGreenBoxText, expectedGreenBoxText, "Can not Log in!");
		
	}
	
	/*
	 * As a user,
	 * I want to select option 2 from a dropdown list
	 * so that some option is selected
	 */
	@Test
	public void canSelectDropdownListItem() {

		// arrange
		String expectedSelection = new String("Option 2");

		// act
		Select customerDropdownList = new Select(driver.findElement(By.id("dropdown")));
		customerDropdownList.selectByIndex(2);

		// assert
		String actualOption2Text = customerDropdownList.getFirstSelectedOption().getText();
		Assert.assertEquals(actualOption2Text, expectedSelection,
				"Cannot select a dropdown list value.");

	}
	
}