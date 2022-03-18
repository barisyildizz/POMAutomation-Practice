import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends BasePage{

    private By addtoCartButtonLocator = By.cssSelector("button[name='Submit'] span");

    public ProductDetailsPage(WebDriver webDriver){
        super(webDriver);
    }

    public void clickAddToCartButton() {
       wait.until(ExpectedConditions.elementToBeClickable(addtoCartButtonLocator));
        WebElement addtoCartButton = driver.findElement(addtoCartButtonLocator);
        addtoCartButton.click();
    }
}
