package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.SauceDemoV1.actions.navigation.SauceDemoHomePage;

public class NavigateTo {

    public static Performable theHomePage() {
        return Task.where("{0} opens the SauceDemo home page",
                Open.browserOn().the(HomePage.class));
    }

    public static Performable theInventoryPage() {
        return Task.where("{0} opens the SauceDemo inventory page",
                Open.browserOn().the(InventoryPage.class));
    }

    public static Performable theCheckoutStepOnePage() {
        return Task.where("{0} opens the SauceDemo checkout-step-one page",
                Open.browserOn().the(CheckoutStepOnePage.class));
    }

    public static Performable theCheckoutStepTwoPage() {
        return Task.where("{0} opens the SauceDemo checkout-step-two page",
                Open.browserOn().the(CheckoutStepTwoPage.class));
    }
    public static Performable theCheckoutCompletePage() {
        return Task.where("{0} opens the SauceDemo checkout-complete page",
                Open.browserOn().the(CheckoutCompletePage.class));
    }
    public static Performable theCartPage() {
        return Task.where("{0} opens the SauceDemo cart page",
                Open.browserOn().the(CartPage.class));
    }


}
