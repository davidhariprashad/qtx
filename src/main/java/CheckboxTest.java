import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends SuperTestClass {

	/*
	 * As a user,
	 * I want to be able to check boxes
	 * so that I may select the options I want.
	 */
	@Test
	@Override
	public void test() {
		
		List<WebElement> checkboxes = new CheckboxPageObject(webDriver)
				.navigate("checkboxes")
				.getCheckbox()
				.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement element : checkboxes) {
			boolean wasSelected = element.isSelected();
			element.click();
			Assert.assertTrue(wasSelected != element.isSelected(), "Clicking the button did nothing.");
			System.out.println("Clicked on checkbox successfully.");
		}
		
	}
}
