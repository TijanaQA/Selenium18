import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

    public static void main(String[] args) {
        //ovu komandu koristimo da podesimo chromedriver iz biblioteke koju smo uneli u pom fajl

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //komanda navigate().to() nam otvara zeljeni URL
        //ako link nije podvucen znaci da nije validan
        driver.navigate().to("https://www.google.com/");
        //ova komanda je za povecanje prozora u kom radimo
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();

        driver.quit();

        //driver.close();
    }
}
