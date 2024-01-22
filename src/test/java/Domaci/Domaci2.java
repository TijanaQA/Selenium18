package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci2 {
    public static void main(String[] args) throws InterruptedException {
        //Domaci Zadatak 2:
        //https://demoqa.com/text-box napisati test case za dati text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Tijana Marinkovic");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("tijanicam1@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Lava Tolstoja 2");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Slavka Kolara 12");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        String expectedURL = "https://demoqa.com/text-box";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

    }
}
