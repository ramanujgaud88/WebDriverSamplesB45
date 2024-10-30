package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {
	WebDriver driver;

	@Test
	public void searchJavaTest() {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Java Toturial");
		searchBox.sendKeys(Keys.ENTER);
		
		System.out.println("Page Title: "+ driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Page Title After Back Action: "+ driver.getTitle());
		driver.navigate().forward();
		System.out.println("Page Title After Forward Action: "+ driver.getTitle());
		
		

	}
}
