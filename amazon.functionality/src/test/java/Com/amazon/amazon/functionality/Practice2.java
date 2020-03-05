package Com.amazon.amazon.functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		WebElement username=driver.findElementById("email");
		username.sendKeys("google.com");
		WebElement password=driver.findElementById("pass");
		password.sendKeys("1234567890");
		WebElement submit=driver.findElementById("loginbutton");
		submit.click();
		driver.close();

	}

}
