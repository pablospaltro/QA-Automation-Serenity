package starter.SauceDemoV1.actions.navigation;

import starter.SauceDemoV1.actions.navigation.SauceDemoHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the SauceDemo home page",
                Open.browserOn().the(SauceDemoHomePage.class));
    }

    public static Performable theLoginPage() {
        return Task.where("{0} opens the SauceDemo login page",
                Open.browserOn().the(SauceDemoHomePage.class));
    }
}
