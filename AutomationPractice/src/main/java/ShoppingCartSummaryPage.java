import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartSummaryPage extends BasePage{

    private By quantityLocator = By.id("summary_products_quantity");

    public ShoppingCartSummaryPage(WebDriver webDriver){
       super(webDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(quantityLocator));
    }

    public int getQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(quantityLocator));
        String numProductsLabelText = driver.findElement(quantityLocator).getText();
        int spaceLocation = numProductsLabelText.indexOf(" ");
        int numProducts = Integer.parseInt(numProductsLabelText.substring(0,spaceLocation));
        return numProducts;
    }
}
