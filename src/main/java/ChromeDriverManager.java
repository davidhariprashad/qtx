import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void startService() {
		
	}

	@Override
	protected void stopService() {
		
	}

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		final long time = 1000;
		final TimeUnit unit = TimeUnit.MILLISECONDS;
		// poll for condition until the time out
		driver.manage().timeouts().implicitlyWait(time, unit);
		// wait for an element to appear
		driver.manage().timeouts().pageLoadTimeout(time, unit);
	}

}
