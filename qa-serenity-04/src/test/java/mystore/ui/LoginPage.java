package mystore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    /*
    'data-qa' elements (data/testing id) are useful because they're not
    dependent of any other element in the DOM of the page
     */

    public static final Target EMAIL = Target.the("Email input")
            .located(By.cssSelector("[data-qa='login-email']"));

    public static final Target PASSWORD = Target.the("Password input")
            .located(By.cssSelector("[data-qa='login-password']"));

    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.cssSelector("[data-qa='login-button']"));
}
