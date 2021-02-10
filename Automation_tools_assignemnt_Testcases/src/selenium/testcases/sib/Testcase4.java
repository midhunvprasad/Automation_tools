package selenium.testcases.sib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Testcase4 {
	
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
			
			driver.get("https://www.southindianbank.com/Atm/atmlistNew.aspx");
			NearestATm();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void NearestATm() {
		try {
			jse =(JavascriptExecutor)driver;// Code for scrolling the page down
			jse.executeScript("scroll(0,700)");	
			Select sele1 = new Select(driver.findElement(By.id("cphMainContent_drpcdm")));
			sele1.selectByValue("A");
			jse.executeScript("scroll(0,700)");
			Select sele3 = new Select(driver.findElement(By.id("cphMainContent_ddlState")));
			sele3.selectByValue("17");
			jse.executeScript("scroll(0,700)");
			Select sele2 = new Select(driver.findElement(By.id("cphMainContent_drpmetro")));
			sele2.selectByValue("0");
			jse.executeScript("scroll(0,700)");
			Select sele4 = new Select(driver.findElement(By.id("cphMainContent_ddlDistrict")));
			sele4.selectByValue("286");
			jse.executeScript("scroll(0,700)");
			driver.findElement(By.id("cphMainContent_htxtKeySearch")).sendKeys("pul");
			driver.findElement(By.id("cphMainContent_btnKeySearch")).click();
	
			Thread.sleep(3000);		
			jse.executeScript("scroll(0,1000)");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}


	public static void main(String[] args) {
		
		Testcase4 t4=new Testcase4();
		t4.invokeBrowser();
	}

}
