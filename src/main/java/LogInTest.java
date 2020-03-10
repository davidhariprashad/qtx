import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends SuperTestClass {
	
	/*
	 * As a user,
	 * I want to log in
	 * so users can do stuff
	 */
	@Test
	@Override
	public void test() {
		
		// arrange
		final String url = "http://the-internet.herokuapp.com/";
		final String username = "tomsmith";
		final String password = "SuperSecretPassword!";
		final String expectedGreenBoxText = "You logged into a secure area!\n×";

		// act
		new LogInPageObject(webDriver, url)
			.navigate("login")
			.logIn(username, password);

		// assert
		final String actualGreenBoxText = new SecurePageObject(webDriver)
				.getLogInConfirmationMessage();
		Assert.assertEquals(actualGreenBoxText, expectedGreenBoxText, "Can not Log into website!");
		
	}

}
