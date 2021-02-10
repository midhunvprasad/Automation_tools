package selenium.testcases.sib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {

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
            driver.get("https://www.southindianbank.com/");
            
            checkForexRate();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void checkForexRate() {
        try {
        	 driver.get("https://www.southindianbank.com/");

        	    driver.findElement(By.linkText("Interest Rates/Forex Rates")).click();
        	    driver.findElement(By.id("tab589")).click();
        	    driver.findElement(By.cssSelector("#cphMainContent_gvForexRates tr:nth-child(5)")).click();
        	    
	            Thread.sleep(2000);
	            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

 public static void main(String[] args) {

        Testcase7 test = new Testcase7();
        test.invokeBrowser();

    }
}