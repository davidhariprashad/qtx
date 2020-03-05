import org.testng.Assert;

public class TheInternet extends TestSuperClass {
	
	/*
	 * As a user,
	 * I want to log in
	 * so users can do stuff
	 */
	public void canLogIn() {
		
		// arrange
		final String username = "tomsmith";
		final String password = "SuperSecretPassword!";
		final String expectedGreenBoxText = "You logged into a secure area!\n×";
		
		// act
		new LogInPageObject(webDriver)
			.navigate()
			.logIn(username, password);

		// assert
		final String actualGreenBoxText = new SecurePageObject(webDriver).getLogInConfirmationMessage();
		Assert.assertEquals(actualGreenBoxText, expectedGreenBoxText, "Can not Log into website!");
		
	}
	
	/*
	 * As a user,
	 * I want to select option 2 from a dropdown list
	 * so that some option is selected
	 */
	public void canSelectDropdownListItem() {

		final String expectedSelectionText = "Option 2";
		
		final String actualOption2Text = new DropdownPageObject(webDriver)
				.navigate()
				.setDropdownList(expectedSelectionText)
				.getDropdownListValue();
		
		Assert.assertEquals(actualOption2Text, expectedSelectionText, "Cannot select a dropdown list value.");
		
	}
	
}