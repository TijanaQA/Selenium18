import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://rs.linkedin.com");

        driver.navigate().refresh();

        driver.get("https://www.joberty.com");

        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}