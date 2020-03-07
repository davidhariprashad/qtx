import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPageObject extends SuperPageObject {

	protected SliderPageObject(WebDriver webDriverInstance) {
		super(webDriverInstance);
	}
	
	public SliderPageObject navigate(final String path) {
		final String url = new StringBuilder(domainName).append(path).toString();
		webDriver.navigate().to(url);
		return this;
	}

	public WebElement getRange() {
		return webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
	}
	
	public double getRangeValue() {
		return Double.parseDouble(webDriver.findElement(By.id("range")).getText());
	}
	
}
