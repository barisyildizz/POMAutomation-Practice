import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    static WebDriver driver;
    static WebDriverWait wait;

    public BasePage(WebDriver webDriver){
        driver = webDriver;
        wait = new WebDriverWait(driver,10);
    }

}
