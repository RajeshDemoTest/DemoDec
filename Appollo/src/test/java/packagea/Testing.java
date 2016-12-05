package packagea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing {
	@Test
	public void test(){
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	
	
	}
}
