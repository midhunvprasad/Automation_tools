package selenium.testcases.sib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase5 {
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
			
			driver.get("https://www.southindianbank.com/branch/branchlist.aspx");
			NearestBranch();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void NearestBranch() {
		try {
			jse =(JavascriptExecutor)driver;// Code for scrolling the page down
			
			Select sele1 = new Select(driver.findElement(By.id("cphMainContent_ddlState")));
			sele1.selectByValue("17");

			Select sele2 = new Select(driver.findElement(By.id("cphMainContent_ddlDistrict")));
			sele2.selectByValue("286");
			driver.findElement(By.id("cphMainContent_htxtSearch")).sendKeys("bathe");
			driver.findElement(By.id("cphMainContent_btnKeySearch")).click();

			
			jse.executeScript("scroll(0,1000)");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Testcase5 t5=new Testcase5();
		t5.invokeBrowser();
	}

}
