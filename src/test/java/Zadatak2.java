import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
         /*
        for(int i = 0; i < 5;i++) {
        js.executeScript("window.open()");
         */

        ArrayList<String> lista = new ArrayList<>(driver.getWindowHandles());
        System.out.println(lista);

        driver.switchTo().window(lista.get(1));
        driver.get("https://www.joberty.com");
        driver.switchTo().window(lista.get(2));
        driver.get("https://www.instagram.com");
        driver.switchTo().window(lista.get(3));
        driver.get("https://www.facebook.com");
        driver.switchTo().window(lista.get(4));
        driver.get("https://github.com");
        driver.switchTo().window(lista.get(5));
        driver.get("https://www.youtube.com");

        driver.close();
        driver.switchTo().window(lista.get(4));
        driver.close();
        driver.switchTo().window(lista.get(3));
        driver.close();
        driver.switchTo().window(lista.get(2));
        driver.close();
        driver.switchTo().window(lista.get(1));
        driver.close();
        //for petlja za zatvaranje tabova
        for (int i = 0; i < lista.size();i++) {
            driver.switchTo().window(lista.get(i));
            if (!driver.getCurrentUrl().equals("https://www.google.com/")) {
                driver.close();
            }
        }


    }
}
