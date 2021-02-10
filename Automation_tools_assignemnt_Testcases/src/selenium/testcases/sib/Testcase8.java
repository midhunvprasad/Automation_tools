package selenium.testcases.sib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8 {

    WebDriver driver;
    JavascriptExecutor jse;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\seleniumtest\\libs\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("https://www.southindianbank.com/FAQ/faq.aspx");
            
            faqSearch();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void faqSearch() {
        try {
        	 driver.get("https://www.southindianbank.com/FAQ/faq.aspx");
        	    driver.findElement(By.id("cphMainContent_ddlCat")).click();
        	    {
        	      WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlCat"));
        	      dropdown.findElement(By.xpath("//option[. = 'NRI']")).click();
        	    }
        	    driver.findElement(By.id("cphMainContent_ddlCat")).click();
        	    driver.findElement(By.id("cphMainContent_ddlSubCat")).click();
        	    {
        	      WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlSubCat"));
        	      dropdown.findElement(By.xpath("//option[. = 'Others']")).click();
        	    }
        	    driver.findElement(By.id("cphMainContent_ddlSubCat")).click();
        	    driver.findElement(By.id("cphMainContent_htxtSearch")).click();
        	    driver.findElement(By.id("cphMainContent_htxtSearch")).sendKeys("banking");
	            Thread.sleep(2000);
	            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

 public static void main(String[] args) {

        Testcase8 test = new Testcase8();
        test.invokeBrowser();

    }
}