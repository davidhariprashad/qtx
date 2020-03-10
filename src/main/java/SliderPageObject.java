import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPageObject extends SuperPageObject {

	protected SliderPageObject(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public SliderPageObject navigate(final String subdirectory) {
		final String url = new StringBuilder(domainName).append(subdirectory).toString();
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
