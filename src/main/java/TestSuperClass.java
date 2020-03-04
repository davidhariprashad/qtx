import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestSuperClass {
	
	@BeforeTest
	public abstract void beforeTest();
	
	@AfterTest
	public abstract void afterTest();
	
	protected DriverManager manager;
	protected WebDriver driver;
		
}