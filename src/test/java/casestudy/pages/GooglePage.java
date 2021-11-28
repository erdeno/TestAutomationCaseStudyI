package casestudy.pages;

import casestudy.config.PropertiesFile;
import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GooglePage {
    public GooglePage() { PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement emailField;

    @FindBy(xpath = "//input[@type=\"password\"]")
    WebElement passwordField;

    @FindBy(xpath = "//div[text()='Başka bir hesap kullan']")
    WebElement anotherAccount;

    String email = PropertiesFile.getProperty("googleEmail");
    String password = PropertiesFile.getProperty("googlePassword");
    String bestBuyEmail = PropertiesFile.getProperty("bestBuyEmail");
    String bestBuyPassword = PropertiesFile.getProperty("bestBuyPassword");


    public void login() {
        anotherAccount.click();
        Helper.waitFor(2);
        emailField.sendKeys(email, Keys.ENTER);
        Helper.waitFor(2);
        passwordField.sendKeys(password, Keys.ENTER);
        Helper.waitFor(1);
    }
}
