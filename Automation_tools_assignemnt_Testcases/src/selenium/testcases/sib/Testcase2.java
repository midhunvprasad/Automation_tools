package selenium.testcases.sib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Testcase2 {

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
			
			driver.get("https://www.southindianbank.com/Forms/ReferFriend.aspx");
			referaFriend();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void referaFriend() {
		try {
			//details of your friend
			
			driver.findElement(By.id("cphMainContent_txtfrndName")).sendKeys("Friend1");
			Select sele = new Select(driver.findElement(By.id("cphMainContent_dropcity")));
			sele.selectByValue("KL970");
			driver.findElement(By.id("cphMainContent_txtfriendpin")).sendKeys("673579");
			driver.findElement(By.id("cphMainContent_txtfrndmobile")).sendKeys("99999999");
			
			jse =(JavascriptExecutor)driver;// Code for scrolling the page down
			jse.executeScript("scroll(0,1000)");
			
			driver.findElement(By.id("cphMainContent_txtfrndemail")).sendKeys("testmail@gmail.com");
			Select sele1 = new Select(driver.findElement(By.id("cphMainContent_ddlBranch")));
			sele1.selectByValue("0037");
			driver.findElement(By.id("cphMainContent_txtdescription")).sendKeys("testdescription");
			
			
			
			//refering person's details
			
			driver.findElement(By.id("cphMainContent_txtname")).sendKeys("testname");
			Select sele2 = new Select(driver.findElement(By.id("cphMainContent_dropcity1")));
			sele2.selectByValue("KL970");
			driver.findElement(By.id("cphMainContent_txtpin")).sendKeys("673579");
			driver.findElement(By.id("cphMainContent_txtmobile")).sendKeys("99999999");
			driver.findElement(By.id("cphMainContent_txtmailid")).sendKeys("testmail2@gmail.com");
			Select sele3 = new Select(driver.findElement(By.id("ddlAccHolder")));
			sele3.selectByValue("Y");
			driver.findElement(By.id("cphMainContent_txtfrndempno")).sendKeys("YH554f");
			
			WebElement l =driver.findElement(By.id("cphMainContent_imgCaptcha"));
			
			//getAttribute() to get src of image
			String src=l.getAttribute("src");
			driver.findElement(By.id("cphMainContent_txtVerification")).sendKeys(src.substring(50));
			
			Thread.sleep(10000);
			//driver.findElement(By.id("cphMainContent_btnSubmit")).click();
			
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		Testcase2 t2=new Testcase2();
		t2.invokeBrowser();

	}
}
