package first_serenity.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://studio.cucumber.io/users/sign_in")
public class CucumberStudioPage extends PageObject {
    public static Target EmailBox = Target.the("Email Box").located(By.cssSelector("input[type=\"email\"]"));
    public static Target PasswordBox = Target.the("Password Box").located(By.cssSelector("input[type=\"password\"]"));
}
