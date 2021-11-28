package casestudy.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Helper {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyTitle(String title) {
        String pageTitle = Driver.get().getTitle();
        Assert.assertEquals(title, pageTitle);
    }

    public static void searchWith(String search) {
        WebElement searchInput = Driver.get().findElement(By.id("gh-search-input"));
        searchInput.click();
        searchInput.sendKeys(search);
        Driver.get().findElement(By.cssSelector(".header-search-icon")).click();
    }

    public static void openDropdown(String dropdown) {
        String locator = "//span[text()='" + dropdown + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }

    public static void clickSubHamburgerMenu(String menuText) {
        String locator = "//button[text()='" + menuText + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public static void switchLastTab() {
        String originTab = Driver.get().getWindowHandle();
        Set<String> allTabs = Driver.get().getWindowHandles();

        for(String tab: allTabs) {
            if (!originTab.equals(tab)) {
                Driver.get().switchTo().window(tab);
            }
        }
    }

    public static void openNewTab() {
        ((JavascriptExecutor) Driver.get()).executeScript("window.open()");
    }

    public static void openNewTabWith(String link) {
        String script = "window.open('" + link + "')";
        ((JavascriptExecutor) Driver.get()).executeScript(script);

    }
}
