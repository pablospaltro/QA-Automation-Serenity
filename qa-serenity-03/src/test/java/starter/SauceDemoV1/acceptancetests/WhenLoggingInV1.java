package starter.SauceDemoV1.acceptancetests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.SauceDemoV1.actions.navigation.NavigateTo;
import starter.SauceDemoV1.actions.search.LogIn;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingInV1 {

    /*
    first approach to a login test
    using the Serenity BDD template
     */

    @CastMember
    Actor actor;

    // if login succeeds, should be able to get to the inventory page:
    @Test
    @DisplayName("Should be able to login")
    void loginUsingCredentials(){
        actor.attemptsTo(
                NavigateTo.theLoginPage(),
                LogIn.as("standard_user","secret_sauce"),
                Ensure.that(TheWebPage.currentUrl()).containsIgnoringCase("inventory")
        );
    }
}
