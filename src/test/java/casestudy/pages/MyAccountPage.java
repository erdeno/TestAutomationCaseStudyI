package casestudy.pages;

import casestudy.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "welcome-banner__welcome-back")
    WebElement welcomeText;

    public void verifyWelcome() {
        Assert.assertTrue(welcomeText.getText().contains("Welcome"));
    }
}
