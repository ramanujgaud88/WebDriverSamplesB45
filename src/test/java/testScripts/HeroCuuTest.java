package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HeroCuuTest {
	WebDriver driver;


  @Test
  public void loginTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
	  
	  WebElement userName = driver.findElement(By.id("username"));
	  userName.click();
	  userName.sendKeys("RPG");
	  
	  WebElement passWord = driver.findElement(By.id("password"));
	  passWord.click();
	  passWord.sendKeys("RPGPassword");
	  
	 // driver.findElement(By.className("radius")).click();
	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	  driver.findElement(By.linkText("Elemental Selenium")).click();
	  
	  
	  
	  
	  
  }
}
