package co.pragra.learning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeTest {

    WebDriver driver;

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
        driver  = new ChromeDriver();
        driver.get("https://www.skipthedishes.com/");
    }

    @Test
    public void openPragraWeb() throws InterruptedException, MalformedURLException {

    }

    @Test
    public void dummyTest() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Locaters allow us to locate elemt
            // id  -- locate by ID
            // tagName -- locate by tagName
            // cssSelector
            // Xpath
            // linkText
            // partialLinkTest
           // WebElement element = driver.findElement(By.xpath("//form/input"));

    //        WebElement icon = driver.findElement(By.cssSelector(".c5159"));
    //        icon.click();

            WebElement form = driver.findElement(By.cssSelector("form>input"));
            Thread.sleep(2000);
    //        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none'", form);
            //((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('disabled','disable')", form);

            Thread.sleep(2000);

             System.out.println( form.getAttribute("placeholder"));
        System.out.println(form.getCssValue("color"));
        System.out.println(form.getRect().height);
        System.out.println(form.getRect().width);

            form.sendKeys("200", " Matheson Blvd" , Keys.ENTER);

            File file = form.getScreenshotAs(OutputType.FILE);
            try {
                Files.copy(file.toPath(), Paths.get("Screenshot.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        //System.out.println(driver.findElement(By.cssSelector("h1.MuiTypography-root ")).getText());

            Thread.sleep(10000);

           // element.click();


    }
    @Test
    public void greeting(){

    }

    @AfterSuite
    public void quit(){
        driver.quit();
    }
}

