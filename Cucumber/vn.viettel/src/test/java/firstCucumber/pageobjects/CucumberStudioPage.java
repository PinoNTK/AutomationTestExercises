package firstCucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CucumberStudioPage {
    @FindBy(css = "input[type=\"email\"]")
    public WebElement txtEmail;

    @FindBy(css = "input[type=\"password\"]")
    public WebElement txtPassword;

    public CucumberStudioPage(WebDriver driver) {
        driver.get("https://studio.cucumber.io/users/sign_in");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
}
