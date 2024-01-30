package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/checkout-complete.html")
public class CheckoutCompletePage extends PageObject {

    public String getCompleteHeader(){
        return find(".complete-header").getText();
    }
}
