import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadatak10 {
    public static void main(String[] args) throws InterruptedException {

        //Zadatak 10
//Otici na stranicu https://imgflip.com/memegenerator
//Uploadovati sliku od koje treba napraviti mim
//Mim mora biti vezan za IT, QA ili kurs
//Sliku rucno skinuti i ubaciti na Slack thread poruku
//Autor mima sa najvise lajkova dobija pivo na druzenju
//
//Napomena: Izazov zadatka je kod lokatora, assertove ne treba dodavati i ne treba raditi sa anotacijama

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://imgflip.com/memegenerator");
        WebElement upload = driver.findElement(By.id("mm-show-upload"));
        upload.click();
        Thread.sleep(3000);
        WebElement add = driver.findElement(By.id("mm-upload-file-btn"));
        add.click();
        Thread.sleep(10000);
        WebElement upload1 = driver.findElement(By.id("mm-upload-btn"));
        upload1.click();


    }
}
