package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();//launch the chrome driver
	    driver.manage().deleteAllCookies();
      	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   	
     	driver.get("https://google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://walmart.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
	}

}
