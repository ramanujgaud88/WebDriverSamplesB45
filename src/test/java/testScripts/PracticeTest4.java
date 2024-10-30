package testScripts;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class PracticeTest4 {
	WebDriver driver;
  @Test
  public void test() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com");
	  //driver.get("https://testautomationpractice.blogspot.com");
	  String price = driver.findElement(By.xpath("//td[contains(text(), 'Master In Selenium')]//following-sibling::td[3]")).getText();
	  System.out.println("Price for this book is: "+price);
	  List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(), 'Master In Selenium')]//following-sibling::td"));
	  System.out.println("number of items "+items.size());
	  for(WebElement item : items){
		  System.out.println("Item Value"+item.getText());
		  
	  }
	  
  }
}
