package starter.SauceDemoV4;

import net.serenitybdd.core.pages.PageObject;

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
}
