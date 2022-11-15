package Synchronize.pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expliciteclass {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");
driver.manage().window().maximize();
//create a stopwatch class
//Stopwatch watch=null;

WebDriverWait weit= new WebDriverWait(driver, Duration.ofMinutes(5));
//try {
	//watch=Stopwatch.createStarted();
WebElement element=weit.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("zdgvLLING")));// START SELLING
element.click();

driver.close();
//	}
//catch(Exception e)
//{
	//watch.stop();
//	System.out.println(e);
	//System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
//}
}
}
