package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();//launch the chrome driver
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.findElementById("twotabsearchtextbox").sendKeys("iphone");
		driver.findElementByXPath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/input[1]").click();
		driver.close();
		

	}

	
	
}
