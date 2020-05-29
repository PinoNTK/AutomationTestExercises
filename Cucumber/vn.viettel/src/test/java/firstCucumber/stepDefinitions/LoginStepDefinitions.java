package firstCucumber.stepDefinitions;

import firstCucumber.DriverManager;
import firstCucumber.pageobjects.CucumberStudioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    WebDriver driver;
    CucumberStudioPage cucumberStudioPage;

    public LoginStepDefinitions() {
        this.driver = DriverManager.getDriver();
    }

    @Given("The login screen is displayed on browser")
    public void theLoginScreenIsDisplayedOnBrowser() {
        this.cucumberStudioPage = new CucumberStudioPage(this.driver);
    }

    @When("A user attempt to login with his account is {string} and {string}")
    public void aUserAttemptToLoginWithHisAccountIsAnd(String email, String password) {
        this.cucumberStudioPage.txtEmail.sendKeys(email);
        this.cucumberStudioPage.txtPassword.sendKeys(password);
        this.cucumberStudioPage.txtPassword.sendKeys(Keys.ENTER);
    }

    @Then("The project list page will be shown")
    public void theProjectListPageWillBeShown() {
        Assert.assertEquals(this.driver.getCurrentUrl(), "https://studio.cucumber.io/projects");
    }
}
