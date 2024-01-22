import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class Selenium4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

       /* driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys("ITbootcamp");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys(ENTER);



        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));
        searchBox.sendKeys("ItBootcamp");
        searchBox.sendKeys(ENTER);
        driver.navigate().back();
        searchBox.sendKeys("Wikipedia");
        searchBox.sendKeys(ENTER);

        //Lokatori / Selektori
        // ID - najstabilniji lokator
        //WebElement searchbox = driver.findElement(By.id("APjFqb"));

        //Name - drugi po hijerarhiji
        WebElement searchBoxByName = driver.findElement(By.name("q"));
        //Class
        WebElement searchBoxByClass = driver.findElement(By.className("gLFyf"));
        //CSS Selector
        WebElement searchBoxByCSS = driver.findElement(By.cssSelector("textarea[type = 'search']"));
        //Relative Xpath
        //WebElement searchBox = driver.findElement(By.xpath("//*["APjFqb]");

        //Absolute Xpath - najnestabilniji u hijerarhiji
        //npr: WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));

        */
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Wikipedia");

        List<WebElement> searchButton = driver.findElements(By.name("btnK"));
        searchButton.get(1).click();

        // Pogresan nacin
        //WebElement wikipediaLink = driver.findElement(By.className("LC20lb MBeuO DKV0Md"));

        WebElement wikipediaLink = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));

        wikipediaLink.click();

        WebElement wikipediaSearch = driver.findElement(By.id("searchInput"));

        wikipediaSearch.sendKeys("Nikola Tesla");

    }
}
