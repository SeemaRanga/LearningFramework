

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.basepackage.BaseClass;
import com.elementRepository.HomePage;
import com.elementRepository.ProductDetailsPage;



public class TestAddProductToWishlist extends BaseClass{
	
	@Test
	public void addToWishList() {
		String loginPageLink = "https://demowebshop.tricentis.com/login";
		String userName = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";
		String productLink = "https://demowebshop.tricentis.com/25-virtual-gift-card";
		String message = "The product has been added to your ";

		
		
		HomePage home = new HomePage(driver);
		// user clicked on add to cart button
		home.getVirtualGiftCardLink().click();
		softAssert.assertEquals(driver.getCurrentUrl(), productLink, "Product page is not displayed");
		Reporter.log("Products page is displayed", true);

		// user entered data into name text field
		ProductDetailsPage details = new ProductDetailsPage(driver);
		details.getRecipientNameTextField().sendKeys("Smith");
		String actualRecipientName = details.getRecipientEmailTextField().getAttribute("value");
		Reporter.log("User entered correct recipient name", true);

		// user entered data into email text field
		mailto:details.getRecipientEmailTextField().sendKeys("smith@gmail.com");
		String actualEmail = details.getRecipientEmailTextField().getAttribute("value");
		Reporter.log("User entered correct recipient email", true);

		// user clicked on add to wishlist
		details.getAddToWishListButton().click();
		boolean actualResult = details.getMessage().isDisplayed();
		softAssert.assertEquals(actualResult, true, "Product was not added to wislist");
		Reporter.log("User added a product to wish list button", true);
	
}

	
}
