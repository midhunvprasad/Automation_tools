package selenium.testcases.sib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	
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
			
			driver.get("https://southindianbank.in/KYCUpload/#no-back-button");
			SIBkycUpload();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void SIBkycUpload() {
		try {
			
			driver.findElement(By.id("acct_no")).sendKeys("1144558877556622");
			
			WebElement l =driver.findElement(By.id("cphMainContent_imgCaptcha"));
			
			//getAttribute() to get src of image
			String src=l.getAttribute("src");
			driver.findElement(By.id("req_captcha")).sendKeys(src);
			
			Thread.sleep(3000);
			driver.findElement(By.id("save1")).click();
			
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Testcase3 t3=new Testcase3();
		t3.invokeBrowser();

	}

}
