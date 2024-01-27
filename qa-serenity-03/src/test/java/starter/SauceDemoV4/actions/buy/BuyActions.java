package starter.SauceDemoV4.actions.buy;

import net.serenitybdd.core.steps.UIInteractions;
import starter.SauceDemoV4.actions.login.User;

public class BuyActions extends UIInteractions {

    public void clickOnWebElement(String element){
        find(element).click();
    }

    // for now selecting a specific product (then it should be random):
    public void addsProductToCart(){
        clickOnWebElement("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']");
    }

    public void goesToShoppingCartContainer(){
        clickOnWebElement(".shopping_cart_container");
    }

    public void clicksCheckout(){
        clickOnWebElement("[data-test='checkout']");
    }

    public void completesCheckoutInformationAs(User user){

        find("[data-test='firstName']").sendKeys(user.getUsername());
        find("[data-test='lastName']").sendKeys(user.getPassword());
        find("[data-test='postalCode']").sendKeys(user.getPostalCode());

        clickOnWebElement("[data-test='continue']");
    }

    public void clicksOnFinish(){
        clickOnWebElement("[data-test='finish']");
    }
}
