package casestudy.pages;

import casestudy.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = ".title-wrapper.title>span")
    public WebElement resultText;

    @FindBy(css = "h1.search-title")
    public WebElement searchTitle;


    public void verifyResult(String searchText) {
        Assert.assertTrue(resultText.getText().contains("Results for"));
        Assert.assertEquals("\"" + searchText + "\"", searchTitle.getText());

    }
}
