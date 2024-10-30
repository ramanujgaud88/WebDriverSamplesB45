package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {
	WebDriver driver;
  @Test
  public void validateErrorMsg() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.lambdatest.com/register");
	  
  }
}
