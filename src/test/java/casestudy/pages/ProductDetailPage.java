package casestudy.pages;

import casestudy.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    public ProductDetailPage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = ".c-button-link.c-button")
    WebElement brandLink;

    @FindBy(className = "save-for-later-save")
    WebElement saveButton;

    @FindBy(css = "div.sku-card-product-title>a")
    WebElement productTitle;


    public void verifyProductDetailPage(String brandName) {
        Assert.assertEquals(brandName, brandLink.getText());
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void verifySavedItem(String productName) {
        Assert.assertTrue(productTitle.getText().contains(productName));
    }
}
