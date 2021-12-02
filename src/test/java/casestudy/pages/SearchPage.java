package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AbstractClass{
    public SearchPage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = ".title-wrapper.title>span")
    public WebElement resultText;

    @FindBy(css = "h1.search-title")
    public WebElement searchTitle;

    @FindBy(xpath = "//input[@id='parent_tvscreensizeplus_facet-33\"-44\"-0']")
    public WebElement tvSize;

    @FindBy(className = "go-to-cart-button")
    public WebElement goToCartButton;

    @FindBy(xpath = "(//div[@class='priceView-hero-price priceView-customer-price'])[2]//span[1]")
    public WebElement itemPrice;

    @FindBy(css = ".sub-total.v-fw-medium")
    public WebElement subTotal;


    public void verifyResult(String searchText) {
        Assert.assertTrue(resultText.getText().contains("Results for"));
        Assert.assertEquals("\"" + searchText + "\"", searchTitle.getText());

    }

    public void clickTvSize() {
        tvSize.click();
    }

    public void addToCart(int num) {
        String path = "(//div[@class='sku-list-item-button'])[" +num + "]";
        Helper.waitFor(3);
        Driver.get().findElement(By.xpath(path)).click();

    }

    public void goToCart() {
        goToCartButton.click();
    }

    public void verifySubtotal() {
        Helper.waitFor(5);
        Assert.assertEquals(itemPrice.getText(), subTotal.getText());
    }
}
