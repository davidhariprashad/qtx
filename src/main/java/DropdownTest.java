import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends SuperTestClass {

	/*
	 * As a user,
	 * I want to select option 2 from a dropdown list
	 * so that some option is selected
	 */
	@Test
	@Override
	public void test() {

		final String expectedSelectionText = "Option 2";
		
		final String actualOption2Text = new DropdownPageObject(webDriver)
				.navigate("dropdown")
				.setDropdownList(expectedSelectionText)
				.getDropdownListValue();
		
		Assert.assertEquals(actualOption2Text, expectedSelectionText, "Cannot select a dropdown list value.");
		
	}
	
}
