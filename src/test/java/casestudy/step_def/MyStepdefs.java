package casestudy.step_def;

import casestudy.config.PropertiesFile;
import casestudy.pages.*;
import casestudy.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homepage = new HomePage();
    SearchPage searchpage = new SearchPage();
    LoginPage loginpage = new LoginPage();
    MyAccountPage myaccountpage = new MyAccountPage();
    GooglePage googlepage = new GooglePage();
    CategoryPage categorypage = new CategoryPage();
    ProductDetailPage productdetailpage = new ProductDetailPage();

    @Given("Homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @Given("I close the pop-up")
    public void iCloseThePopUp() {
        homepage.closeModal();
    }

    @When("Verify page title {string}")
    public void verifyPageTitle(String title) {
        Helper.verifyTitle(title);
    }

    @When("Search for {string}")
    public void searchFor(String searchText) {
        homepage.searchFor(searchText);
    }

    @Then("Verify search results for {string}")
    public void verifySearchResultsFor(String searchText) {
        searchpage.verifyResult(searchText);
    }

    @And("I open {string} dropdown menu")
    public void iOpenDropdownMenu(String dropdown) {
        homepage.openDropdown(dropdown);
    }

    @When("I choose {string} submenu")
    public void iChooseSubmenu(String submenu) {
        homepage.openSubmenu(submenu);
    }

    @When("Login with credentials")
    public void loginWithCredentials() {
        loginpage.login();
    }

    @Then("Verify welcome back")
    public void verifyWelcomeBack() {
        myaccountpage.verifyWelcome();
    }

    @When("Login with google")
    public void loginWithGoogle() {
        loginpage.clickGoogle();
        googlepage.login();
    }


    @And("I click the menu")
    public void iClickTheMenu() {
        homepage.clickTheMenu();
    }

    @And("I choose {string} menu item")
    public void iChooseMenuItem(String subHamburger) {
        homepage.clickSubHamburgerMenu(subHamburger);
    }

    @When("I search for {string} brand")
    public void iSearchForBrand(String searchBrand) {
        categorypage.searchForBrand(searchBrand);
        Helper.waitFor(2);
    }

    @And("I click the Item Number {int}")
    public void iClickTheNthItem(Integer num) {
        categorypage.clickTheNthItem(num);
    }

    @When("I verify product detail page {string}")
    public void iVerifyProductDetailPage(String brandName) {
        productdetailpage.verifyProductDetailPage(brandName);
    }

    @When("I click the save button")
    public void iClickTheSaveButton() {
        productdetailpage.clickSaveButton();
    }

    @Then("Verify saved item {string} is on the list")
    public void verifySavedItemIsOnTheList(String productName) {
        productdetailpage.verifySavedItem(productName);
    }

    @When("I open new tab")
    public void iOpenNewTab() {
        Helper.openNewTab();
    }

    @When("I open {string} in new tab")
    public void iOpenInNewTab(String link) {
        Helper.openNewTabWith(link);
    }

    @Then("Verify user logged in")
    public void verifyUserLoggedIn() {
        homepage.verifyLogoutButton();
    }

    @And("I open user dropdown menu")
    public void iOpenUserDropdownMenu() {
        homepage.openUserDropdown();
    }

    @And("I move to new tab")
    public void iMoveToNewTab() {
        Helper.switchLastTab();
    }

    @When("I open homepage in new tab")
    public void iOpenHomepageInNewTab() {
        String link = PropertiesFile.getProperty("baseUrl");
        Helper.openNewTabWith(link);
    }

    @And("I logged out")
    public void iLoggedOut() {
        homepage.logout();
    }
}
