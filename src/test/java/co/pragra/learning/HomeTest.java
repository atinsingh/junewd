package co.pragra.learning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeTest {

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
    }

    @Test
    public void openPragraWeb() throws InterruptedException, MalformedURLException {
        WebDriver driver = new ChromeDriver(); // this line will create a broswer instance
       driver.get("https://zoom.us");

       driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MILLISECONDS);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        ((JavascriptExecutor) driver).executeScript("console.log('Learning for good')");

        driver.findElement(By.id("truste-consent-button")).click();
//
//        WebElement elm = driver.findElement(By.xpath("//div[@id='navbar']//a[contains(@class,'top-contactsales')]"));
////        Actions actions = new Actions(driver);
////        actions.keyDown(Keys.COMMAND).pause(1000).click(elm).build().perform();
//        elm.click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();




//         Set<String> windows =  driver.getWindowHandles();
//
//         String parent = driver.getWindowHandle();

//         for (String window: windows) {
//             if(!window.equals(parent)){
//                 driver.switchTo().window(window);
//                 break;
//             }
//         }



//         driver.findElement(By.cssSelector("#email")).sendKeys("AYUSH");
//         Thread.sleep(3000);
//
//
//         driver.switchTo().window(parent);
//
//        ((JavascriptExecutor) driver).executeScript("confirm('Fake Alert')");




        Thread.sleep(10000);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
