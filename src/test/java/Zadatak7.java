import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak7 {
    public static void main(String[] args) throws InterruptedException {
        //Zadatak 8
       //Testirati log in na wordpress stranicu

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get("https://wordpress.com/");

        WebElement logIn = driver.findElement(By.linkText("Log In"));
        logIn.click();
        WebElement username = driver.findElement(By.id("usernameOrEmail"));
        username.sendKeys("tijanicam36");
        WebElement continuee = driver.findElement(By.cssSelector("button[type='submit']"));
        continuee.click();
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("itbootcamp");
        WebElement loginn = driver.findElement(By.cssSelector(".button.form-button.is-primary"));
        loginn.click();
        Thread.sleep(2000);
        String expectedURL = "https://wordpress.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }
}
