import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage{


    private By signInLinkLocator = By.cssSelector("a.login");
    private static By productLinksLocator = By.cssSelector("a.product-name");


    public HomePage(WebDriver webDriver){
        super(webDriver);
        // sayfanın yüklenmesini bekle
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInLinkLocator));
    }

    public static List<WebElement> getProductNameLinks() {
        wait.until(ExpectedConditions.elementToBeClickable(productLinksLocator));
        List<WebElement> productLinks = driver.findElements(productLinksLocator);
        return productLinks;
    }


    public void clickSignInButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInLinkLocator));
        WebElement signInLink = driver.findElement(signInLinkLocator);
        signInLink.click();
    }
}
