import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wordpress.com/");

        Cookie cookie = new Cookie("wordpress_logged_in","tijanicam36%7C1800042606%7CoLE2jtD0BDryWdrJF4oGxlrdv97AmI2d4AnbwGc0W0Z%7C29bdd58a6c4f9d81de091c458df8cfcf61f8f79158212f269f62a76acf81f29d");


        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        Thread.sleep(4000);

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

    }
}
