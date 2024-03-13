package com.basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Books')]")
private WebElement booksLink;

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Computers')]")
private WebElement computerLink;

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Electronics')]")
private WebElement electronicsLink;

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Apparel & Shoes')]")
private WebElement apparelShoesLink;

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Digital downloads')]")
private WebElement digitalDownloadsLink;

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Jewelry')]")
private WebElement jewelryLink;

public WebElement getBooksLink() {
	return booksLink;
}

public WebElement getComputerLinks() {
	return computerLink;
}

public WebElement getElectronicsLink() {
	return electronicsLink;
}

public WebElement getApparelShoesLink() {
	return apparelShoesLink;
}

public WebElement getDigitalDownloadsLink() {
	return digitalDownloadsLink;
}

public WebElement getJewelryLinks() {
	return jewelryLink;
}

public WebElement getGiftCardsLink() {
	return giftCardsLink;
}

@FindBy(xpath="//ul[@class='top-menu']/li/a[contains(text(),'Gift Cards')]")
private WebElement giftCardsLink;

@FindBy(linkText="Register")
private WebElement registerLink;
@FindBy(linkText="Log in")
private WebElement loginLink;
@FindBy(linkText="Shopping cart")
private WebElement shoppingCartLink;
@FindBy(linkText="Wishlist")
private WebElement wishlistLink;
@FindBy(name="q")
private WebElement searchTextField;

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}

public WebElement getWishlistLink() {
	return wishlistLink;
}

public WebElement getSearchTextField() {
	return searchTextField;
}
@FindBy(linkText="Log in")
private WebElement Loginlink;

public WebElement getLoginlink() {
	return loginLink;
}

@FindBy(linkText="Log out")
private WebElement logoutLink;

public WebElement getLogoutLink() {
//	 TODO Auto-generated method stub
	return logoutLink;
}
}





