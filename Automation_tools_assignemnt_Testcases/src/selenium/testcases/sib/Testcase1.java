package selenium.testcases.sib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	WebDriver driver;
	JavascriptExecutor jse; 
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\seleniumtest\\\\libs\\\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.southindianbank.com/");
			search();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void search() {
		try {
			driver.findElement(By.id("txtSearch")).sendKeys("news");
			Thread.sleep(3000);
			driver.findElement(By.id("ImageButton1")).click();
			
			jse =(JavascriptExecutor)driver;// Code for scrolling the page down
			jse.executeScript("scroll(0,500)");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		Testcase1 t1=new Testcase1();
		t1.invokeBrowser();

	}

}
