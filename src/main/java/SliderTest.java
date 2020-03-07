import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends SuperTestClass {

	public void naivetest() {
		
		SliderPageObject pageObject = new SliderPageObject(webDriver);
		WebElement slider = pageObject.
				navigate("horizontal_slider")
				.getRange();
		
		Action setSliderToMaxValue = new Actions(webDriver)
				.moveToElement(slider)
				.click()
				.sendKeys(Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT,
						Keys.ARROW_RIGHT)
				.build();
		
		double before = pageObject.getRangeValue();
		Assert.assertEquals(before, 0.0);
		setSliderToMaxValue.perform();
		double after = pageObject.getRangeValue();
		System.out.println(new StringBuilder("Before: ").append(before).toString());
		System.out.println(new StringBuilder("After: ").append(after).toString());
		Assert.assertEquals(after, 5.0);
		
	}
	
	@Test
	@Override
	public void test() {
		
		SliderPageObject pageObject = new SliderPageObject(webDriver);
		WebElement slider = pageObject.
				navigate("horizontal_slider")
				.getRange();
		Rectangle sliderRectangle = slider.getRect();
		
		Action dragSliderToMax = new Actions(webDriver)
				.moveToElement(slider, 0, sliderRectangle.height/2)
				.clickAndHold()
				.moveByOffset(sliderRectangle.width, 0)
				.release()
				.build();
		
		double before = pageObject.getRangeValue();
		Assert.assertEquals(before, 0.0);
		dragSliderToMax.perform();
		double after = pageObject.getRangeValue();
		System.out.println(new StringBuilder("Before: ").append(before).toString());
		System.out.println(new StringBuilder("After: ").append(after).toString());
		Assert.assertEquals(after, 5.0);
		
	}

}
