package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
    public CategoryPage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = ".tb-input.search-bar-control")
    WebElement brandSearchInput;

    @FindBy(className = "search-bar-list")
    WebElement suggestion;


    public void searchForBrand(String searchBrand) {

        brandSearchInput.sendKeys(searchBrand);
        suggestion.click();
        Helper.waitFor(1);
    }


    public void clickTheNthItem(Integer num) {
        String path = "//li[@class=\"sku-item\"][" + num + "]//a";
        Driver.get().findElement(By.xpath(path)).click();

    }
}
