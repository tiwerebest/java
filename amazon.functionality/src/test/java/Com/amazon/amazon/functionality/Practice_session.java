package Com.amazon.amazon.functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practice_session {
	WebDriver driver;
  @Test
  public void f() {
	  
	 WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/"); 
	  driver.getTitle();
	  System.out.println(driver.getTitle());
  }
     
  @AfterClass
  public void afterClass() {
  }

}
