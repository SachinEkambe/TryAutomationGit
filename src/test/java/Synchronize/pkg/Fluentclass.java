package Synchronize.pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.timeout.TimeoutException;

public class Fluentclass {

	public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  
  driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");
  driver.manage().window().maximize();
  
  Wait<WebDriver> weit=new FluentWait<WebDriver>(driver)
		  
		  .withTimeout(Duration.ofSeconds(8))
		  .pollingEvery(Duration.ofSeconds(2))
		  .ignoring(NoSuchElementException.class);
  WebElement element=(WebElement) weit.until(ExpectedConditions.visibilityOfElementLocated( By.linkText("asf dsfg")));//START SELLING
  element.click();
  System.out.println("it is continue.." );
  driver.close();
	}
}
