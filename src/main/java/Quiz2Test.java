import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Quiz2Test extends SuperTestClass {

	@Test
	@Override
	protected void test() {
		
		WebDriver driver = new ChromeDriver();
		final String url = "https://ultimateqa.com/simple-html-elements-for-automation/";
		driver.navigate().to(url);
		List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
		System.out.println("Number of buttons: " + buttons.size());
	}
	
}
