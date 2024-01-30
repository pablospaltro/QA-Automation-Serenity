package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutStepOnePage extends PageObject {

    public String getHeading(){
        return find(".title").getText();
    }
}
