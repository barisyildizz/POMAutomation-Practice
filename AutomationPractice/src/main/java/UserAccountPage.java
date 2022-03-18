import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAccountPage extends BasePage {

    private By homeButtonLocator = By.xpath("//i[@class='icon-home']");


    public UserAccountPage(WebDriver webDriver){
     super(webDriver);
        // sayfanın yüklenmesini bekle
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeButtonLocator));
    }


    public void navigateToHomePage() {
        WebElement homelink = driver.findElement(homeButtonLocator);
        homelink.click();
    }
}
