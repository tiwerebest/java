package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitywait {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();//launch the chrome driver
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	//	String title=driver.getTitle();
	//	System.out.println("Title of the page is: "+title);
	//	String url=driver.getCurrentUrl();
	//	System.out.println("URL of the page is: "+url);
		//Thread.sleep(5000);
        
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
	}

}
