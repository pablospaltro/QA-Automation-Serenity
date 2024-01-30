package starter.SauceDemoV4.actions.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.SauceDemoV4.actions.search.InputForm;

public class LogIn {

    public static Performable as(String userName, String password) {
        return Task.where("{0} logins with username '" + userName + "' and password " + password + "'",
                Enter.theValue(userName)
                        .into(InputForm.USERNAME_FORM_INPUT),
                Enter.theValue(password)
                        .into(InputForm.PASSWORD_FORM_INPUT)
                        .thenHit(Keys.ENTER)
        );
    }
}
