import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void startService() {}

	@Override
	protected void stopService() {}

	@Override
	protected void createDriver() {
		
		final String key = "webdriver.chrome.driver";
		final String value = "C:\\Program Files\\ChromeDriver\\chromedriver.exe";
		System.setProperty(key, value);
		
		driver = new ChromeDriver();
		
		final long time = 1000;
		final TimeUnit unit = TimeUnit.MILLISECONDS;
		driver.manage().timeouts().implicitlyWait(time, unit);
		driver.manage().timeouts().pageLoadTimeout(time, unit);
		
	}

}
