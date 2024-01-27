package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.core.pages.PageObject;

public class CheckoutStepOnePage extends PageObject {

    public String getHeading(){
        return find(".title").getText();
    }
}
