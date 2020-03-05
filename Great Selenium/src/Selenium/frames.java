package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();//launch the chrome driver
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
       driver.switchTo().frame("packageListFrame");
       driver.findElement(By.linkText("org.openqa.selenium")).click();
       driver.switchTo().defaultContent();
       
       
       driver.switchTo().frame("packageFrame");
       driver.findElement(By.linkText("WebDriver")).click();
       driver.switchTo().defaultContent();
       
       driver.switchTo().frame("classFrame");
       driver.findElementByLinkText("com.thoughtworks.selenium.webdriven").click();
       
       
       
	}

}
