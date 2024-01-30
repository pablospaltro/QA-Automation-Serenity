package starter.SauceDemoV4.actions.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {

    /*
    using Serenity methods instead of web driver actions
    because extends UIInteractions
     */
    @Step("Perform login as {0}")
    public void as(User user){
        openUrl("https://saucedemo.com");

        find("[data-test='username']").sendKeys(user.getUsername());
        find("[data-test='password']").sendKeys(user.getPassword());
        find("[data-test='login-button']").click();
    }
}
