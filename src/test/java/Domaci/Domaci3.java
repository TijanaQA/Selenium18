package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci3 {
    public static void main(String[] args) {
        //Domaci Zadatak 1:
        //Napisati 5 negativnih log-in test case-eva za dati sajt : https://practicetestautomation.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();
        WebElement testLoginPage = driver.findElement(By.linkText("Test Login Page"));
        testLoginPage.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("username1");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        WebElement error = driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed());
        String expectedURL = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys("username");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("Password1234");
        WebElement submit1 = driver.findElement(By.id("submit"));
        submit1.click();
        WebElement error1 = driver.findElement(By.id("error"));
        Assert.assertTrue(error1.isDisplayed());
        String expectedURL1 = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL1);

        WebElement username2 = driver.findElement(By.id("username"));
        username2.sendKeys("");
        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("Password1234");
        WebElement submit2 = driver.findElement(By.id("submit"));
        submit2.click();
        WebElement error2 = driver.findElement(By.id("error"));
        Assert.assertTrue(error2.isDisplayed());
        String expectedURL2 = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL2);

        WebElement username3 = driver.findElement(By.id("username"));
        username3.sendKeys("student");
        WebElement password3 = driver.findElement(By.id("password"));
        password3.sendKeys("");
        WebElement submit3 = driver.findElement(By.id("submit"));
        submit3.click();
        WebElement error3 = driver.findElement(By.id("error"));
        Assert.assertTrue(error3.isDisplayed());
        String expectedURL3 = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL3);

        WebElement username4 = driver.findElement(By.id("username"));
        username4.sendKeys("");
        WebElement password4 = driver.findElement(By.id("password"));
        password4.sendKeys("");
        WebElement submit4 = driver.findElement(By.id("submit"));
        submit4.click();
        WebElement error4 = driver.findElement(By.id("error"));
        Assert.assertTrue(error4.isDisplayed());
        String expectedURL4 = "https://practicetestautomation.com/practice-test-login/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL4);


    }
}
