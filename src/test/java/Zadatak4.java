import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak4 {
    public static void main(String[] args) {

        // Zadatak 5
// Testirati log in stranice https://practicetestautomation.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();
        WebElement test = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a"));
        test.click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        WebElement pageTitle = driver.findElement(By.className("post-title"));
        String pageText = pageTitle.getText();
        String expectedTitle = "Logged In Successfully";
        Assert.assertEquals(pageText,expectedTitle);







    }
}
