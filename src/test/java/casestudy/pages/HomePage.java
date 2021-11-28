package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css = "[alt='United States']")
    public WebElement countryIcon;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;

    @FindBy(className = "hamburger-menu-button")
    public WebElement hamburgerMenu;

    @FindBy(id = "gh-search-input")
    public WebElement searchInput;

    @FindBy(css = ".header-search-icon")
    public WebElement searchButton;

    @FindBy(css = ".plButton-label.v-ellipsis")
    public WebElement userDropdown;

    @FindBy(css = ".account-menu-logout-button")
    public WebElement logoutButton;

    public void chooseUS() { countryIcon.click(); }

    public void closeModal() {
        closeButton.click();
    }
    public void searchFor(String searchKey) {
        Helper.searchWith(searchKey);
    }

    public void openDropdown(String dropdown) {
        Helper.openDropdown(dropdown);
    }

    public void openSubmenu(String submenu) {
        Helper.clickWithLinkText(submenu);
    }

    public void clickTheMenu() {
        hamburgerMenu.click();
    }

    public void clickSubHamburgerMenu(String subHamburger) {
        Helper.clickSubHamburgerMenu(subHamburger);
    }

    public void verifyLogoutButton() {
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    public void openUserDropdown() {
        userDropdown.click();
        Helper.waitFor(2);
    }

    public void logout() {
        logoutButton.click();
    }
}
