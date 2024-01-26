package starter.SauceDemoV4;

import net.serenitybdd.core.pages.PageObject;

public class CheckoutCompletePage extends PageObject {

    public String getCompleteHeader(){
        return find(".complete-header").getText();
    }
}
