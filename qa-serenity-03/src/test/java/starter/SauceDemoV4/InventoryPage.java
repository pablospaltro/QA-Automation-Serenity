package starter.SauceDemoV4;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

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

    public Target getShoppingCart() {
        return Target.the("Shopping cart").located(By.className("shoping_cart_badge"));
    }
}
