package antbuild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class wd_script {

	@Test
	public void open() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(10000);
	}
}
