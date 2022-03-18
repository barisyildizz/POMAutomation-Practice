import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BaseTest{

   public static WebDriver driver;
@Test
   public static void main(String[] args) throws InterruptedException {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      driver.get("http://automationpractice.com/");
      driver.manage().window().maximize();

      //giriş yapma sayfasına git
      HomePage homepage = new HomePage(driver);
      homepage.clickSignInButton();

      //giriş yap
      LoginPage loginPage = new LoginPage(driver);
      loginPage.setEmailAddress("baris122@test.com");
      loginPage.setPassword("12345");
      loginPage.clickSignInButton();

      //anasayfaya git
      UserAccountPage userAccountPage = new UserAccountPage(driver);
      userAccountPage.navigateToHomePage();

      //ilk ürünü seç
      List<WebElement> productNameLinks = HomePage.getProductNameLinks();
      productNameLinks.get(0).click();

      //ürünü sepete ekle
      ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
      productDetailsPage.clickAddToCartButton();

      //ödemeye geç
      AddToCartConfirmationPopup addToCartConfirmationPopup = new AddToCartConfirmationPopup(driver);
      addToCartConfirmationPopup.ClickProceedToCheckOut();

      //sepette 1 ürün olduğunu doğrula
      ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage(driver);
      int numProducts = shoppingCartSummaryPage.getQuantity();
      Assert.assertEquals(numProducts,1,"Olması gereken ürün adedi 1");

      Thread.sleep(2000);
      driver.quit();
}




}
