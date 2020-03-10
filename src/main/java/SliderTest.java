import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends SuperTestClass {

	@Test
	@Override
	public void test() {

		final String url = "http://the-internet.herokuapp.com/";
		final SliderPageObject pageObject = new SliderPageObject(webDriver, url);
		final WebElement slider = pageObject
				.navigate("horizontal_slider")
				.getRange();
		final double minValue = Double.parseDouble(slider.getAttribute("min").trim());
		final double maxValue = Double.parseDouble(slider.getAttribute("max").trim());
		final Rectangle sliderRectangle = slider.getRect();

		final Action dragSliderToMax = new Actions(webDriver)
				.moveToElement(slider, 0, sliderRectangle.height/2)
				.clickAndHold()
				.moveByOffset(sliderRectangle.width, 0)
				.release()
				.build();

		final double beforeValue = pageObject.getRangeValue();
		Assert.assertEquals(beforeValue, minValue);
		dragSliderToMax.perform();
		final double afterValue = pageObject.getRangeValue();
		Assert.assertEquals(afterValue, maxValue);

	}

}
