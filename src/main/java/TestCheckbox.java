import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckbox extends TestSuperClass {

	TestCheckbox() {
		beforeTest();
		test();
		afterTest();
	}

	@Test
	void test() {
		List<WebElement> checkboxes = new CheckBoxPageObject(webDriver)
				.navigate("checkboxes")
				.getCheckbox()
				.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement e : checkboxes) {
			boolean wasSelected = e.isSelected();
			e.click();
			Assert.assertTrue(wasSelected != e.isSelected(), "Clicking the button did nothing.");
			System.out.println("Clicked on checkbox successfully.");
		}
	}

}
