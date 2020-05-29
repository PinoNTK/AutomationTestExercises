package first_serenity.features.search;

import first_serenity.tasks.OpenCucumberPage;
import first_serenity.ui.CucumberStudioPage;
import first_serenity.ui.Tiki;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.aspectj.apache.bcel.classfile.Module;
//import org.jruby.RubyFileTest$FileTestFileMethods$INVOKER$s$1$0$blockdev_p;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import first_serenity.tasks.OpenTheApplication;
import first_serenity.tasks.OpenCucumberPage;
import first_serenity.tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class LoginCucumberPage {

    Actor anna = Actor.named("Anna");
    Actor klaus = Actor.named("Klaus");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Steps
    OpenCucumberPage openCucumberPage;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Before
    public void klausCanBrowseTheWeb() {
        klaus.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {
        givenThat(anna).wasAbleTo(openTheApplication);

        when(anna).attemptsTo(Search.forTheTerm("BDD In Action"));

        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

    }

    @Test
    public void login_into_cucumber_page_should_show_the_project_page() {
        givenThat(klaus).wasAbleTo(openCucumberPage);
        when(klaus).attemptsTo(
                Enter.theValue("kien678969@gmail.com").into(CucumberStudioPage.EmailBox),
                Enter.theValue("babysnow96").into(CucumberStudioPage.PasswordBox),
                Hit.the(Keys.ENTER).keyIn(CucumberStudioPage.PasswordBox)
        );
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("CucumberStudio | Projects list"))));
    }
}