import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[] args) {

        By search = By.cssSelector("#simpleSearch");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ru.wikipedia.org/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(d -> d.findElement(search)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(search)).sendKeys("Ubisoft");


    }
}
