package Domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Domaci5 {

    //Domaci Zadatak 2:
    //Otici na sajt Herkouapp(https://the-internet.herokuapp.com/) i napisati sto vise test case-eva (Vas izbor sta cete testirati).

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test (priority = 10)
    public void ABTestControlPageIsOpen() {
       WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
       abTesting.click();
       String expectedURL = "https://the-internet.herokuapp.com/abtest";
       Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }
    @Test (priority = 20)
    public void addRemoveElementsPageIsOpen() {
        WebElement addRemove = driver.findElement(By.linkText("Add/Remove Elements"));
        addRemove.click();
        WebElement addElementButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        addElementButton.click();
        WebElement delete = driver.findElement(By.className("added-manually"));
        delete.click();
        String expectedURL = "https://the-internet.herokuapp.com/add_remove_elements/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }
    @Test (priority = 30)
    public void dropdownPageIsOpen () {
        WebElement dropDownPage = driver.findElement(By.linkText("Dropdown"));
        dropDownPage.click();
        String expectedURL = "https://the-internet.herokuapp.com/dropdown";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Assert.assertTrue(dropDown.isDisplayed());
        WebElement title = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        Assert.assertTrue(title.isDisplayed());
    }
    @Test (priority = 40)
    public void InputsPageIsOpen() {
        WebElement inputsPage = driver.findElement(By.linkText("Inputs"));
        inputsPage.click();
        String expectedURL = "https://the-internet.herokuapp.com/inputs";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        WebElement title = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/h3"));
        Assert.assertTrue(title.isDisplayed());
        WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input"));
        Assert.assertTrue(inputField.isDisplayed());
    }
    @Test (priority = 50)
    public void redirectLinkPageIsOpen() {
        WebElement redirectPage = driver.findElement(By.linkText("Redirect Link"));
        redirectPage.click();
        String expectedURL = "https://the-internet.herokuapp.com/redirector";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        WebElement title = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        Assert.assertTrue(title.isDisplayed());
        WebElement link = driver.findElement(By.id("redirect"));
        Assert.assertTrue(link.isDisplayed());
        Assert.assertTrue(link.isEnabled());
    }
    @Test (priority = 60)
    public void CheckboxesPageIsOpen() {
        WebElement checkboxesPage = driver.findElement(By.linkText("Checkboxes"));
        checkboxesPage.click();
        String expectedURL = "https://the-internet.herokuapp.com/checkboxes";
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        WebElement title = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        Assert.assertTrue(title.isDisplayed());
        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isDisplayed());
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[type = checkbox]"));
        Assert.assertTrue(checkbox2.isDisplayed());
        checkbox2.click();


    }


}
