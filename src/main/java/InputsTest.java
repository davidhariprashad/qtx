import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends SuperTestClass {

	@Test
	@Override
	protected void test() {
		
		final String url = "http://the-internet.herokuapp.com/";
		final int[] testValues = DataProvider.randomNonnegativeInts(5);
		
		final WebElement input = new InputsPageObject(webDriver, url)
				.navigate("inputs")
				.getInputBox();
		input.clear();
		
		
		for (int value : testValues) {
			final char[] characters = Integer.toString(value).toCharArray();
			for (char c : characters) {input.sendKeys(charToKey(c));}
			Assert.assertEquals(input.getAttribute("value"), Integer.toString(value));
			input.clear();
		}
		
	}
	
	private Keys charToKey(final char c) {
		switch (c) {
		case '0':
			return Keys.NUMPAD0;
		case '1':
			return Keys.NUMPAD1;
		case '2':
			return Keys.NUMPAD2;
		case '3':
			return Keys.NUMPAD3;
		case '4':
			return Keys.NUMPAD4;
		case '5':
			return Keys.NUMPAD5;
		case '6':
			return Keys.NUMPAD6;
		case '7':
			return Keys.NUMPAD7;
		case '8':
			return Keys.NUMPAD8;
		case '9':
			return Keys.NUMPAD9;
		default:
			System.out.println("Invalid input char: " + c);
			return null;
		}
	}

}