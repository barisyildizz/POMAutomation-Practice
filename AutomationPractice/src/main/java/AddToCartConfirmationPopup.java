import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartConfirmationPopup extends BasePage{

    private By proceedToCheckOutButtonLocator = By.cssSelector("a[title='Proceed to checkout'] span");

    public AddToCartConfirmationPopup(WebDriver webDriver){
        super(webDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOutButtonLocator));
    }

    public void ClickProceedToCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOutButtonLocator));
        WebElement proceedToCheckOutButton = driver.findElement(proceedToCheckOutButtonLocator);
        proceedToCheckOutButton.click();
    }
}
