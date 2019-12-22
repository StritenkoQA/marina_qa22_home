import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWiki {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

    }


    @Test
    public void logInWikipedia() {
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("#js-link-box-en")).click();
        driver.findElement(By.id("pt-login")).click();
        driver.findElement(By.id("wpName1")).click();
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("stritenko");
        driver.findElement(By.id("wpPassword1")).sendKeys("1qazxsw2");
        driver.findElement(By.id("wpLoginAttempt")).click();


    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
