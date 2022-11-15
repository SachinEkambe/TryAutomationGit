package Synchronize.pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Impliciteclass {

	public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 
  driver.get("https://sellglobal.ebay.in/seller-center/start-selling/");
  driver.manage().window().maximize();
 
 //apply implicit
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 //we get create a class of stopwatch
 //Stopwatch watch=null;
 //find Element
 //we can get correct attribute there is no exception after 10 sec
 //but when we get incorrect atribute and run program then it gives exception
 //and what are the use for implicit it means when a webdriver(program)and browser are not run together program is fast than browser then we use the exception handling like implicite.
 //it go's and balence to run each other and find element correctly.
 //implicite weit is globly applying in program webelements not specific it is a advantage of implicite.
 try {
	// watch=Stopwatch.createStarted();
 driver.findElement(By.linkText("sdkfjj")).click();//START SELLING
 System.out.println("run continue");
 }
 catch(Exception e)
 {
	 //when we can't use of try catch method its directly show exception
	 //if we are use the try catch its hidden to our exception
	 //here is we stopping the watch 
	// watch.stop();
	 System.out.println(e.getMessage());
	 //here we calculate actual program, how much time spend to find element
	// System.out.println(watch.elapsed(TimeUnit.SECONDS)+"second"); 
 }
 
	}

}
