package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartPage extends PageObject {

    public String getHeading(){
        return find(".title").getText();
    }
}
