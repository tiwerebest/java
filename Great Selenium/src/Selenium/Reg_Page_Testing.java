package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Page_Testing {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();//launch the chrome driver
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL of the page is: "+url);
		
		
		
		
		
        driver.findElement(By.partialLinkText("Forgot accoun")).click();
        driver.navigate().back();
       // driver.findElement(By.partialLinkText("Terms")).click();
      //  driver.navigate().back();
       // driver.findElement(By.linkText("Cookies Policy")).click();
     //   driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Create a Page")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/button[1]").click();
        driver.navigate().back();
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]").sendKeys("tiwerebest");
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]").sendKeys("1234567890");
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]").click();
        driver.navigate().back();
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]").sendKeys("Moha");
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]").sendKeys("Anj");
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]").sendKeys("23456778656");
        driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]").sendKeys("334454654645");
       // driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[3]/input[1]").click();
        //driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[2]/input[1]").click();
        //driver.findElementByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/button[1]").click();
       // driver.findElementByXPath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]").click();
	    Thread.sleep(3000);


	    //CSSSelector
	    
	    
	    driver.findElement(By.cssSelector("body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.chrome.webkit.win.x1-5.Locale_en_US.cores-gte4._19_u.hasAXNavMenubar:nth-child(2) div._li:nth-child(2) div._53jh div.loggedout_menubar_container div.clearfix.loggedout_menubar div.menu_login_container.rfloat._ohf tbody:nth-child(1) tr:nth-child(3) td.login_form_label_field:nth-child(2) div:nth-child(1) > a:nth-child(1)")).click();
	    
	    
	
	
	
	}

}
