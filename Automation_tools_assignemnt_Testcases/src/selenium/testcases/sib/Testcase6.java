package selenium.testcases.sib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {

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
            driver.get("https://www.southindianbank.com/Property/Search.aspxt");
            propertySearch();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void propertySearch() {
        try {
        	driver.get("https://www.southindianbank.com/Property/Search.aspx");
            driver.findElement(By.id("cphMainContent_ddlState")).click();
            {
              WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlState"));
              dropdown.findElement(By.xpath("//option[. = 'KERALA']")).click();
            }
            driver.findElement(By.id("cphMainContent_ddlState")).click();
            driver.findElement(By.id("cphMainContent_ddlDistrict")).click();
            {
              WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlDistrict"));
              dropdown.findElement(By.xpath("//option[. = 'KOTTAYAM']")).click();
            }
            driver.findElement(By.id("cphMainContent_ddlDistrict")).click();
            driver.findElement(By.id("cphMainContent_ddlCity")).click();
            {
              WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlCity"));
              dropdown.findElement(By.xpath("//option[. = 'ERNAKULAM']")).click();
            }
            driver.findElement(By.id("cphMainContent_ddlCity")).click();
            driver.findElement(By.id("cphMainContent_txtPin")).click();
            driver.findElement(By.id("cphMainContent_txtPin")).sendKeys("60001");
            driver.findElement(By.id("cphMainContent_ddltype")).click();
            {
              WebElement dropdown = driver.findElement(By.id("cphMainContent_ddltype"));
              dropdown.findElement(By.xpath("//option[. = 'Residential']")).click();
            }
            driver.findElement(By.id("cphMainContent_ddltype")).click();
            driver.findElement(By.id("cphMainContent_ddlprice")).click();
            driver.findElement(By.id("cphMainContent_ddlprice")).click();
            {
              WebElement dropdown = driver.findElement(By.id("cphMainContent_ddlprice"));
              dropdown.findElement(By.xpath("//option[. = 'Rs. 100 lacs to 1000 lacs']")).click();
            }
            driver.findElement(By.id("cphMainContent_ddlprice")).click();
            driver.findElement(By.id("cphMainContent_txtLoc")).click();
            driver.findElement(By.id("cphMainContent_txtLoc")).sendKeys("pala");
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

 public static void main(String[] args) {

        Testcase6 test = new Testcase6();
        test.invokeBrowser();

    }
}