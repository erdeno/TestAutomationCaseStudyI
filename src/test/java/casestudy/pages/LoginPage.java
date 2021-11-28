package casestudy.pages;

import casestudy.config.PropertiesFile;
import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    PropertiesFile cfg = new PropertiesFile();

    @FindBy(id = "fld-e")
    WebElement loginField;

    @FindBy(id = "fld-p1")
    WebElement passwordField;

    @FindBy(css = ".c-button.undefined")
    WebElement googleButton;

    public void login() {
        String email = PropertiesFile.getProperty("bestBuyEmail");
        String password = PropertiesFile.getProperty("bestBuyPassword");
        loginField.sendKeys(email);
        passwordField.sendKeys(password, Keys.ENTER);

    }

    public void clickGoogle() {
        googleButton.click();
        Helper.switchLastTab();
    }
}
