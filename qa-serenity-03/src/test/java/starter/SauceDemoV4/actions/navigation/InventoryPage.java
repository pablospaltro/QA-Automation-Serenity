package starter.SauceDemoV4.actions.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    /*
    using a Serenity method
    instead of a web driver action
    because extends PageObject
     */

    public String getHeading(){
        return find(".title").getText();
    }
    // writing '$' instead of 'find' also works

    public String getAmountOfProductsAddedInShoppingCart(){
        return find(".shopping_cart_badge").getText();
    }
}
